package Application;
import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;
public class BankApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double initialdeposit = 0;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		String tf = sc.nextLine();
		
		if (tf.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			initialdeposit = sc.nextDouble();}
			
		BankAccount bankaccount = new BankAccount(number, holder, initialdeposit);
			
		
		System.out.println("Account data:");
		System.out.println(bankaccount);
		
		System.out.print("Enter a deposit value: ");
		double newdeposit = sc.nextDouble(); 
		bankaccount.depositValue(newdeposit);
		System.out.println("Updated account data: ");
		System.out.println(bankaccount);
		
		
		
		System.out.print("Enter a whitdraw value: ");
		double newwithdraw = sc.nextDouble(); 
		bankaccount.withdrawnValue(newwithdraw);
		System.out.println("Updated account data: ");
		System.out.println(bankaccount);
		
		sc.close();

	}

}
