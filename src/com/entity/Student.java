package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Embeddable 表示一个非Entity类可以嵌入到另一个Entity类中作为属性而存在。
@Entity
@Table(name = "t_Students")
public class Student {
	@Id
	// id :必须，定义了映射到数据库表的主键属性，一个实体类有一个或者多个属性
	// 被映射为主键，可置于主键属性或者getXX（）上。如果一个实体类定义了多个主键属性，该实体类必须实现serializable接口。
	private Long sid;
	@Id
	private String name;
	private String gender;
	private Date birthday;
	private String major;
	private Address add;

	public Student() {

	}

	public Student(Long sid, String name, String gender, Date birthday,
			String major, Address add) {
		// super();
		this.sid = sid;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.major = major;
		this.add = add;
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
}
