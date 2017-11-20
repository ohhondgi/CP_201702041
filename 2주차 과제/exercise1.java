package day3;

public class exercise1 {
	public static void main(String[] args) {
		int f0=0, f1=1,f;
		System.out.println("f0= "+f0);
		System.out.println("f1= "+f1);
		
		for (int i=2; i<=10; i++) {
			f = f0+f1;
			f0 = f1;
			f1 = f;
			System.out.println("f"+i+"= "+f);
		}
	}
}
