package com.ezen.ex07;

class Box<T>{
	private T ob;
	public T getOb() { return ob;}
	public void setOb(T ob) { this.ob = ob; }
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer {
	public static void peekBox(Box<? extends Number> box) {//와일드카드 기반 메소드 정의 가운데 <T>생략가능 static과 void 사이
		System.out.println(box);
	}
}
public class WildcardUnBoxer {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();	//상속을 하고 있어도 안에 있는 타입 까지 일치 해야 한다.
		box.setOb(123);
		System.out.println(box.getOb());
		Unboxer.peekBox(box);
		
	}
}