public class Ex5_11 {
	public static void main(String[] args) {

		// 빈도수 구하기
		
		int[] numArr = new int [10];     //방 10개 생성
		int[] counter = new int [10];	//방 10개 생성
		
		for (int i =0; i<numArr.length; i++) {   //랜덤한수 0~9까지 10번 실행
			numArr[i] = (int)(Math.random()*10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i=0; i<numArr.length; i++) { //10번 실행하는데 numArr에 저장된 수가 counter에 저장되서 증가한다.
			counter[numArr[i]]++;
		}
		
		for (int i=0; i<numArr.length; i++) {     //counter를 출력한다.
			System.out.println(i+"의 개수 : "+ counter[i]);
		}
	}   //main
}