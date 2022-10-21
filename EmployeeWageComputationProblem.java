package day6assignment;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputationProblem {

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage");
		Random random = new Random();

		int randomNumber = random.nextInt(2);
		switch (randomNumber) {
		case 1:
			System.out.println("Employee is present Full Day  ");
			break;
		case 0:
			System.out.println("Employee is Absent Today ");
		}
	}
}
