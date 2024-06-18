package application;

import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class WorkerApplication {
	public static void main(String[] args) throws ParseException  {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter department's name: ");
	String department = sc.nextLine();
	System.out.println("Enter worker data: ");
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("Level: ");
	String level = sc.nextLine();
	System.out.print("Base salary: ");
	double baseSalary = sc.nextDouble();
	Department departmente = new Department(department);
	Worker worker = new Worker(name, WorkerLevel.valueOf(level),baseSalary, departmente);
	System.out.print("How many contracts to this worker? ");
	int contractsQuant = sc.nextInt();
	
	for(int i = 1; i<=contractsQuant; i++) {
		sc.nextLine();
		System.out.println("Enter contract # " + i + " data");
		System.out.print("Date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Value per hour: ");
		Double vph = sc.nextDouble();
		System.out.print("Duration (hours): ");
		Integer hours = sc.nextInt();
		HourContract contracts = new HourContract(date, vph, hours);
		worker.addContract(contracts);
	}
	sc.nextLine();
	
	System.out.print("Enter month and year to calculate income (MM/YYYY) ");
	String monthAndYear = sc.nextLine();
	System.out.println("Name: "+ worker.getName());
	System.out.println("Department: " +worker.getDepartment().getName());
	Integer month = Integer.parseInt(monthAndYear.substring(0,2));
	Integer year = Integer.parseInt(monthAndYear.substring(3));
	System.out.println("Income for " + month + "/" + year  + ": " + String.format("%.2f" ,worker.income(month,year)));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
}
	
	
}