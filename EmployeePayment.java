package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import entities.OutsourcedEmployee;

public class EmployeePayment {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Employee> employeeList = new ArrayList<>();
		System.out.print("Enter the number of employees: ");
		int employees = sc.nextInt();
		for (int i  = 1; i<=employees; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i + " data");
			System.out.print("Outsourced (y/n)? ");
			char outSourced = sc.next().charAt(0);
			if (outSourced == 'n') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				employeeList.add(new Employee(name, hours, valuePerHour));
				
			}
			if (outSourced == 'y') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee e : employeeList) {
			System.out.println(e.getName() + " - $ " + e.payment());
			}
		
		sc.close();

	}

}
