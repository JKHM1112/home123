import java.util.Arrays;

public class Ex5_14 {
	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i < src.length(); i++) {       //src에 배열 순서에 따라서 ch에 값을 넣는다. 
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"):"+ch);
		}
		char [] chArr = src.toCharArray();    //src를 chArr에 대입한다.
		
		System.out.println(chArr);
		System.out.println(Arrays.toString(chArr));
	}   //main
}