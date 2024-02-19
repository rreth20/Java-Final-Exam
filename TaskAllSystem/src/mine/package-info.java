package mine;

import java.util.Scanner;
class TaskAllSystem{
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int[] numbers = new int[100]; // Assuming a maximum of 100 elements
	        int n = 0; // Number of elements entered by the user

	        boolean exit = false;
	        while (!exit) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Enter a number");
	            System.out.println("2. View input numbers");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements: ");
                    int numElements = scanner.nextInt();
                    System.out.println("Enter elements:");
                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Element " + (i+1) + ": ");
                        numbers[n++] = scanner.nextInt();
                    }
                    break;
                case 2:
                    if (n == 0) {
                        System.out.println("No numbers entered yet.");
                    } else {
                        System.out.println("Input numbers:");
                        for (int i = 0; i < n; i++) {
                            System.out.print(numbers[i] + " ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }

        scanner.close();
    }
}