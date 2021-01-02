package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employees;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employees> list = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("");
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
		
			while (Employees.position(list, id) != null) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
	
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			sc.nextLine();
			Employees emp = new Employees(id, name, salary);
			list.add(emp);
		}
		
		System.out.println("");
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Integer pos = Employees.position(list, id);
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		
		System.out.println("");
		System.out.println("List of employees:");
		for (Employees emp : list) {
			System.out.println(emp);
		}
		
		sc.close();

	}

}
