public class Ex5_12 {
	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"};         //String 배열 3개 있다.
		
		for(int i=0; i<names.length; i++)
			System.out.println("names["+i+"]:"+names[i]);             //name[i]이 출력된다.
		
		String tmp = names[2];          //tmp는 names의 2번째 배열이다. 
		System.out.println("tmp: "+tmp);         // Yi가 출력된다.
		names[0]= "Yu";                   //0번째는 Yu이다.
		
		for(String str : names)         //names를 꺼내서 String str에 차례대로 넣는다.
			System.out.println(str);
	}   //main
}