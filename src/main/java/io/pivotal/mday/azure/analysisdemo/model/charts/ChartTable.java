package io.pivotal.mday.azure.analysisdemo.model.charts;

import java.util.ArrayList;
import java.util.List;

public class ChartTable {
	public List<Col> cols;
	public List<Row> rows;
	
	public ChartTable () {
		this.rows = new ArrayList<>();
		this.cols = new ArrayList<>();
	}
	
	public List<Col> getCols() {
		return cols;
	}
	public void setCols(List<Col> cols) {
		this.cols = cols;
	}
	public List<Row> getRows() {
		return rows;
	}
	public void setRows(List<Row> rows) {
		this.rows = rows;
	}
	
}
