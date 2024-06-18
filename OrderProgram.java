package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class OrderProgram {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthdate = sdf.parse(sc.next());
		
		Client client = new Client(name,email, birthdate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order? ");
		int items = sc.nextInt();
		Order order = new Order(new Date(), status, client);
		
		for(int i = 0;i<items;i++) {
			sc.nextLine();
			System.out.println("Enter #"  + i + " item data");
			System.out.print("Product Name: ");
			String productName = sc.nextLine();
			System.out.print("Product Price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem it = new OrderItem(quantity, productPrice,product);
			
			order.addItem(it);
		}
		System.out.println();
		System.out.println(order);
		
}
	
}
