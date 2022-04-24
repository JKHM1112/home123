public class Ex4_22 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int sum =0;
		
		for(int i=0; i<arr.length; i++)         //그냥 순서대로 넣은것이다.
			System.out.printf("%d ", arr[i]); 
		System.out.println();
		for(int tmp : arr) {       //arr를 int tmp에 순서대로 넣어라.
			System.out.printf("%d ",tmp);
			sum+=tmp;
		}
		System.out.println();
		System.out.println("sum="+sum);
	}
}