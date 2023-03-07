import java.util.Scanner;
public class HarmonicSeries {
	public static void main(String[] args) {
		int number;
		double total=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value ");
		number = input.nextInt();
		double i = number;
		while(i !=0) {
		
		total = total + (1/i);
		i--;
		}
		System.out.print("Result is " + total);
	}
	
}
