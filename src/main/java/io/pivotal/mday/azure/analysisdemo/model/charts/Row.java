package io.pivotal.mday.azure.analysisdemo.model.charts;

import java.util.ArrayList;
import java.util.List;

public class Row {
	private List<RowData> c;
	
	public Row () {
		this.c = new ArrayList<>();
	}
	
	public void add (RowData d) {
		this.c.add(d);
	}

	public List<RowData> getC() {
		return c;
	}

	public void setC(ArrayList<RowData> c) {
		this.c = c;
	}
	
	
}
