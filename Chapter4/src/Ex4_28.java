import java.util.*;
public class Ex4_28 {
	public static void main(String[] args) {
		int input =0, answer=0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하세요.");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수를 입력하세요");
			}
		} while(input!=answer);
		
		System.out.println("정답입니다.");
	}
}