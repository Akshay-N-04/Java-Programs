import java.util.Scanner;

public class AverageWithoutLargestAndSmallest {

    public static void main(String[] args) {

        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array.
        System.out.println("Enter the number of elements in the array: ");
        int numberOfElements = scanner.nextInt();

        // Create an array to store the elements.
        int[] array = new int[numberOfElements];

        // Prompt the user to enter the elements of the array.
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the largest and smallest elements in the array.
        int largest = array[0];
        int smallest = array[0];
        for (int i = 1; i < numberOfElements; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Calculate the average value of the array without the largest and smallest values.
        double average = 0.0;
        for (int i = 0; i < numberOfElements; i++) {
            if (array[i] != largest && array[i] != smallest) {
                average += array[i];
            }
        }
        average /= (numberOfElements - 2);

        // Print the average value.
        System.out.println("The average value is " + average);
    }
}
