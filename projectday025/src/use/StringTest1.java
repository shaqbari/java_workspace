/*String에 대해 자세히 알아보기
java.leng은 import하지 않아도 자동으로 import된다.
*/

package use;

class StringTest1{
	public static void main(String[] args){
		//implicit(묵시적, 암시적) 생성법
		//마치 일반변수처럼 생성하는 기법
		//heap영역의 상수풀(constant pool)에 있는 상수의 주소를 가리키게 된다.
		//중복되는 상수가 있을 경우 같은 주소값을 가지게 된다. 
		String s1="korea";
		String s2="korea";
		/*묵시적 생성법으로 String 객체를 생성하면 constant Pool에 객체가 생성되므로
		이미 존재하는 문자열 객체일 경우 중복생성하지 않는다.
		따라서 아래의 비교연사자는 주소비교였다.*/

		//explicit(명시적) 생성법
		//new에 의한 객체생성법을 그대로 사용한 기법
		//명시적 기법으로 많은 문자열객체를 생성하면 엄청난 메모리 낭비를 하게 된다.
		String s3=new String("korea");
		String s4=new String("korea");
		//s3와 s4는 reference변수이다.

		System.out.println(s1==s2); //true출력된다. 여전히 주소를 비교한것이다.
		System.out.println(s1.equals(s2)); //true출력된다.
		
		System.out.println(s3==s4); //false출력된다.
		System.out.println(s3.equals(s4)); //true출력된다.
		//equals()메소드를 쓰면 내용비교가 가능하다.
	}
}
