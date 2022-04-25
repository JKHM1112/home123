class Tv {
	//Tv의 속성(멤버변수)
	String color;			//색상			null
	boolean power;			//전원상태{on/off}	false
	int channel;			//채널			0
	
	void power()	{
		power = !power;}		//Tv를 키고끄는 메서드
	void channelUp()	{
		++channel; }	//Tv의 채널을 높이는 메서드
	void channelDown()  {
		--channel; }	//Tv의 채널을 낮추는 메서드
}
public class Ex6_01 {
	public static void main(String[] args) {
		//Tv t=new Tv();
		Tv t;				//Tv인스턴스를 참조하기 위한 변수 T를 선언
		t=new Tv();			//Tv인스턴스를 생성한다.
		t.channel =7;		//Tv인스턴스의 멤버변수 channel의 값을 7로 호출한다.
		t.channelDown();	//Tv인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은" + t.channel + " 입니다.");
	}
}