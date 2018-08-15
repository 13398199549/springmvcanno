package org.framestudy.springmvcanno.bean;

public class MessagerBean {

	private Boolean status;
	private String information;
	public MessagerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MessagerBean(Boolean status, String information) {
		super();
		this.status = status;
		this.information = information;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	@Override
	public String toString() {
		return "MessgerBean [status=" + status + ", information=" + information + "]";
	}
}
