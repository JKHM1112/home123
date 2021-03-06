public class Ex5_06 {
	public static void main(String[] args) {

		//최대값과 최소값
		
		int [] score = {79, 88, 91, 33, 100, 55, 95};        //score의 배열을 만든다.
		
		int max = score[0];            //최대값의 초기값을 잡는다.
		int min = score[0];             //최소값의 초기값을 잡는다.
		
		for(int i=1; i <score.length; i++) {    //score배열 0번부터 순서대로
			if(score[i] >max) {          //score[i]가 max보다 크면 score[i]값이 max가 된다.
				max = score[i];
			} else if(score[i] < min ) {   //score[i]가 min보다 작으면 score[i]값이 min이 된다.
				min = score[i];
			}
		}  //end of for
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " +min);
	}   //main
}