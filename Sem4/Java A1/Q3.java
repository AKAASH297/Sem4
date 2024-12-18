public class Q3 {
	public static void main(String[] args) {
		int calc = 1;
		for(int i=1;i<=100;i++) {
			if(calc>262880)
				break;
			calc = 1;
			for(int j=1;j<=i;j++) {
				calc=calc*j;
			}
			System.out.println(calc);
		}
	}
}