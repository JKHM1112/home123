import java.util.Arrays;

public class Ex5_09 {
	public static void main(String[] args) {

		// 임의의 값으로 배열 채우기
		
		int[] code = { -4, -1, 3, 6, 11};   //code배열이 있다.
		int[] arr = new int [10];        //arr에 빈 배열 10개를 만든다.
		
		for (int i=0; i<arr.length; i++) {     //10반 반복한다.
			int tmp = (int)(Math.random()*code.length);   //코드 갯수가 최대값인 tmp인 랜덤수를 만든다.
			arr[i] = code[tmp]	;                        //tmp가 code[tmp]의 해당되는 값이 arr[i]의 빈 공간에 간다.
			}
		System.out.println(Arrays.toString(arr));    //arr[0]~arr[9]까지 공간이 다 차면 arr을 배열형태로 실행한다.
	}   //main
}