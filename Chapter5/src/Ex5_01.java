public class Ex5_01 {
	public static void main(String[] args) {

		int [] score = new int[5];     // score에 5개의 배열을 만들었다.
		int k =1;         // int k의 값은 1이다.
		
		score[0]=5;         //score[0]번째 배열의 값은 5이다.
		score[1]=60;        //60이다.
		score[k+1]=70;   //score[2]=70;      70이다.
		score[3]=80;             //80이다.
		score[4]=90;             //90이다.
		
		int tmp = score[k+2] + score[4];   //int tmp의 값은  k3인 80에 k4인 90을 더한 값이다. 
		
		//for문으로 배열의 모든 요소를 출력한다.
		for(int i=0; i<5; i++) {            //i를 0~4까지 1씩 증가를 반복한다.
			System.out.printf("score[%d]:%d%n",i,score[i]);    //i값은 score[i]이다.
		}
		
		System.out.printf("tmp:%d%n", tmp);         //tmp는 170이다
		System.out.printf("score[%d]: %d%n", 7,score[7]);        //score[7]값은 없다.
	}   //main

}
