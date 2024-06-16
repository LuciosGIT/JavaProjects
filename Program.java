package Application;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine(); 
		System.out.print("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble(); 
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble(); 
		System.out.println("Employee: " + employee.name + ", " + "$ " + employee.NetSalary());
		System.out.print("Which percentage to increase salary? ");
		double increase = sc.nextDouble();
		System.out.print("Updated data : " + employee.name + ", " + "$ ");
		employee.IncreaseSalary(increase);
		sc.close();
		
		
		
	}

}
