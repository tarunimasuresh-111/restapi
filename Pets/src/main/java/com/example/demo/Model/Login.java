package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="login")

public class Login {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
 @Column(unique=true)
 private String uname;
 private String pwd;
 private String email;
 public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPnumber() {
	return pnumber;
}
public void setPnumber(String pnumber) {
	this.pnumber = pnumber;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getAlterphno() {
	return alterphno;
}
public void setAlterphno(String alterphno) {
	this.alterphno = alterphno;
}
private String gender;
 private String pnumber;
 private String location;
 private String nationality;
 private String qualification;
 private String alterphno;
 private String aadharno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getAadharno() {
	return aadharno;
}
public void setAadharno(String aadharno) {
	this.aadharno = aadharno;
}
	
}
