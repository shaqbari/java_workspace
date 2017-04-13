public class Desk {
	int x; //인스턴스변수
	static int y;
	
	{ /*A 인스턴스 초기화 블럭
		이 클래스로부터 인스턴스가 생성될때마다 호출된는 영역,
		즉 인스턴스의 초기화 담당!
		int x=10;과의 차이점: 초기화블럭을 이용하면 로직에 의해 초기값을 이용할수 있다.
	*/
		for(int i=0;i<10;i++){
			x++;
		}
	}
	
	
	static { /*B 스태틱 초기화 블럭
		이 클래스의 바이트 코드가 static으로 로드 될때	호출되는 영역	*/
		for(int i=0;i<20;i++){
			y++;
		}
	}
	
	public static void main(String[] args){
		//System.out.println(x); //C x는 인스턴스 변수이므로 생성되야만 쓸수있다.
		int a=new Desk().x; //D
		System.out.println(a); //E
		System.out.println(y); //F
		
	}
}