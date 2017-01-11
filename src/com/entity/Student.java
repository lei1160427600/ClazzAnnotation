package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Embeddable ��ʾһ����Entity�����Ƕ�뵽��һ��Entity������Ϊ���Զ����ڡ�
@Entity
@Table(name = "t_Students")
public class Student {
	@Id
	// id :���룬������ӳ�䵽���ݿ����������ԣ�һ��ʵ������һ�����߶������
	// ��ӳ��Ϊ�������������������Ի���getXX�����ϡ����һ��ʵ���ඨ���˶���������ԣ���ʵ�������ʵ��serializable�ӿڡ�
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
