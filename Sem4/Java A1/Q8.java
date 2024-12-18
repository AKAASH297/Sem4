import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = userinput.nextInt();
		System.out.println("Chosen Input: "+n);
		
		int N=n-1;
		int test=N&n;
		if (test==0)
			System.out.println("Number is a power of 2");
		else
			System.out.println("Number is not power of 2");
	}

}
