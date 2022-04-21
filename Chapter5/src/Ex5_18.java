public class Ex5_18 {
	public static void main(String[] args) {
		int [][] score = {
							{100,100,100},
							{20,20,20},
							{30,30,30},
							{40,40,40}
			};
		int sum =0;
		
		for(int i=0; i<score.length; i++) {          //printf에 그대로 작성
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		for (int[] tmp : score) {       //score가 다차원 배열이니까 1차원 배열로 변경
			for( int i : tmp) {			//score가 tmp가 되었다가 i가 된다.
				sum +=i;            //i는 더해진다.
			}
		}
		System.out.println("sum="+sum);
	}   //main
}