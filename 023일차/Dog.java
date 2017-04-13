/*
메소드는 함수이므로, 일반적인 언어의 함수의 적용되는 원리는 자바의 메소드에도
동일하게 적용된다. 따라서 반환값, 매개변수의 개념이 같다.
*/

class Dog{
	String name="뽀미";
	String type="말티즈";

	public void setName(String n, String type){ //java에서는 매개변수도 자료형 선언해줘야 한다.
		this.name=n; //클래스 원본은 바뀌지 않고 생성된 인스턴스의 name이 바뀐다.
							//여기서는 앞에 this를 안써도 되지만 정확하게 하려면 써주는 것이 좋다.
		this.type=type; //여기서는 앞에  this를 안쓰면 가까운것을 찾아가 지역변수인 매개변수를 찾아가게 된다.
              			    //그러므로 멤버변수와 매개변수 이름이 같을때는 구분하기 위해 this를 꼭 써주자.
	}

	/*
	자바와 같은 일반적인 응용프로그램에서는 (c, c# 등의 대부분의 언어) 
	return값이 있는 함수의 경우, 반드시 해당 리턴값에 알맞은 자료형을
	메서드명 앞에 명시해야 한다.
	*/
	public String getName(){
		return name;
	}
}
