public class Ex5_08 {
	public static void main(String[] args) {

		// 섞기
		
		int [] ball = new int[45];
		
		for(int i=0; i<ball.length; i++)         
			ball[i] = i+1;        //이래야지 ball[0]에 1이 저장된다.
		
		for(int i=0; i<6; i++) {
			int j = (int)(Math.random()*45);        //ball[i]값에다가 랜덤으로 뽑힌 수를 0번부터 순서대로 넣는다.
													//말이 넣는다지 실제로는 값이 밀리는 거다.
			int tmp = ball[i];						// ex) i0의 값이 tmp로 가고 j20이 i0번으로 가고 i0이 20이 되는거다
			ball[i]=ball[j];						//어떻게 보면 수를 뺴앗겼다고 볼 수 있다.
			ball[j]=tmp;
		}
		
		for(int i=0; i<6; i++)        //i<6을 i<45로 변경하면 알 수 있다.
			System.out.printf("ball[%d]=%d%n", i, ball[i]); //ball[i]의 0번부터 5번까지 값을 구하라
	}   //main

}
