package com.ezen.ex05;

interface Calculate {
	int cal(int n1, int n2);
}

class Caltor implements Calculate {

	@Override
	public int cal(int n1, int n2) {
		return n1 + n2;
	}
}// ctrl+shirf+{

public class Lambda4 {
	public static void main(String[] args) {
		// 람다

		Calculate c = (int n1, int n2) -> {
			return n1 + n2;
		};
		System.out.println(c.cal(5, 2));

		c = (n1, n2) -> n1 + n2;
		System.out.println(c.cal(5, 9));

		c = (n1, n2) -> n1 * n2;
		System.out.println(c.cal(5, 9));
		
		c = new Aaaa();
		System.out.println(c.cal(5, 5));
	}
}