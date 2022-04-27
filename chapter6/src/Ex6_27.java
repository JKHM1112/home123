public class Ex6_27 {
	
	int a,b,c ;
	static 
	
	{//인스턴스 초기화 블럭
		System.out.println("{ }");
	}
	{
		System.out.println("static { }");
		a=10;
		b=20;
		c=30;
	}
	public Ex6_27() {
		System.out.println("생성자");
	}
	public void func() {
		System.out.println("num :");
	}
	public void func2() {
		func();
		System.out.println("num :");
	}

	public static void main(String[] args) {
		System.out.println("Ex6_27 bt = new Ex6_27() ; ");
		Ex6_27 bt = new Ex6_27();
		
		System.out.println("Ex6_27 bt2 = new Ex6_27() ; ");
		Ex6_27 bt2 = new Ex6_27();
		System.out.println(bt2.a);
		
		System.out.println("Ex6_27 bt3 = new Ex6_27() ; ");
		Ex6_27 bt3 = new Ex6_27();
		System.out.println(bt3.a);
	}
}