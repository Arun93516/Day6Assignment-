package day6assignment;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputationProblem {

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage");
		Random random = new Random();
		int PerhourWage = 20;
		int FullDay = 8;
		int Parttime = 4;

		int Salary;

		int randomNumber = random.nextInt(3);
		//Here We can  use the Switch case to solve the Problem
		switch (randomNumber) {
		case 0:
			System.out.println("Employee is Absent Today ");
			Salary = PerhourWage * 0;
			System.out.println("Salary for Absent  day is :" + Salary);
		case 1:

			System.out.println("Employee is present Full Day  ");
			Salary = PerhourWage * FullDay;
			System.out.println("Salary for Full day is :" + Salary);
			break;
		case 2:

			System.out.println("Employee is Present Parttime   ");
			Salary = PerhourWage * Parttime;
			System.out.println("Salary for Partime day is :" + Salary);
			break;

		}
	}
}
