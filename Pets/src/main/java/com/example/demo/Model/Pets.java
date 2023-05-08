package com.example.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="PetsDetails")
public class Pets 
{
	@Id
	@Column(name="Pet")
	private int pid;
	private String pname;
	private String ptype;
	private String pbreed;
	private String pgender;
	private int pprice;
	private String porigin;
	private String page;
	private String pcolour;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private PetsLocation pl;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPaid(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPbreed() {
		return pbreed;
	}
	public void setPbreed(String pbreed) {
		this.pbreed = pbreed;
	}
	public String getPgender() {
		return pgender;
	}
	public void setPgender(String pgender) {
		this.pgender = pgender;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public String getPorigin() {
		return porigin;
	}

	public void setPorigin(String porigin) {
		this.porigin = porigin;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPcolour() {
		return pcolour;
	}
	public void setPcolour(String pcolour) {
		this.pcolour = pcolour;
	}
	public PetsLocation getPl() {
		return pl;
	}
	public void setPl(PetsLocation pl) {
		this.pl = pl;
	}
	
	}	


