//은행계좌를 정의한다.
/*
데이터를 보호하기 위한 자바의 보안관련 4가지 접근제한자!
public<protected<default<private

개발자가 접근제한자를 지정하지 않으면 default 접근제한자가 적용된다.
주의) default 접근제한자는 명시해서는 안되고 그냥 냅두면 된다.

public: 보안이 아니다! 모든 크랠스가 접근할 수 있다.

protected: 상속관계에 있는 클래스간 접근 허용
				+같은 패키지내에 있는 클래스

default: 같은 패키지내에 있는 클래스만 접근 허용

private: 외부의 모든 클래스의 접근을 불허!
			멤버메서드만이 접근 가능

객체지향 언어에서, private로 막아놓은 변수를 제어할 수 있도록
정의되는 메소드들은 전세계개발자들간의 명명규칙을 따라 정의해야 한다.
값 변경을 위한 메소드를 setter라 하고,
값 반환받기 위한 메소드를 getter라 한다.
getter/setter 표기규칙
단어와 단어가 만나면 뒷단어의 첫철자를 대문자로 표기해야 한다.

은닉화란?
-클래스의 데이터를 담는 변수에 대한 접근을 private로 제한을 가하고,
이 변수에 대해 제어할 수 있는 방법을 메소드를 통해 제공하는 클래스 작성기법을
은닉화, 캡슐화(encaptualation)라 한다. 리모컨을 생각하자
*/

class Account{
	String num="123-465-789";
	String name="seonghyun";
	private int money=30000000;

	public void test(){
		money=10000;
	}

		/*데이터의 직접 접근은 막고 이 데이터에 대한 사용은 개발자가 제공하는
	매서드에 의해 제어할 수 있도록허용해 주자*/
	public void setMoney(int money){
		if(money<0){
		
		}//메소드에 이것저것 추가할 수 있다.

		this.money=money;
	}

	public int getMoney(){
		return this.money;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}
}
