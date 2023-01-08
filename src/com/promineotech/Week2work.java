package com.promineotech;

public class Week2work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		System.out.println(age >= 16);
		age = 17;
		System.out.println(age >= 16);
		boolean hasLicense = true;
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		double costOfMilk = 3.00;
		int thirstLevel = 5;
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}

		int numberOfCookies = 7;
		int numberOfChildren = 2;
		if (numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		} else if (numberOfCookies % numberOfChildren >= 2) {
			System.out.println("Whoohoo!");
		} else if (numberOfCookies % numberOfChildren > 0) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sad Face");
		}
		int num1 = 6;
		int num2 = 3;
		int num3 = 5;
		int num4 = 6;
		int myAnswer = (num1 * num2 * num3);
		System.out.println(myAnswer);
		System.out.println(num1 % num2);

		double numb1 = 10.5;
		double numb2 = .5;
		double numb3 = 2;
		double numb4 = 2;
		double answer1 = numb1 / numb2;
		double answer2 = numb3 * numb4;
		double finalAnswer1 = answer1 + answer2;
		System.out.println(finalAnswer1);

	}

}
