package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountExceptionHandling;
import entities.WithDrawException;

public class AccountExceptionHandlingProgram {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		AccountExceptionHandling account = new AccountExceptionHandling(number, holder, initBalance,withdrawLimit);
		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.print("New balance: ");
		System.out.println(account.getBalance());
		
		}
		catch(WithDrawException e){
			System.out.println("Withdraw error: " + e.getMessage());
			
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error.");
		}
		
		sc.close();

}
	
	
}