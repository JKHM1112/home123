/*Member inner class*/

class Outer2{
	
	private int num=0;
	
	class Member{
		void add(int n) { num += n;}
		int get() {return num;}
	}
}
public class MemberClass1 {

	public static void main(String[] args) {
		
		Outer2 out1 = new Outer2();
		Outer2 out2 = new Outer2();
		//o1과 o2가 Outer에 각 각 있고 그들이 각 각 add와get을 가지고 있다.
		Outer2.Member o1 = out1.new Member();
		Outer2.Member o2 = out2.new Member();
		
		o1.add(5);
		System.out.println(o1.get());
		o2.add(10);
		System.out.println(o2.get());
		
	}

}
