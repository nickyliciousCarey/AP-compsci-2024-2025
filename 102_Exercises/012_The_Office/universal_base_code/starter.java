/*
 *	Author: Nicholas Carey
 *  Date:10/22
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.raiseSalary(1);
		michael.employeeToString();
		
		Employee dwightSchrute = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwightSchrute.raiseSalary(100);
		dwightSchrute.getAnnualSalary();
		dwightSchrute.employeeToString();
		
		Employee jimHalpert = new Employee(2474, "Jim", "Halpert", 4416.66);
		jimHalpert.raiseSalary(100);
		jimHalpert.getAnnualSalary();
		jimHalpert.employeeToString();
		
		Employee pamBeesely = new Employee(2011, "Pam", "Beesely", 2250);
		pamBeesely.raiseSalary(100);
		pamBeesely.getAnnualSalary();
		pamBeesely.employeeToString();
		
		Employee annualSoup = new Employee(1111, "Annual", "Soup", 1000000);
		annualSoup.raiseSalary(40);
		annualSoup.getAnnualSalary();
		annualSoup.employeeToString();
	}
}
