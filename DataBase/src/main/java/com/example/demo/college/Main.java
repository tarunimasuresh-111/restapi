package com.example.demo.college;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="collegedetails")
public class Main {
	@Id
	@Column(name="cid")
	private int cid;
	private String cname;
	private int cdept;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCdept() {
		return cdept;
	}
	public void setCdept(int cdept) {
		this.cdept = cdept;
	}
	
	

}
