/*생성자 정의 규칙
1)클래스 명과 동일할것
2)반환형을 두지 말것!!
*/

class Ghost{
	String type;
	String color;

/*거푸집에서 귀신을 생성할때 어떤 스타일로 생성할지를 아래의 메소드에서결정*/
	public Ghost(String type, String color){ //객체자료형이 올수도 있다. //void를 써도 안된다. 일반메소드가 되며 내용이 없는 생성자를 호출한다.
		this.type=type;
		this.color=color;
	}

	public void setInit(String type, String color){
		this.type=type;
		this.color=color;
	}

	public static void main(String[] args){
		Ghost g1=new Ghost("주온", "white"); //효율적, 태어나면서 초기화됨
		
		g1.setInit("도깨비", "white"); //태어난 후 성형수술하는 느낌
		
		System.out.println(g1.type);
	}
}
