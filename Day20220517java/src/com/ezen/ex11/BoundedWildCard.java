package com.ezen.ex11;

class Box<T>{
	private T ob;
	public T getOb() { return ob;}
	public void setOb(T ob) { this.ob = ob; }
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Toy {
	
	@Override
	public String toString() {
		return "I am Toy";
	}
}

class Robot extends Toy {}
class BoxHandler {			//get만 가능하다							//box 전달 대상은 Toy, Robot 가능
	public static void outBox(Box<? extends Toy> box) {	//box에는 전달 가능 인스턴스는  Toy또는 Toy상속한 아이들
		Toy t = box.getOb()	;			// box >> Box <Toy> or Box <Robot>
		System.out.println(t);	
//		box.setOb(t);
	}												//set만 가능하다
	public static void inBox(Box<? super Toy> box, Toy t) {	//box 대상은 Toy, Object
		box.setOb(t);
	}
}

public class BoundedWildCard {

	public static void main(String[] args) {
			Box<Robot> box = new Box<>();
//			BoxHandler.inBox(box, new Toy());
			
			BoxHandler.outBox(box);		//Toy타입 box이다.
	}
}