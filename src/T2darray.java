import java.util.Scanner;

public class T2darray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int numCols = input.nextInt();

        int[][] twoDArray = new int[numRows][numCols];

        // Receive values for the 2D array from the user
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter a value for row " + (i + 1) + ", column " + (j + 1) + ": ");
                twoDArray[i][j] = input.nextInt();
            }
        }

        // Display the received 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(twoDArray[i][j] + "\t"); // Use tabs for formatting
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the Scanner
        input.close();
    }
}
