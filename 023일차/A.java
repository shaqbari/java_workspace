/*override 100% 모든게 일치
overloading 메소드 이름만 일치(반환형 상관x)
*/

public class A {
	public void doit() {
	
	}

//오버로딩 불인정
//return값의 자료형은 상관없이 이름은 같고
//매개변수의 자료형이 다르거나, 수가달라야한다.
	public String doit() { 
		
		return "a";
	}
	
	public double doit(int x) {
		return 1.0;
	}
}