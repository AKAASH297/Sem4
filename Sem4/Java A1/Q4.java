import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = userinput.nextInt();
		System.out.println("Chosen Input: "+n);
		if(n>0) {
			System.out.println("The Number is Positive");
		}
		else {
			if(n<0)
				System.out.println("The Number is Negative");
			else
				System.out.println("The Number is Zero");
		}
	}
}