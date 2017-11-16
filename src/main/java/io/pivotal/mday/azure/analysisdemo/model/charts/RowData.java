package io.pivotal.mday.azure.analysisdemo.model.charts;

public class RowData {
	private String v;
	private String f;
	private String p;
	
	public RowData () {}
	public RowData (String data) {
		this.v = data;
		this.f = data;
	}
	
	public RowData (Double data) {
		this.v = data.toString();
		this.f = data.toString();
	}
	
	public RowData (String data, String p) {
		this.v = data;
		this.f = data;
		this.p = p;
	}
	
	public RowData (Double data, String p) {
		this.v = data.toString();
		this.f = data.toString();
		this.p = p;
	}
	
	
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}
	public String getF() {
		return f;
	}
	public void setF(String f) {
		this.f = f;
	}
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	
}
