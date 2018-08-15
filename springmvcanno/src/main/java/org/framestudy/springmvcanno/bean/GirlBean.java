package org.framestudy.springmvcanno.bean;

public class GirlBean {

	private Long id;
	private String girlName;
	public GirlBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGirlName() {
		return girlName;
	}
	public void setGirlName(String girlName) {
		this.girlName = girlName;
	}
	@Override
	public String toString() {
		return "GirlBean [id=" + id + ", girlName=" + girlName + "]";
	}
}
