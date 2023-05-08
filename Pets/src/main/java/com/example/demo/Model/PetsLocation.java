package com.example.demo.Model;


	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;

	@Entity
	public class PetsLocation {
		@Id
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		private String district;
		private String state;
		private String country;
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		

	}



