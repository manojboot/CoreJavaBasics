package com.example.collectionss.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	
			
			public static void main(String[] args) {
				
				Set<Employee> set = new HashSet<Employee>();
				
				Employee e1 = new Employee("manoj","haldwani",9626027);
				Employee e2 = new Employee("neha","delhi",7626027);
				Employee e3 = new Employee("dhoni","dehradun",6626027);
				Employee e4= new Employee("neha","delhi",7626027);

				
				set.add(e1);
				set.add(e2);
				set.add(e3);
				set.add(e4);
				
				for(Employee e : set) {
				System.out.println(e.getName());
				}
			}
}
			
			class Employee{
				
					private String name;
					private String city;
					private int number1;
					
					public Employee(String name, String city, int number1) {
						this.name = name;
						this.city = city;
						this.number1 = number1;
					}
					public String getName() {
						return name;
					}
					public void setName(String name) {
						this.name = name;
					}
					public String getCity() {
						return city;
					}
					public void setCity(String city) {
						this.city = city;
					}
					public int getNumber() {
						return number1;
					}
					public void setNumber(int number1) {
						this.number1 = number1;
					}
					@Override
					public int hashCode() {
						final int prime = 31;
						int result = 1;
						result = prime * result + ((city == null) ? 0 : city.hashCode());
						result = prime * result + ((name == null) ? 0 : name.hashCode());
						result = prime * result + number1;
						return result;
					}
					@Override
					public boolean equals(Object obj) {
						if (this == obj)
							return true;
						if (obj == null)
							return false;
						if (getClass() != obj.getClass())
							return false;
						Employee other = (Employee) obj;
						if (city == null) {
							if (other.city != null)
								return false;
						} else if (!city.equals(other.city))
							return false;
						if (name == null) {
							if (other.name != null)
								return false;
						} else if (!name.equals(other.name))
							return false;
						if (number1 != other.number1)
							return false;
						return true;
					}
					
					
					
}
