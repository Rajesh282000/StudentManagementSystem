package com.jdbc.model;

public class StudentJdbc {
	
		private int id;
		private String name;
		private String email;
		private String pwd;
		
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd +"]";
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
		
		
			


}
