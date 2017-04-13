package com.ss.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JTextField txt;
	JTextArea area;
	JButton bt;
			
	public MyFrame() {
		txt = new JTextField(30);
		area = new JTextArea(15, 30);
		bt = new JButton("나버튼");		

		setLayout(new FlowLayout());		
		
		add(txt);
		add(bt);
		add(area);

		//txt와 리스너와의 연결
		//txt.addKeyListener(new myKeyAdapter(area, txt)); 이렇게 전달도 가능
		
		/*.java 파일을 만들기 싫은 경우, 클래스 코드 자체를 메소드의 인수나, 클래스의 멤버변수 등에 바로 대입할 수 도 있다.
		 *Anonymous inner class
		 *내부 익명클래스를 사용하는 이유?
		 *.java vs 내부 익명
		 *.java를 물리적으로 원본소스까지 작성하는 이유는 코드의 재사용성에 있다. 하지만
		 *gui프로그래밍 등에서 특히 이벤트 구현코드는 특정 클래스에 종속적이기 때문에 재사용가능성이 상당히 떨어진다.
		 * 이경우 개발자가 .java까지 만들어가며, 인수를 통해 객체를 넘겨받는 수고를 해야할까?		 * 
		 * 해답) 일회성 코드로 가자!! 즉 현재 클래스에 일부로 클래스를 존재시켜 사용하자. 안드로이드에서 많이 사용*/
		txt.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e) {
				//AdapterUse의 area에 txt에 입력한 문자열 출력
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					String msg=txt.getText();
					area.append(msg+"\n");
					txt.setText("");
				}
			}
		});//내부익명 클래스 bin의 MyFrame$1.class로 컴파일된다.
		//추상 클래스는 new가 불가능하지만 추상클래스를 상속받을것을 new하는것이다.! 인터페이스도 이와같이 가능

		//내부익명 클래스의 장점
		//내부익명 메소드 코드 안에서 자신을 포함한 외부의 클래스의 멤버변수를 내것처럼 쓸 수 있다.
		//자격증 시험 문제
		//내부익명클래스의 사용으로 얻는 이득은 멤버변수를 공유할 수 있다는 것인데,
		//만일 개발자가 지역변수를 내부익명함수내에서 사용하고자 할때는 그 지역변수는 final로 선언되어있어야 한다.
		int a=9;
		final int b=8; //final이므로 참조만 가능
		 
		bt.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {				
				System.out.println("눌렀어?");
				//a=8; a가 final로 지정되어 있지 않아 컴파일 오류
			}
		});
			
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
