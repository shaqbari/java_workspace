/*
백인, 흑인, 황인종을 아우르는 최상위 객체를 정의해 보자.
왜? 공통코드는 중복작성하지 말고, 재사용하기 위해서
*/

package human;
public class Person{
	String name="나사람";	
	
	public void talk(){
		System.out.println("사람이 말한다");
	}
	public void useTool(){
		System.out.println("사람이 도구를 쓴다");
	}
}
