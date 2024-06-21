package application;

import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProductRegistration {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List <Product> productsList = new ArrayList<>();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int productsQuant = sc.nextInt();
		for (int i = 0 ; i < productsQuant ; i++) {
			sc.nextLine();
			System.out.println("Product # " + (i+1) + " data:");
			System.out.print("Common, used or  imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				productsList.add(new UsedProduct(name,price,manufactureDate));
			}
			else if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee  = sc.nextDouble();
				productsList.add(new ImportedProduct(name,price,customsFee));
			}
			else{
				productsList.add(new Product(name,price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product p : productsList) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}

}
