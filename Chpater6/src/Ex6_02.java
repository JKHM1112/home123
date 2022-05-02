class Tv2 {
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
public class Ex6_02 {
	public static void main(String[] args) {
		Tv2 t1=new Tv2();
		Tv2 t2=new Tv2();
		System.out.println("t1 채널은 " + t1.channel + " 입니다.");
		System.out.println("t2 채널은 " + t2.channel + " 입니다.");
		
		t1.channel =7;		//Tv인스턴스의 멤버변수 channel의 값을 7로 호출한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		System.out.println("t1 채널은 " + t1.channel + " 입니다.");
		System.out.println("t2 채널은 " + t2.channel + " 입니다.");

	}
}