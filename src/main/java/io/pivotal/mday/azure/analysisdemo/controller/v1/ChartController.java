package io.pivotal.mday.azure.analysisdemo.controller.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.mday.azure.analysisdemo.model.charts.ChartTable;
import io.pivotal.mday.azure.analysisdemo.model.charts.Col;
import io.pivotal.mday.azure.analysisdemo.model.charts.Row;
import io.pivotal.mday.azure.analysisdemo.model.charts.RowData;
import io.pivotal.mday.azure.analysisdemo.model.customer.CustomerMessage;
import io.pivotal.mday.azure.analysisdemo.repo.CustomerMessageRepo;

@RequestMapping("/v1/chart")
@RestController
public class ChartController {

	private CustomerMessageRepo repo;

	public ChartController(CustomerMessageRepo repo) {
		this.repo = repo;
	}

	@GetMapping("/sentiment")
	public ChartTable getGoogleChartForCustomers() {
		List<Row> rows = new ArrayList<>(100);
		ChartTable table = new ChartTable();
		table.setCols(getSentimentCols());
		table.setRows(rows);

		for (CustomerMessage m : repo.findAllByOrderByDate()) {
			Row row = new Row();
			row.add(new RowData(m.getDate().toString()));
			final Integer sentimentPercent = (int) (m.getSentiment() * 100);
			row.add(new RowData(sentimentPercent.toString()));
			rows.add(row);
		}
		return table;
	}

	private List<Col> getSentimentCols() {
		return new ArrayList<Col>(
				Arrays.asList(new Col[] { new Col("A", "Date", "string"), new Col("B", "Sentiment", "number") }));
	}

	@GetMapping("/messages")
	public ChartTable getMessageTable() {
		List<Row> rows = new ArrayList<>(100);
		ChartTable table = new ChartTable();
		table.setCols(getMessageCols());
		table.setRows(rows);

		for (CustomerMessage m : repo.findAllByOrderByDate()) {
			Row row = new Row();
			row.add(new RowData(m.getDate().toString()));
			row.add(new RowData(m.getName()));
			row.add(new RowData(m.getMessage()));
			final Integer sentimentPercent = (int) (m.getSentiment() * 100);
			row.add(new RowData(sentimentPercent.toString()));
			rows.add(row);
		}
		return table;
	}

	private List<Col> getMessageCols() {
		return new ArrayList<Col>(
				Arrays.asList(new Col[] { new Col("A", "Date", "string"), new Col("B", "Name", "string"),
						new Col("C", "Message", "string"), new Col("D", "Sentiment", "number") }));
	}

}
