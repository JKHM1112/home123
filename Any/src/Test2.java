public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
		throw new RuntimeException();
		} catch(Exception asd) {
			System.out.println( 2);
		}
	}
}
//java.lang.Exception: 고의로 발생시켰음
//at Test2.main(Test2.java:4)
//프로그램이 정상 종료되었음.