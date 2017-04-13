/*아래의 클래스에서 멤버변수중 그 변수의 자료형이
객체형인 경우만, has a관계라고한다.
즉 관계라 하면 사물을 대상으로 한다.*/

package auto;

public class CarBody{
	int price; //기본자료형이므로 has a관계가 아니다.
	//초기화안하면 0으로 컴파일러가 자동초기화 한다. 
	String name; //has a관계

	Handle h;
	Engine e;
	Wheel w; //has a관계
	/*객체자료형의 컴파일러에 의한 디폴트 초기화의 값은?
	아무런 객체를 가리키고 있지 않은 레퍼런스변수는 null로 초기화된다.
	null은?? 값이 없다는 뜻이다.
	*/

	boolean airType; //false;

	public CarBody(){
		this.h=new Handle();
		this.e=new Engine();
		this.w=new Wheel();
	}
}
