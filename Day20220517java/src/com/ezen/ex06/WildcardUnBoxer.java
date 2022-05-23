package com.ezen.ex06;

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
	public static <T> T openBox(Box<T>box) {
		return box.getOb();
	}
												//제니닉 메소드 기반
	public static <T> void peekBox(Box<T> box) {//Box <Object> box는 불가하다. 아래에 new Box<>()가 타입 불일치 때문에
		System.out.println(box);
	}
}
public class WildcardUnBoxer {

	public static void main(String[] args) {
		Box<String> box = new Box<>();	//상속을 하고 있어도 안에 있는 타입 까지 일치 해야 한다.
		box.setOb("apple");
		Unboxer.peekBox(box);
		
	}
}