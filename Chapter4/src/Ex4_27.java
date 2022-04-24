import java.util.*;
public class Ex4_27 {
	public static void main(String[] args) {
		int num;
		int sum=0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");
		
		while(flag) { //현재 flag는 true 이므로 조건식은 참이다.
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum+=num;
			} else {             //0을 입력하면 while문은 false가 되서 끝난다.
				flag = false;
			}
		}
		System.out.println("합계: " + sum);
	}
}