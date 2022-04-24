import java.util.*;
public class Ex4_11 {
	public static void main(String[] args) {
		System.out.println("당신의 주민등록번호를 입력하세요. (012345-7890123)");
		
		Scanner sc= new Scanner(System.in);
		String regNo =sc.nextLine();     //문자열 입력
		
		char gender = regNo.charAt(7);    //
		
		switch(gender) {
			case '1': case '3':
				switch(gender) {
				case '1':
					System.out.println("당신은 2000년 이전 남자.");
					break;
				case '3':
					System.out.println("당신은 2000년 이후 남자.");
				}
				break;
			case '2': case '4':
				switch(gender) {
				case '2':
					System.out.println("당신은 2000년 이전 여자.");
					break;
				case '4':
					System.out.println("당신은 2000년 이후 여자.");
					break;
				}
				break;
			default:
				System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}
}