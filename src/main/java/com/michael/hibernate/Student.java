package com.michael.hibernate;
import javax.persistence.*;

@Entity
@Table(name="stud")
public class Student {
	@Id @GeneratedValue
	private int stdId;
	@Column(name="student_name")
	private String stdName;
	@Column(name="student_address")
	private String stdAddress;
	
	public Student(int stdId,String stdName, String stdAddress) {
		this.stdId=stdId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
	}
	
	public Student(String stdName, String stdAddress) {
		this.stdName = stdName;
		this.stdAddress = stdAddress;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	
	
}
