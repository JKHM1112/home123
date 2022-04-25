class A {
static int abc=100;
}
class Test{
	public static void main(String[] args) {
		System.out.println("A.abc = " + A.abc);
		A a1 = new A();
		a1.abc=200;
		System.out.println("a1.abc = " + a1.abc);
}
} 