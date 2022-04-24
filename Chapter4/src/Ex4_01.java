public class Ex4_01 {
	public static void main(String[] args) {

		int x=0;       //x는 0이다.
		System.out.printf("x=%d 일때, 참인 것은%n", x);
		
		if(x==0)	System.out.println("x==0");      //이놈
		if(x!=0)	System.out.println("x!=0");
		if(!(x==0))	System.out.println("!(x==0)");
		if(!(x!=0))	System.out.println("!(x!=0)");      //이놈
		
		x=1;               //x는 1이다.
		System.out.printf("x=%d 일때, 참인 것은%n", x);

		if(x==0)	System.out.println("x==0");
		if(x!=0)	System.out.println("x!=0");      //이놈
		if(!(x==0))	System.out.println("!(x==0)");      //이놈
		if(!(x!=0))	System.out.println("!(x!=0)");
		
		
	}

}
