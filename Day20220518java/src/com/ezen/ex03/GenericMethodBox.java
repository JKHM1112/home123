package com.ezen.ex03;

class Box<T>{
	private T ob;	//5. ob,set,get이 생성된다
	public void set(T o) {ob = o;}	
	public T get() { return ob;}
}

class BoxFactory{	//2. 이쪽으로 옴
	//제네릭 메소드
	//		제네닉메소드표시 : <T>, Box<T> : 반환형, T o: 매개변수
	
	public static <T extends Number> Box<T> makeBox(T o){	//2. 참조변수 o가 만들어지고 Number를 받는다.
		
		Box<T> box = new Box<T>();	//3. 참조변수 box가 만들어진다.
		box.set(o);	//4. o가 들어간다.
		
		System.out.println("Box data:"+o.intValue()); 
		return box;
	}
}

class UnBoxer {
	public static <T extends Number> T openBox(Box<T> box){
		System.out.println("unBoxer Data: "+box.get().intValue());
		return box.get();
	}
}
public class GenericMethodBox {

	public static void main(String[] args) {
//		Box<Integer> iBox = BoxFactory.makeBox(new Integer(8989));
		Box<Integer> iBox = BoxFactory.makeBox(8989);//1. 참조변수 iBox가 만들어진다. makeBox객체가 생성된다. 8989가 들어가있음.

		int num = UnBoxer.openBox(iBox);
		
		System.out.println("result : " + num);
	}
}