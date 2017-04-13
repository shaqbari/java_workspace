/*
나와는 다른 위치에 존재하는 Horse를 써보자
자바는 나와는 다른 패키지에 있는 클래스를 참조시 오직 classpath 환경변수만 쳐다본다.
따라서 아래의 import문에 animal.Horse의 경우 그 앞에 환경변수의 값이 생략되어 있다고
이해하면 된다.
*/

package use;
//import D:\google\쌍용교육센터\java_workspace\myproject\bin\animal\Horse.class //내가 사용할 객체의 경로를 명시
//위는 윈도우에서만 가능 자바의 슬로건(write once run anywhere)에 해당하지 않는다.

import animal.Horse; //앞에 잘린 경로를 os에 등록해야 한다.
//윈도우 path는 일반파일을 대상으로하는 환경변수이다.
//그러므로 .class 파일을 위한 환경변수로 classpath로 추가하고 위의 잘린 경로를 알려준다.
//패키지화 되어있는 클래스는 classpath가 등록되어있을 경우 사용하려면 java 패키지명.클래스명을 치면 된다.
//이경우 java use.UseHorse를 쓰면 된다.
//desktop기반의 프로그램 배포할때는 해당 os의 classpath를 설정하는 과정이 있어야 한다. 요즘에 install wizard에 포함됨
//프로젝트가 여러개일 경우 ;를 찍고 다른 경로를 추가한다.
//맨 앞에 .;을 쓴다. 해당디렉토리에 class를 먼저 찾도록 ;쓰고 한칸뛰면 안된다.

class UseHorse{
	public static void main(String[] args){
		Horse h=new Horse();
		System.out.println("UseHorse 실행");
	}
}
