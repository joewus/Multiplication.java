import java.util.Scanner;
public class Multiplication {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number of columns: ");
		int columns = input.nextInt();
		System.out.println("Enter number of rows: ");
		int rows = input.nextInt();
		for (int i = 1; i<= rows; i++) {
			for (int j = 1; j<= columns; j++) {
				System.out.printf(" %3d", i*j);
			}
			System.out.println();
		}
		
	}

}
