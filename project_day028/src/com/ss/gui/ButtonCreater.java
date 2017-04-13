package com.ss.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonCreater extends JFrame {
	JPanel p_north, p_center;
	JButton bt_create, bt_color;
	/*지금까지 사용해왔던 배열은 대량의 데이터를 순서있게 처리함에 있어서 엄청난 이득을
	 * 줘왔다. 하지만 자바, c, c#와 같은 응용프로그램에서는 배열 생성시 그 크기를 반드시
	 * 명시해야한다는 특징과 선언시 자료형이 결정되어야 한다는 점에서 오히려 유연성이 떨어진다.
	 * 자바에서는 대량의 객체(★★★★★)를 처리하는데 유용한 라이브러리를 제공하는데
	 * 이러한 라이브러리를 가리켜 컬렉션 프레임웍이라 하고, java.util 패키지에 모여있다.
	 * 
	 * 자바의 collection framework에서 제공하는 객체는 그 수가 상당하기 때문에
	 * 모두 사용한다는 것은 멍청한 짓이다.
	 * 업무에 따라 그때마다 적절한 것을 선택하면 된다.
	 * 
	 * 크게 세종류로 나눌수 있는데
	 * set: 순서가 없는 집합
	 * list: 순서가 있는 것
	 * map: key와 value로 구성되어 있는 것	 * 
	 * 
	 * 주의!!
	 * 배열과는 달리 컬렉션 프레임웍의 대상이 되는 것은 오직 사물인 객체에 한정된다.
	 * 배열과 공통점은 모아서 처리하는데 유용하다. 
	 *  */
	//JButton[] bts=new JButton[40];
	ArrayList list=new ArrayList();
	//얘 완전 배열! 크기르르 명시하지 않아도 되고, 객체만을 다룬다.
	
	int count = 0;

	public ButtonCreater() {
		p_north = new JPanel();
		p_center = new JPanel();
		bt_create = new JButton("버튼 생성");
		bt_color = new JButton("색상 변경");

		p_north.add(bt_create);
		p_north.add(bt_color);

		add(p_north, BorderLayout.NORTH);
		add(p_center);

		// 이벤트 구현
		bt_create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼 생성 이벤트 내에 로직을 짜기보다는 메소드를 빼는것이 좋다.
				/*
				 * System.out.println("눌렀어?");
				 * p_center.add(Integer.toString(count)); btCount++;
				 */
				createButton();
			}
		});

		bt_color.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("눌렀어?2");
				//모든 버튼을 대상으로 색상 변경
				setColor();
				
			}
		});

		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// 버튼 생성 메소드!!
	/*
	 * 피곤함에도, 별도로 뺀 이유는? 이벤트에 의존하여 로직을 작성하면 이벤트 방식의 변경에 의해 로직도 손상받으니깐.
	 */
	public void createButton() {
		count++;
		JButton bt = new JButton(Integer.toString(count));
		
		//js의 push()와 완전 비슷한 메소드 호출하자
		list.add(bt); //1건 추가
		System.out.println("현재까지 누적수는 " + list.size());
		
		p_center.add(bt);
		p_center.updateUI(); // refresh해야 그래픽 바뀐게 보인다.
	}
	
	public void setColor(){
		for(int i=0; i<list.size(); i++){
			//JButton bt=list.get(i); i대신 오브젝트형으로 바꿔야함 downcast 
			JButton bt=(JButton)list.get(i);
			bt.setBackground(Color.YELLOW);
			//i번버튼의.setBackground();			
		}		
	}

	public static void main(String[] args) {
		new ButtonCreater();
	}

}
