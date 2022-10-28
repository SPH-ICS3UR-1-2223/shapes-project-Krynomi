package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userChoice = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("What would you like to do?");
			System.out.println("1. Make a shape");
			System.out.println("2. Change the shape");
			System.out.println("3. View the Shape");
			System.out.println("4. Quit");
			userChoice = in.nextInt();
			if (userChoice == 1) {
				System.out.println("Which shape would you like to make?");
				System.out.println("1. Circle, 2. Triangle, 3. Rectangle");
				int shape = in.nextInt();
				if (shape == 1) {
					//Circle
					
				} else if (shape == 2) {
					//Triangle

				} else if (shape == 3) {
					//Rectangle

				} else {
					System.out.println("Invalid");
				}
			} else if (userChoice == 2) {

			} else if (userChoice == 3) {

			} else if (userChoice == 4) {
				System.out.println("Goodbye!");
			} else {
				System.out.println("That is not a valid number, try again");
			}
		} while (userChoice != 4);
		in.close();
		System.exit(0);
	}

}
