package auto;
//같은 패키지내라 import할 필요없다.
class UseCar{
	public static void main(String[] args){
		CarBody cb=new CarBody();

		/*
		//w가 null이 아니게 해보자
		cb.w=new Wheel(); //바퀴를 올린다.
		cb.h=new Handle();
		cb.e=new Engine();
		위와 같이 만드는 것은 차몸체만 오고 다음에 타이어, 핸들, 엔진이 따로 배달오는격
		CarBody의 생성자 정의할때에 인스턴스를 생성해서
		인스턴스 만들때 생성자에서 자동호출되게 하는것이 좋다.
		*/

		System.out.println(cb.w);
	}
}
