/*
자바언어로도 GUI(Graphic User Interface,
그래픽적으로 어플리케이션을 사용할 수 있도록 제공하는 환경!!)
어플리케이션을 제작할 수 있다.
그리고 자바를 가장 잘 할 수 있는 기회, 찰나이다.

모든 그래픽 프로그램은 윈도우 상에서 실행되므로 자바에서
윈도우를 띄우는 법을 배우자.
*/
package gui;
//java의 lang만 자동 import된다. 나머지는 수동으로 import해야한다.
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Color;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.CheckboxGroup;
import java.awt.TextArea;
/*import java.awt.*; 해도 돌아는 가지만 뭘할건지 알수 없다.
특히 다른사람이*/
class WinTest{
	public static void main(String[] args){
		Frame frame=new Frame();
		/*컴포넌트가 너무 대왕으로 만들어지므로 이 문제를 해결하기 위해
		레이아웃을 적용한다.(이따가 배울것임)*/
		FlowLayout flow=new FlowLayout();
		frame.setLayout(flow); //레이아웃 적용

		
		/*프레임은 디폴트로 보이지 않는 속성을 가진다.
		따라서 보이게 처리하자		*/
		frame.setVisible(true);
		frame.setSize(300, 400);
		frame.setTitle("안녕하세요");

		//버튼을 만들어보자
		Button bt; //null
		bt=new Button("왕버튼");		
		frame.add(bt);

		//텍스트 입력박스 생성
		TextField txt;
		txt=new TextField("텍스트를 입력하세요");
		/*java.awt.TextField txt=new java.awt.TextField("텍스트를 입력하세요");
		로 import안하고 가능은 하지만 불편하다.*/
		frame.add(txt);

		//윈도우에 색상 주자
		/*난생 처음 보는 객체에 대한 대처법*/
		/*자바의 모든 객체는 결국 일반, 추상, 인터페이스 중 하나이다.
		따라서 처음보느느 객체라 할지라도 결국 메모리에 올려서 사용하라고 준것이기 때문에
		3중 어느 케이스에 속하는지 먼저 조사한 후 그 객체에 맞게 메모리에 올리자
		1) 일반 - new하자
		2) 추상 - 자식을 new하자
		3) 인터페이스 - implements 한 자식을 new하자
		//경험상 2,3번은 꼭 자식들을 new하지 않아도 생성하는 방법을 api에서
		제공하는 경우가 있다.
		*/
		Color c=new Color(0, 0, 255);
		frame.setBackground(c);
		//1.객체 자료형은 일반 클래스, 추상 클래스, 인터페이스 세개로 나눌수 있다.
		//일반클래스는 new를 쓸수 있다.
		//추상클래스, 인터페이스 subclass 생성하지 않아도 쉽게 쓸수 있다.	//나중에 배운다.
		//2. 생성자를 본다.

		//체크박스 생성
		Checkbox ch0=new Checkbox("여행");
		Checkbox ch1=new Checkbox("게임");
		Checkbox ch2=new Checkbox("독서");
		Checkbox ch3=new Checkbox("운동");

		frame.add(ch0);
		frame.add(ch1);
		frame.add(ch2);
		frame.add(ch3);
	
		//html에서의 select는 자바에서Choice라 한다.
		//사과 딸기 바나나 고를수있게 해보자
		Choice cho=new Choice();		
		cho.add("사과");
		cho.add("딸기");
		cho.add("바나나");
		frame.add(cho); //프레임에 부착

		//라디오를  남, 여를 체크한다.
		//주의) java에서는 Radio라는 말 자체가 없다!
		//Checkbox를 그룹화시켜야 한다.
		CheckboxGroup radio1=new CheckboxGroup();
		Checkbox c1=new Checkbox("남", radio1, false);
		Checkbox c2=new Checkbox("여", radio1, true);
		frame.add(c1);
		frame.add(c2);

		//TextArea 동일
		TextArea ta=new TextArea(20, 30);
		frame.add(ta);
	}
}
