package com.spring.project1;

import java.util.Scanner;
import org.springframework.stereotype.Component;

@Component

public class Gpa {
	 int A = 4;
	 int B = 3;
	 int credit_hr1 = 4;
	 int credit_hr2 = 3;
	 double gpa;
	 int id;
	public  void calculation() {
		Scanner keyboard = new Scanner (System.in);
		id = keyboard.nextInt();
		System.out.println("Enter your id:");
		if (id == 2) {
			gpa = ((B*credit_hr1)+(A*credit_hr1))/(credit_hr1 + credit_hr1);
			System.out.println("Gpa=" + gpa);
		}
		else if (id == 3) {
			gpa = ((B*credit_hr2)+(A*credit_hr2))/(credit_hr2 + credit_hr2);
			System.out.println("Gpa=" + gpa);
		}
		else if (id == 4) {
			gpa = ((A*credit_hr1)+(A*credit_hr1))/(credit_hr1+ credit_hr1);
			System.out.println("Gpa=" + gpa);
		}
		else {
			System.out.println ("no course was taken.");
		}
		keyboard.close();
			
		}
	
	}
	
	
	


