//applebox에는 apple만 orangebox에는 orange만 담겠다.

class Apple {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Orange {
	@Override
	public String toString() {
		return "orange";
	}
}
//(1)
//class AppleBox {
//	private Apple ap;
//
//	public Apple getAp() {
//		return ap;
//	}
//
//	public void setAp(Apple ap) {
//		this.ap = ap;
//	}
//
//}
//
//class OrangeBox {
//	private Orange or;
//
//	public Orange getOr() {
//		return or;
//	}
//
//	public void setOr(Orange or) {
//		this.or = or;
//	}
//
//}

//(2)
class Box {
	private Object ob;

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}

}

public class Generics {

	public static void main(String[] args) {
//(1)
//		AppleBox aBox = new AppleBox();
//		OrangeBox oBox = new OrangeBox();
//		
//		aBox.setAp(new Apple());// 애플은 애플에 오렌지는 오렌지에 집어 넣겠다.
//		oBox.setOr(new Orange());
//
//		Apple ap = aBox.getAp();
//		System.out.println(ap);
//
//		Orange or = oBox.getOr();
//		System.out.println(or);
//(2)
		Box aBox = new Box();
		Box oBox = new Box();

		aBox.setOb(new Apple());
		oBox.setOb(new Orange());

		Apple ap = (Apple) aBox.getOb(); // Object타입으로 받았기 때문에 Apple타입으로 형변환
		System.out.println(ap);

		Orange or = (Orange) oBox.getOb();
		System.out.println(or);
	}

}
