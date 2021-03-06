public class Ex5_04 {
	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D' };        //문자 배열이 있다.
		char [] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};  // 숫자 배열이 있다.
		System.out.println(abc);      //abc출력 ABCD
		System.out.println(num);        //num출력    0123456789
		
		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char [abc.length+num.length];      //10개의 빈 배열이 있다.
		System.arraycopy(num, 0, result, 0, abc.length);          //0123
		System.arraycopy(num, 0, result, abc.length, num.length); //    0123456789
		System.out.println(result);             //01230123456789
		
		//배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);      //ABCD456789
		System.out.println(num);
		
		//number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);     // ABCD45ABC9
		System.out.println(num);
		
	}   //main
}
