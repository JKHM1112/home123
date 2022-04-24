public class Ex5_07 {
	public static void main(String[] args) {

		//섞기
		
		int [] numArr = new int[10];
		
		for (int i=0; i< numArr.length; i++) {       //1~10의 수를 그대로 입력한다.
			numArr[i] =i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {                      //뒤에 조건을 100번 실행한다.
			int n = (int)(Math.random()*10);        //랜덤한 수를 가져온다.
			int tmp = numArr[0];                   //그 후 순서를 미룬다
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for (int i=0; i<numArr.length; i++)       //실행된 numArr[i]을 10번 입력한다.
			System.out.print(numArr[i]);
	}   //main
}
