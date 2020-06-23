public class Fibonacci {
	
	public static void main(String[] args) {
		int i = 0;
		int m = 0;
		while(true){
			i++;
			m = of(i);
			if(m<200)
			System.out.println(m);
		}	
	}
	
	public static int of(int num) {
		if(num == 1 || num == 2) {
			return 1;
		}else {
			return of(num - 2) + of(num - 1);
		}
	}
	
}