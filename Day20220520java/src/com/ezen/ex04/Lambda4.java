package com.ezen.ex04;

interface Printable4{ void print(String s); }

interface Calculate {
	void cal(int n1, int n2);
}

class Cal implements Calculate{
	
	@Override
	public void cal(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
}
//ctrl+shirf+{
public class Lambda4 {
	public static void main(String[] args) {
		//람다
		Printable4 prn;
		prn = (String s) -> {System.out.println(s);};
		prn.print("java is lambda1!!");
		
		prn = (String s) -> System.out.println(s);
		prn.print("java is lambda2!!");

		prn = (s) -> System.out.println(s); //String타입인지 어찌아냐 4번쨰 줄에 알려준다.
		prn.print("java is lambda3!!");

		prn = s -> System.out.println(s);
		prn.print("java is lambda4!!");
		
		Calculate c = new Cal();
		c.cal(10,10);
		
		Calculate cc;
		cc = (int n1, int n2) -> { System.out.println(n1*n2);};
		cc.cal(5, 9);

		cc = (n1, n2) -> { System.out.println(n1+n2);};
		cc.cal(7, 4);
		
		
	}
}