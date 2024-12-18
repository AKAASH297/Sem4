import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = userinput.nextInt();
		System.out.println("Chosen Input: "+n);
		
		if(n>=18 && n<=120)
			System.out.println("You are Eligible to Vote");
		else
			System.out.println("You are not Eligible to Vote");
	}
}