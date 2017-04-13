/*
String에 대해 좀더 알아보자
*/

package api;

class StringTest{
	
	public static void main(String[] args){
		//String은 불변이다.!!(immutable)
		String str="korea";
		str=str+"fighting"; //위아래 두개의 문자열은 독립적으로 존재(주소가 따로따로)
		//여기서 korea가 수정될것으로 생각되지만 사실상 String은 한번 생성되면 절대
		//변경되지 않는 상수다.
		
		for(int i=0; i<100; i++){
			String str1="korea";
			str1=str1+i; //위아래 두개의 문자열은 독립적으로 존재()
		}//이렇게 for문을 쓰면 순식간에 String객체가 백개 만들어진다. 많이쓰면 메모리가 꽉참

		/*해결책) String을 이용하여 많은 문자열을 조합하려고할때는 어떻게 해야하나?
		변경가능한 문자열을 처리해주는 api이용
		StringBuffer*/
		StringBuffer sb=new StringBuffer(); //java.lang에 들어있어서 import쓰지 않아도된다.
		//StringBuffer에 추가될뿐이며 새로운 문자열상수를 생성하지 않는다. 즉 1개로 개발가능
		sb.append("korea");
		sb.append("fight");
		sb.append("and");
		sb.append("forever");
		/*sb는 String이 아니기 때문에 println인수로 넣으면
		자동변환되긴 하지만 정석대로 개발한다면 String형으로 변환해야
		한다. Object라는 최상위 객체가 보유한 메서드 중 객체를 String으로
		변환해주는 메소드가 있다. 바로 toString()*/
		System.out.println(sb.toString());
	}
}
