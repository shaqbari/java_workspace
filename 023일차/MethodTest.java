/*자바언어는 자료형이 총 4개다.
객체자료형도 자료형이다.

메소드 호출시 넘기는 값의 종류는 크게 2가지 유형이 있다
1. 기본 자료형
	- 기본자료형을 메소드의 인수로 넘길때는
	호출시 똑같은 값이 복사되어, 값만 넘어간다.
	따라서 해당 값을 보유한 변수는 영향을 안받는다.
	(call by value). 값만 넘어간다.
2. 객체 자료형
	-메소드 호출시 인수로 넘길 데이터가 객체형일 경우,
	그 주소값이 넘어가므로, 해당객체는 영향을 받는다.
	(call by reference)
*/

class MethodTest{
	public void test1(int a, boolean b, char c, Food x, String s){
	
	}

	public void test2(Food food){
		food.name="김치볶음밥";
	}

	public static void main(String[] args){
		Food f1=new Food();
		System.out.println(f1.name); //돈까스가 출력됨

		//test2는 instance method이다. 그러므로 인스턴스 따로 생성해야한다
		MethodTest mt=new MethodTest();
		mt.test2(f1);
		System.out.println(f1.name); //김치볶음밥이 출력된다.
	}
}
