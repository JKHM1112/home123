//applebox에는 apple만 orangebox에는 orange만 담겠다.

class Apple2 {
	@Override
	public String toString() {
		return "I am Apple";
	}
}

class Orange2 {
	@Override
	public String toString() {
		return "I am orange";
	}
}

class Box2<T> { // 타입을 T로 바꾸었다. //<Apple2><Orange2>만 들어간다.
	private T ob; //// <Apple2><Orange2>만 들어간다.

	public T getOb() { // <Apple2><Orange2>만 들어간다.
		return ob;
	}

	public void setOb(T ob) { // <Apple2><Orange2>만 들어간다.
		this.ob = ob;
	}

}

public class Generics2 {

	public static void main(String[] args) {

		Box2<Apple2> aBox = new Box2<Apple2>(); // 각 타입별로만 사용가능하다.
		Box2<Orange2> oBox = new Box2<Orange2>();
		Box2<String> sBox = new Box2<String>();

		aBox.setOb(new Apple2());
		oBox.setOb(new Orange2());

		Apple2 ap = aBox.getOb();
		Orange2 or = oBox.getOb();
		System.out.println(ap);
		System.out.println(or);

//		aBox.setOb("new Apple2()"); //이런 실수를 막기 위해서 Apple2에 관련된 것만 들어갈 수 있다.
	}

}
