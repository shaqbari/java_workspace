/*아래의 조건으로 클래스를 작성하시오
1. 원하는 대상 결정하여 클래스화 시킴
2. 멤버변수 2개
3. 멤버 메소드 2개
*/

package test;
public class NoteBook{
	String name="내 노트북";
	int price=1000000;

	public void setPrice(int price){
		this.price=price;
	}

	/*아래와같이 주석의 앞에 별이 두개 있으면 javadoc으로 생성하는 사용자api문서에 메소드에 대한 설명이 입력된다.*/

	/** price값을 얻어오는 메소드를 정의한 것이에요*/
	public int getPrice(){
		return this.price;
	}
}
