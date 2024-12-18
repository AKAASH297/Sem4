public class Q1 {
	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<=n;i++) {
			int prt=1;
			for(int j=0;j<i;j++) {
				prt=prt*3;
			}
			System.out.println(prt);
		}
	}
}
