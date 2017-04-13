class Desk{
	//String color="red"; //멤버변수이면서 인스턴스 변수
	static String color1="green"; //static

	public void up(){
		String color2="black"; //color2앞에는 this가 생략된것이다.
	}

	public static void main(String[] args){
		//color="yellow";	//color는 인스턴스 변수이기 때문에 인스턴스를 만든적이 없어서 컴파일오류
		//System.out.println(color);

		System.out.println(Desk.color1); //color1은 static이라 이렇게 클래스명. 으로 접근하는 것이 원칙
	}
}
