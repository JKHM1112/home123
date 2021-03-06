package polymorphism;

import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV{
	private Speaker speaker;
	private int price;
	
	public LgTV() {
		System.out.println("lgTV 생성자");
	}
	
	public LgTV(Speaker speaker) {
		System.out.println("===> lgTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public LgTV(Speaker speaker, int price) {
		System.out.println("===> lgTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.print("lgTV ---- 전원 켠다.");
		System.out.printf("가격 : %d\n", price);
	}
	public void powerOff() {
		System.out.println("LgTV ---- 전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
