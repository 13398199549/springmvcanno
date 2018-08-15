package org.framestudy.springmvcanno.bean;

import java.io.Serializable;

public class RoleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -84629306854917440L;

	private Long id;
	private String roleName;
	public RoleBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	@Override
	public String toString() {
		return "RoleBean [id=" + id + ", roleName=" + roleName + "]";
	}
}
