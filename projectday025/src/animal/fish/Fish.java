package animal.fish;

public class Fish{
	String name="난 물고기";

	/*상속관계에서 부모 클래스가 인수 있는 생성자를 명시할 경우,
	디폴트 생성자를 사용하지 않게 되므로, 에러가 발생할 수 있다.*/ 
	public Fish(String name){
		//super();가 생략된것이다.

	}
	/*
	사용자가 따로 생성자를 정의하지 않으면 다음을 컴파일러가 자동으로 입력한다. 
	public Fish(){
		int x=3; //수퍼가 가장시급한데 이걸 먼저 쓰면 에러가 난다.
		//부모의 생성보다 우선되는 코드는 존재할 수 없기 때문에.. sun의 정책
		super();	  //상속받은것은 없지만 모든객체의 상위 클래스는 object이기때문에 써진다.
	}	
	*/

	public void swim(){
		System.out.println("물고기가 수영해요");	
	}
}
