package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userChoice_First = 0;
		int userChoice_Second = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("What would you like to do?");
			System.out.println("1. Make a shape");
			System.out.println("2. Change the shape");
			System.out.println("3. View the Shape");
			System.out.println("4. Quit");
			userChoice_First = in.nextInt();
			if (userChoice_First == 1) {
				System.out.println("Which shape would you like to make?");
				System.out.println("1. Circle, 2. Triangle, 3. Rectangle");
				int shape = in.nextInt();
				if (shape == 1) {
					//Circle
					System.out.println("What would you like to change?");
					System.out.println("1. Radius");
					System.out.println("2. Nothing");
					int optionCircle = in.nextInt();
				} else if (shape == 2) {
					//Triangle
					System.out.println("What would you like to change?");
					System.out.println("1. Side A");
					System.out.println("2. Side B");
					System.out.println("3. Side C");
					System.out.println("4. Nothing");
					int optionTriangle = in.nextInt();
				} else if (shape == 3) {
					//Rectangle
					System.out.println("What would you like to change?");
					System.out.println("1. Length");
					System.out.println("2. Width");
					System.out.println("3. Nothing");
					int optionRectangle = in.nextInt();
				} else {
					System.out.println("Invalid");
				}
			} else if (userChoice_First == 2) {

			} else if (userChoice_First == 3) {

			} else if (userChoice_First == 4) {
				System.out.println("Goodbye!");
			} else {
				System.out.println("That is not a valid number, try again");
			}
		} while (userChoice_First != 4);
		in.close();
		System.exit(0);
	}

}
