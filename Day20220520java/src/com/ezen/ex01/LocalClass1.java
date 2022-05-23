package com.ezen.ex01;

interface Printable{
	void print();
}

class Papers {

	private String con;
	public Papers(String s) { con = s; }
	
	public Printable getPrinter() {
		//메서드 안에 클래스가 있는것 local class라 한다.
		class Printer implements Printable{
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer(); //아래 p가 받는다.
	}
}

public class LocalClass1 {
	public static void main(String[] args) {
		Papers p = new Papers("message java!!");
		Printable prn = p.getPrinter();
		prn.print();
	}
}