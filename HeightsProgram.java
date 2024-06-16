package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Heights;

public class HeightsProgram {

	public static void main(String[] args) {
		double avgheight = 0;
		double sum = 0;
		int counter = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int persons_quantity = sc.nextInt();
		Heights[] vect = new Heights[persons_quantity];
		for(int i =0;i<persons_quantity; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a " + "pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Heights(name,idade,altura);
			
		}
		
		for(int i = 0; i<vect.length;i++) {
			sum+=vect[i].getHeight();
		}
		
		avgheight = sum/vect.length;
		
		System.out.printf("Altura média: %.2f%n", avgheight);
		
		for(int i = 0; i<vect.length;i++) {
			if(vect[i].getAge()<16) {
				counter +=1;
				System.out.println(vect[i].getName());	}
			}
		 System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", ((double) counter / vect.length) * 100);
	
		
		
		sc.close();

	}

}
