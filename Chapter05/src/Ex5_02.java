import java.util.*;   // Arrays.toString()을 사용하기 위해 추가

public class Ex5_02 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];      //iArr1에 배열 10개 생성
		int[] iArr2 = new int[10];        //iArr2에 배열 10개 생성
//		int[] iArr3 = new int[] {100,95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};          //iArr3에 해당하는 숫자의 배열생성
		char[] chArr = {'a', 'b', 'c', 'd'};            //chArr에 해당하는 문자의 배열생성
		
		for (int i=0; i < iArr1.length ; i++) {    //0~9의 1씩 증가하는 값을 반복
			iArr1[i] = i + 1;   // 1~10의 숫자를 순서대로 배열에 넣는다.
		}
		
		for (int i=0; i < iArr2.length ; i++) { //0~9의 1씩 증가하는 값을 반복
			iArr2[i] = (int) ( Math.random()*10) + 1;   // 1~10의 랜덤 값을 iArr2에 저장
		}
		
		// 배열에 저장된 값들을 출력한다.
		for(int i=0; i < iArr1.length; i++) {       //0~9의 1씩 증가하는 값을 반복      
			System.out.print(iArr1[i]+",");       //11번줄에서 생성된 값을 출력
		}
		System.out.println(); 
		System.out.println(Arrays.toString(iArr2));   //16번줄에서 생성된 랜덤값 출력
		System.out.println(Arrays.toString(iArr3));     //iArr3 배열 형태로 출력
		System.out.println(Arrays.toString(chArr));     //chArr 배열 형태로 출력
		System.out.println(iArr3);        
		System.out.println(chArr);      //문자 그대로 출력
	}   //main

}
