package org.framestudy.springmvcanno.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class HouseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6203126864456488639L;

	private Long id;
	private String houseNo;
	@NotNull(message="房子地址提交项不能为空！")
	@NotBlank(message="房子地址内容不为空！")
	private String houseAddress;
	public HouseBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	@Override
	public String toString() {
		return "HouseBean [id=" + id + ", houseNo=" + houseNo + ", houseAddress=" + houseAddress + "]";
	}
}
