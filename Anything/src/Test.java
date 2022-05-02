public class Test {												
	public static void main(String[] args) {
		
		System.out.println("첫번쨰꺼");
		A c1 = new C(1,2,3);	//C한테 참조하지만 A만 가능
		B c2 = new C(1,2,3);	//C한테 참조하지만 A,B가 가능
		C c3 = new C(1,2,3);		//C는 A,B,C를 다 받는다.
		System.out.println(c1.a);
		System.out.println(c2.a+","+c2.b);
		System.out.println(c3.a+","+c3.b+","+c3.c);
		
		System.out.println("두번쨰꺼");
		
		A c4 = new D();		//D한테 참조하지만 A만 가능
		System.out.println(c4.a);
		
		System.out.println("세번쨰꺼");
		
		c3.funcA();
		c3.funcB();
		c3.funcC();
		
		System.out.println("네번쨰꺼");
		
		if(c3 instanceof B) {	//c가 참조하고있는 대상이 B를 상속한 아이(C)
		A cc = (C)c3;
		cc.funcA();
//		cc.funcB();
//		cc.funcC();
		}
		
		System.out.println("다섯번쨰꺼");
		
		if(c3 instanceof B) {	//c가 참조하고있는 대상이 B를 상속한 아이(C)
		C ccc = (C)c3;
		ccc.funcA();
		ccc.funcB();
		ccc.funcC();
		}
		
		System.out.println("여섯번쨰꺼");
		
		A c5 = new C(100,200,300);
		if(c5 instanceof B) {
			B cc = (B)c3;
			cc.funcA();
			cc.funcB();
		
		System.out.println("일곱번쨰꺼");
		A a = new C(100,200,300);
		a.funcA();
		
		}
	}
}

class A{
	int a;
	A(){};
	void funcA() {
		System.out.println("aaa");
	}
	public A(int a) {
		this.a =a;
	}
}
class B extends A{
	int b;
	B(){};
	void funcB() {
		System.out.println("bbb");
	}
	public B(int a, int b) {
		super(a);
		this.b =b;
	}
}
class C extends B{
	int c;
//	C(){};
	void funcC() {
		System.out.println("ccc");
	}
//	public C() {		84~86
//		this(0,0,0);
//	}
	
//	public C(int i, int j) {		88~90
//		this(i,j,0);
//	}
	
//	public C(int i, int j, int k) {		//91~94
//		super(i,j);
//		this.c=k;
//	}
	
	public C(int a,int b, int c) {		//96~98
		super(a,b);
		this.c =c;
	}
}

class D extends A {
	int d;
//	D(){};
	D() {
		super(100);
	}
	void funcD () {System.out.println("DDDD");
	}
}