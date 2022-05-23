package com.ezen.ex04;

class Box<T>{
	protected T ob;
	public T getOb() { return ob;}
	public void setOb(T ob) { this.ob = ob; }
}
class SteelBox<T> extends Box<T>{
	public SteelBox(T t) {ob = t;}
}
public class GenericInheritance {

	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox<>(7959);	//상속을 하고 있어도 안에 있는 타입 까지 일치 해야 한다.
		
		Box<String> sBox = new SteelBox<>("simple");	//상속을 하고 있어도 안에 있는 타입 까지 일치 해야 한다.
		
		System.out.println(iBox.getOb());
		System.out.println(sBox.getOb());
	}
}