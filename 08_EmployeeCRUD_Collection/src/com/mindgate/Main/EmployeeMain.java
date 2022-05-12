package com.mindgate.Main;

import java.util.Scanner;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
//		do {
//			System.out.println(" 1. Add new Employree" + "\n 2. Update Employee" + "\n 3. Delete Employee"
//					+ "\n 4 Get Single Employee" + "\n 5. get All Employee" + "\n Enter your choice" + "\n Choice::");
//			Scanner scanner = new Scanner(System.in);
//
//			choice = scanner.nextInt();
//			if (choice == 1 || choice == 2) {
//				System.out.println("Enter EmployeeID");
//				employeeId = scanner.nextInt();
//				System.out.println("Enter Name");
//				name = scanner.next();
//				System.out.println("Enter Salary");
//				salary = scanner.nextDouble();
//				employee = new Employee(employeeId, name, salary);
//			}
//			switch (choice) {
//			case 1:
//				System.out.println(employee);
//				if (employeeDAO.addNewEmployee(employee) == true) {
//					System.out.println("Employee Added");
//				}
//				break;
//			case 2:
//				if (employeeDAO.updateEmployee(employee) == true) {
//					System.out.println("Employee Details Updated");
//				}
//				break;
//			case 3:
//				System.out.println("Enter EmployeeID");
//				employeeId = scanner.nextInt();
//				if (employeeDAO.deleteEmployeeByEmployeeId(employeeId) == true)
//					System.out.println("employee deleted");
//				break;
//			case 4:
//				System.out.println("Enter EmployeeID");
//				employeeId = scanner.nextInt();
//				if (employeeDAO.getEmployeeByEmployeeId(employeeId) != null) {
//					System.out.println(employeeDAO.getEmployeeByEmployeeId(employeeId));
//				}
//
//				break;
//
//			case 5:
//				Set<Employee> importedDetails = employeeDAO.getAllEmployee();
//				for (Employee showDetails : importedDetails) {
//					System.out.println(showDetails);
//				}
//				break;
//			}
//			System.out.println("Do you Want to Continue\n yes/no");
//			continueChoice = scanner.next();
//		} while (continueChoice.equalsIgnoreCase("yes"));
//
//	}

do {
		int choice;
		int employeeId ;
		String name;
		double salary ;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select from given choices");
		System.out.println("1.Add New Employee");
		System.out.println("2.Update employee");
		System.out.println("3.Delete employee");
		System.out.println("4.Get Single Employee details");
		System.out.println("5.Get All employee Details");

		EmployeeDao dao = new EmployeeDao();
		Employee employee;

		choice = scanner.nextInt();

		switch (choice) {
		case 1: 
			System.out.println("Enter EmployeeId");
			 employeeId = scanner.nextInt();

			System.out.println("Enter the Name");
			 name = scanner.next();

			System.out.println("Enter the salary");
			salary = scanner.nextDouble();
			
			employee = new Employee(employeeId, name, salary);
			if (dao.addnewEmployee(employee)) {
				System.out.println("Account created Successfull!!");
			}

			break;
		case 2: 
			System.out.println("Enter EmployeeId");
			 employeeId = scanner.nextInt();
			System.out.println("Enter Name");
			 name = scanner.next();
			System.out.println("Enter salary");
			 salary = scanner.nextDouble();
			employee = new Employee(employeeId, name, salary);
			if (dao.updateEmployee(employee)) {
				System.out.println("Employee details updated");
			}
			else{
				System.out.println("no");
			break;
			
		case 3:
				System.out.println("Enter EmployeeID");
				employeeId = scanner.nextInt();
				if (employeeDAO.deleteEmployeeByEmployeeId(employeeId) == true)
					System.out.println("employee deleted");
				break;
			case 4:
				System.out.println("Enter EmployeeID");
				employeeId = scanner.nextInt();
				if (employeeDAO.getEmployeebyEmployeeId(employeeId) != null) {
					System.out.println(employeeDAO.getEmployeebyEmployeeId(employeeId));
				}

				break;

			case 5:
				Set<Employee> importedDetails = employeeDAO.getAllEmployee();
				for (Employee showDetails : importedDetails) {
					System.out.println(showDetails);
				}
				break;
			} while (continueChoice.equalsIgnoreCase("yes"));
		}
}

//
//package com.mindgate.Main;
//
//import java.util.Scanner;
//import java.util.Set;
//
//import com.mindgate.dao.EmployeeDao;
//import com.mindgate.pojo.Employee;
//
//public class EmployeeMain {
//	public static void main(String[] args) {
//
//		int choice;
//		int employeeId = 0;
//		String name = null;
//		double salary = 0;
//		Employee employee = null;
//		String continueChoice;
//		EmployeeDao employeeDAO = new EmployeeDao();
//
//		do {
//			System.out.println(" 1. Add new Employree" + "\n 2. Update Employee" + "\n 3. Delete Employee"
//					+ "\n 4 Get Single Employee" + "\n 5. get All Employee" + "\n Enter your choice" + "\n Choice::");
//			Scanner scanner = new Scanner(System.in);
//
//			choice = scanner.nextInt();
//			if (choice == 1 || choice == 2) {
//				System.out.println("Enter EmployeeID");
//				employeeId = scanner.nextInt();
//				System.out.println("Enter Name");
//				name = scanner.next();
//				System.out.println("Enter Salary");
//				salary = scanner.nextDouble();
//				employee = new Employee(employeeId, name, salary);
//			}
//			switch (choice) {
//			case 1:
//				System.out.println(employee);
//				if (employeeDAO.addnewEmployee(employee) == true) {
//					System.out.println("Employee Added");
//				}
//				break;
//			case 2:
//				if (employeeDAO.updateEmployee(employee) == true) {
//					System.out.println("Employee Details Updated");
//				}
//				break;
//			case 3:
//				System.out.println("Enter EmployeeID");
//				employeeId = scanner.nextInt();
//				if (employeeDAO.deleteEmployeeByEmployeeId(employeeId) == true)
//					System.out.println("employee deleted");
//				break;
//			case 4:
//				System.out.println("Enter EmployeeID");
//				employeeId = scanner.nextInt();
//				if (employeeDAO.getEmployeebyEmployeeId(employeeId) != null) {
//					System.out.println(employeeDAO.getEmployeebyEmployeeId(employeeId));
//				}
//
//				break;
//
//			case 5:
//				Set<Employee> importedDetails = employeeDAO.getAllEmployee();
//				for (Employee showDetails : importedDetails) {
//					System.out.println(showDetails);
//				}
//				break;
//			}
//			System.out.println("Do you Want to Continue\n yes/no");
//			continueChoice = scanner.next();
//		} while (continueChoice.equalsIgnoreCase("yes"));
//
//	}
//
//}
