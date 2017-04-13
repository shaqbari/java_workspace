/*
sun에서 제공하는 수많은 클래스들의 집합을 가리켜 APO라고 하며,
이 API객체들이 대한 설명서를 가리켜 API Document라고 한다.
*/

package use;
class Test{
	int a=3;
	//Dog d; import하지 않으면에러난다.
	String s; //import 하지 않아도 에러 안난다.
	/*String 클래스도 sun에서 제공하는 기본api객체중 하나였다.
	또한 java.lang패키지는 언어작성시 너무나 기본적으로 필요한 것들이므로
	개발자가 import하지 않아도 된다.*/

	public static void main(String[] args){
		Test t=new Test();

		System.out.println(t.a);

		
		String str="korea vs japan";

		char c=str.charAt(2);
		System.out.println(c);

		for(int i=0; i<str.length(); i++){
			char c1=str.charAt(i);
			System.out.print(c1); //결과를 가로로 출력
		}
		/*
		for(){
			char c=str.charAt(io)
		}
		*/
		
		//a vs j를 출력해보자
		String c2=str.substring(4, 10);
		System.out.println(c2);

		//도중에 다른 문자가 와도 a vs j를 출력해보자
		String str1="koreaaaaa vs jjjjapan";
		
		int index=str1.indexOf(" ");//첫번째로 발견되는 공백문자의 index를 반환받는다
		String ch=str1.substring(index-1, index+5);
		System.out.println(ch);

		//(1) 문자열에서 4번째 위치한 'e' 문자만 추출하여 출력하세요. 
			char c01=str.charAt(3);
			System.out.println(c01);
		//(2) 문장 중 첫번째 a의 index (순번)를 출력하세요.
			int index02=str.indexOf("a");
			System.out.println(index02);

		//(3) 문장 중 마지막 a의 index 를 출력하세요
			int index03=str.indexOf("a", 11);
			System.out.println(index03);

			int startIndex=0;
			int indexBefore=str.indexof("a", startIndex)


		//(4) 문자열의 총 길이를 출력하세요.
			int length04=str.length();
			System.out.println(length04);

		//(5) korea 를 "코리아"로 대체하여 "코리아 java"를 출력하세요.
			String ch05=str.replace("korea", "코리아");
			System.out.println(ch05);
		//(6) 3번째부터 8번째 문자열까지 추출하여 출력하세요.
			String ch06=str.substring(2,8);
			System.out.println(ch06);
	
		//(7) 대문자로 변환하여 "KOREA JAVA" 를 출력하세요.
			String ch07=str.toUpperCase();
			System.out.println(ch07);

	}
}
