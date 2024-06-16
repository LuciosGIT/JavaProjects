package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.RoomRenting;

public class RoomRentingProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int rooms_quantity = sc.nextInt();
		RoomRenting[] vect = new RoomRenting[rooms_quantity];
	
		
		for(int i = 0; i<rooms_quantity; i++) {
			sc.nextLine();
			System.out.println("Rent " + "#" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[i] = new RoomRenting(name,email,room);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i<vect.length; i++) {
			System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());	
		}
		
		
		
		
		
		sc.close();
	}

}
