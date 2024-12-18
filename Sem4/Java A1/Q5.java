import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = userinput.nextInt();
		System.out.println("Chosen Input: "+n);
		System.out.print("The Day is: ");
		switch(n) {
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		case 7:
			System.out.print("Sunday");
			break;
		default:
			System.out.println("Invalid Input!");
			break;
		}
	}
}