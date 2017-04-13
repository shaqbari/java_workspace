/*이벤트 프로그래밍시 리스너가 인터페이스이기 때문에 단 하나라도 메소드를 오버라이드 하지 않으면
 구현 강제의 약속을 어기게 되어, 컴파일 에러가 발생한다.
 이 원칙은 특히나 추상메소드를 많이 보유한 인터페이스 일경우 너무 비효율적이고 피곤하다.
 
 해결책) 개발자를 대신하여 이미 리스너의 메소드를 재정의해놓은 객체들을 가리켜 어댑터라 한다.!!
 but- 어댑터는 무조건 지원되는 것이 아니라, 경험상 보통 3개이상의 추상메소드를 보유한 리스너라면
 어댑터 지원을 일단 의심해봐야 한다. */

package com.ss.windowtest;

import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*윈도우 이벤트를 구현해본다.*/
public class WindowTest extends JFrame{
	JButton bt;
	
	public WindowTest() {
		// TODO Auto-generated constructor stub
		bt=new JButton("나버튼");
		setLayout(new FlowLayout());
		
		add(bt);
		
		addWindowListener(new MyAdapter()); //this 대신 windowAdaptor도 windowListener를 넣을 수 있다. MyAdaptor에서 상속받아 원하는것만 오버라이드해서 쓰자. 
		
		setSize(300, 400);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE); 윈도우리스너의 메소드를 이용해서 만들게 한다.
	}
	
	public static void main(String[] args){
		new WindowTest();
	}

}
