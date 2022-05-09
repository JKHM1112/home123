class Tv3 {
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
public class Ex6_3 {
	public static void main(String[] args) {
		Tv3 t1=new Tv3();
		Tv3 t2=new Tv3();
		System.out.println("t1 채널은 " + t1.channel + " 입니다.");
		System.out.println("t2 채널은 " + t2.channel + " 입니다.");
		
		t2 = t1;
		t1.channel =7;		//Tv인스턴스의 멤버변수 channel의 값을 7로 호출한다.
		System.out.println("t1 채널을 7로 변경하였습니다.");
		System.out.println("t1 채널은 " + t1.channel + " 입니다.");
		System.out.println("t2 채널은 " + t2.channel + " 입니다.");

	}
}