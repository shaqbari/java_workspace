/*
자바의 자료형은 총 4개이며 객체자료형도 자료형이다.
따라서 기본자료형에서의 형변환의 원칙이 객체자료형에도 적용된다.!
*/

package animal.fish;
public class Nimo extends Fish{
						/*is a*/
	/*상속관계(is a)에서 같은 자료형이 된다.*/
	public String name="난 니모야"; //public 안쓰면 default가 기본형이므로 다른패키지에서 쓸수 없다.

	/*사용자가 생성자 따로 정의하지 않으면 다음과같은 default생성자가 생성되는데
	String인 자료형의 인자가 없는 생성자를 super()로 호출하고 있어 에러난다.
	public Nimo(){
		super();
	}
	*/

	public Nimo(){
		super("참치");
	}

	public void swim(){
		System.out.println(super.name+"가 수영해요");
		/*하위클래스는 상위클래스의 자료형에 그냥 접근할수 있지만
		이경우는 변수이름이 같으므로 super를 써줘야한다.
		안쓰면 this가 생략된것으로 보고 Nimo의 name을 출력하게 된다.*/
	}
}
