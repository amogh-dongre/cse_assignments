import java.util.Scanner;
public class QuartsToGallons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        boolean validSize = false;
        while (!validSize) {
            try {
                System.out.print("Enter array size: ");
                int inputSize = Integer.parseInt(scanner.nextLine());
                if (inputSize >= 0) {
                     inputSize=size ;
                    validSize = true;
                } else {
                    throw new NegativeArraySizeException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid array size. Please enter a valid integer.");
            } catch (NegativeArraySizeException e) {
                System.out.println("Array size cannot be negative. Using default size: " + size);
                validSize = true;
            }
        }
        int[] quartsArray = new int[size];
        for (int i = 0; i < size; i++) {
            boolean validElement = false;
            while (!validElement) {
                try {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    int element = Integer.parseInt(scanner.nextLine());
                    quartsArray[i] = element;
                    validElement = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid element. Please enter a valid integer.");
                }
            }
        }
        double[] gallonsArray = new double[size];
        for (int i = 0; i < size; i++) {
            gallonsArray[i] = quartsArray[i] / 4.0;
        }
        System.out.println("Gallons Array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + gallonsArray[i]);
        }
    }
}
