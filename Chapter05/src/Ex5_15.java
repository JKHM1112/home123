public class Ex5_15 {
	public static void main(String[] args) {
		int[][] score = {						//[가로][세로]
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
				};
int sum =0;

for(int i =0; i<score.length;i++) {
	for(int j=0; j<score[i].length; j++) {     //0번째 0,1,2 1번째 0,1,2 2번째 0,1,2의 값
		System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
	}
}

for (int[] tmp : score) {     //score값을 tmp배열로 만들고
	for (int i : tmp) {         //tmp배열을 i를 통해 sum에다가 순서대로 더한다.
		sum +=i;
	}
}

System.out.println("sum="+sum);
	}   //main
}