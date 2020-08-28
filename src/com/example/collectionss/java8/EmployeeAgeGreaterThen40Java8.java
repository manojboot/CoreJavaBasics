package com.example.collectionss.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAgeGreaterThen40Java8 {
	
		public static void main(String[] args) {
			
			List<Employee> list = availableEmployeeList();
			// Filtered Employee List with Age Greater then 32
			List<String> filterEmployee = list.stream()
											   .filter(e->e.getAge()>32)
											   .map(Employee::getName)
											   .collect(Collectors.toList());
			
			System.out.println("Employess with age greater then 32 :-->" +filterEmployee);
			
			List<String> filterEmployee1 = list.stream()
												.filter(e->e.getName().startsWith("a"))
												.map(Employee::getName)
												.collect(Collectors.toList());
			
			
			System.out.println("Employess with name ma :-->" +filterEmployee1);

			System.out.println("Converting to Upper Case Letters :" +list.stream().filter(e->e.getAge() == 32).map(e->e.getName().toUpperCase()).collect(Collectors.toList()));				
			
			Map<String,String> mapEmployee = list.stream().collect(Collectors.toMap(Employee::getName,Employee::getCity));
			System.out.println(mapEmployee);
		}
		
		public static List<Employee> availableEmployeeList(){
			
			List<Employee> list = new ArrayList<Employee>();
			Employee e1 = new Employee("pankaj",32,35,"Ranikhet");
			Employee e2 = new Employee("shardool",31,51,"Delhi");
			Employee e3 = new Employee("ramesh",32,41,"Pithoragarh");
			Employee e4 = new Employee("manoj",33,27,"Haldwani");
			Employee e5 = new Employee("bhawesh",32,9,"Nanital");
			Employee e6 = new Employee("akshay",52,9,"Mumbai");
			Employee e7 = new Employee("ajay",49,9,"Mumbai");
			Employee e8 = new Employee("Aishwarya",38,9,"Banglore");


			list.add(e1);
			list.add(e2);
			list.add(e3);
			list.add(e4);
			list.add(e5);list.add(e6);list.add(e7);list.add(e8);
			return list;


		}

}
