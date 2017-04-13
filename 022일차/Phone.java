/*자바의 메소드에 대해 학습한다.
	1.매개변수 있는 함수
	2.반환값 있는 함수
*/

class Phone{	
	//매개변수 있는 메소드
	public void call(int a){	//java에서는 메소드의 매개변수도 자료형이있어야한다.
		System.out.println(a);
	}

	public void call2(int a){	//java에서는 메소드의 매개변수도 자료형이있어야한다.
		System.out.println(this); //this란 생성될 인스턴스자신을 말한다.
		//this란? 인스턴스가 자기자신을 가리키기 위한 레퍼런스변수이다.

		this.getPrice(); 
		//가능 Phone이 인스턴스화 되어 heap에 같이 올라가기 때문에. this를 빼는것이 자연스럽다.
	}

	//반환값이 있는 메소드
	//반환값이 있을 경우엔 반드시
	//그 반환값에 해당하는 자료형을 명시해야 한다.(메소드형 앞에....)
	public int getPrice(){ //반환값이 있는 경우 void대신 반환값의 자료형을 써준다.
		return 5;		
	}

	public static void main(String[] args){
		/*Phone은 인스턴스 메소드만들 보유하고 있으므로, 메소드를 사용하기 위해서는
		먼저 phone의 인스턴스를 메모리에 생성함이 우선이다.*/
		Phone p=new Phone();
		p.call(70);

		p.call2(70);
		System.out.println(p);	//p는 멤버변수라 주소가 출력된다.
	
		p.getPrice(); //5라고 쓴거나 마찬가지

		//반환형이있는 메소드는 데이터나 마찬가지이므로 호출후 변수에 담거나 출력
		int y=p.getPrice();
		System.out.println(y);

		//System.out.println(p.call(70)); return값이 없어서 매개변수로 사용하지 못한다.
	}
}
