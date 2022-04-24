public class Ex5_05 {
	public static void main(String[] args) {
		
		//배열의 총합

		int sum =0;           
		float average = 0f;
		
		int [] score = {100, 88, 100, 100, 90};       //score에 배열 값들 만든다.
		
		for(int i=0; i<score.length; i++) {     //score의 값들을 순서대로 sum에 더해준다. 
			sum +=score[i];
		}
		average=sum/(float)score.length;       //sum값을 score 배열의 개수만큼 나눈다.
		
		System.out.println("총점: "+ sum);
		System.out.println("평균: " +average);
	}   //main

}
