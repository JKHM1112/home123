public class Ex5_10 {
	public static void main(String[] args) {

		// 정렬하기
		
		int[] numArr = new int[10];
		
		for ( int i=0; i< numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for (int i=0; i<numArr.length-1; i++) { //마지막은 할 필요 없어서 1을 뻇다.
			boolean changed = false;
			
			for (int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {     //num[j]값이 num[j+1]보다 크면 아래식에 따라 교체된다. 이를 반복한다.
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true;
				}
			}    //end for j
			
		if(!changed) break;         //바뀌는게 없으면 종료
		
		for(int k=0; k<numArr.length; k++)     //마지막 numArr값 입력
			System.out.print(numArr[k]);
		System.out.println();
		} //end for k
	}   //main
}