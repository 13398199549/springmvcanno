package org.framestudy.springmvcanno.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * hibernate 验证框架官方网址(注解详细，请查看2.3.1)
 *  http://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#section-builtin-constraints
 * @author puxubo
 *
 */
@JsonFilter(value="userFilter")
public class UserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4562874327734891442L;
	
	private Long id;
	
	@NotNull(message="用户名提交项不能为空！")
	@NotBlank(message="用户名内容不为空！")
	@Size(min=6,max=18,message="用户名长度必须控制在6-18位之间！")
	private String userName;
	
	@NotNull(message="登录名提交项不能为空！")
	@NotBlank(message="登录名内容不为空！")
	@Size(min=6,max=18,message="登录名长度必须控制在6-18位之间！")
	@Pattern(regexp="[^\\u4e00-\\u9fa5]+",message="登录名不能是中文！")
	private String loginName;
	
	@NotNull(message="密码提交项不能为空！")
	@NotBlank(message="密码内容不为空！")
	@Size(min=6,max=18,message="密码长度必须控制在6-18位之间！")
	private String password;
	
	@NotNull(message="年龄提交项不能为空！")
	@Min(value=18L,message="你的年龄小于18岁，请主动离开！")
	@Max(value=60L,message="您的年龄过大，不适合观看本站点内容，请主动离开！")
	private Integer age;
	
	private Integer gender;
	
	@AssertTrue(message="不符合未婚要求，请主动离开！")
	private Boolean marry;
	
	@Digits(integer=7,fraction=2,message="我们就一屌丝网址，高富帅滚！")
	private Double income;
	
	@Size(min=1,max=3,message="个人兴趣爱好，至少应该有1个！")
	private String[] hobby;
	
	@Past(message="你不能出生在未来！")
	private Date birthday;
	
	@Valid
	private List<HouseBean> houses = new ArrayList<>();
	
	private Set<GirlBean> girls = new HashSet<>();
	
	private Map<String,String> params = new HashMap<>();
	
	private RoleBean role;
	
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
		girls.add(new GirlBean());
		girls.add(new GirlBean());
	}
	
	public UserBean(String userName, String loginName, Integer gender) {
		super();
		this.userName = userName;
		this.loginName = loginName;
		this.gender = gender;
	}



	public UserBean(String userName, String loginName, String password, Integer age, Integer gender) {
		super();
		this.userName = userName;
		this.loginName = loginName;
		this.password = password;
		this.age = age;
		this.gender = gender;
	}

	public UserBean(String userName, String loginName, String password, Integer age, Integer gender, Boolean marry,
			Double income,String[] hobby) {
		super();
		this.userName = userName;
		this.loginName = loginName;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.marry = marry;
		this.income = income;
		this.hobby = hobby;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Boolean getMarry() {
		return marry;
	}

	public void setMarry(Boolean marry) {
		this.marry = marry;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}
	
	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public List<HouseBean> getHouses() {
		return houses;
	}

	public void setHouses(List<HouseBean> houses) {
		this.houses = houses;
	}

	public Set<GirlBean> getGirls() {
		return girls;
	}

	public void setGirls(Set<GirlBean> girls) {
		this.girls = girls;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public RoleBean getRole() {
		return role;
	}

	public void setRole(RoleBean role) {
		this.role = role;
	}
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", loginName=" + loginName + ", password=" + password
				+ ", age=" + age + ", gender=" + gender + ", marry=" + marry + ", income=" + income + ", hobby="
				+ Arrays.toString(hobby) + ", birthday=" + birthday + ", houses=" + houses + ", girls=" + girls
				+ ", params=" + params + ", role=" + role + "]";
	}
}
