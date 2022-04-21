public class Ex5_03 {
	public static void main(String[] args) {
		int[] arr = new int[5];       //빈 배열5개가 있다.
		
		//배열 arr에 1~5를 저장한다.
		for(int i=0; i < arr.length; i++)      //순서대로 저장한다.
			arr[i] = i +1;
		
		System.out.println("[변경전]");
		System.out.println("arr.length:;"+arr.length);      
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);     //arr[i]번쨰는 i이다.
		
		int[] tmp = new int[arr.length*2];      //길이 2배 증가 new int 써준다.
		
		//배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		for(int i=0; i < arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp; //tmp에 저장된 값을 arr에 저장한다.
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length);    //길이는 2배 증가했지만 값은 옮겨진것이여서 arr4까지만 존재한다.
		for(int i=0; i < arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
	}

}
