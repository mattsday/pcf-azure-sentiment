package io.pivotal.mday.azure.analysisdemo.model.charts;

public class Col {
	private String id;
	private String label;
	private String type;
	
	public Col(String id, String label, String type) {
		super();
		this.id = id;
		this.label = label;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
