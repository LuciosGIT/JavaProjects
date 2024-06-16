package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentGrades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Student student = new Student();
		sc.nextLine();
		student.grade1  = sc.nextFloat();
		student.grade2  = sc.nextFloat();
		student.grade3  = sc.nextFloat();
		System.out.println("FINAL GRADE: " + student.GradesSum());
		student.SituationVerification();
		sc.close();
	}

}
