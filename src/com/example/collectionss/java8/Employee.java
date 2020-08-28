package com.example.collectionss.java8;

public class Employee {

	
		private String name;
		private int age;
		private int empNo;
		private String city;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Employee(String name, int age, int empNo, String city) {
			super();
			this.name = name;
			this.age = age;
			this.empNo = empNo;
			this.city = city;
		}
		
}
