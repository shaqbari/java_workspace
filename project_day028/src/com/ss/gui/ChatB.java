package com.ss.gui;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame implements KeyListener{
	JTextArea area;
	JScrollPane scroll;
	JPanel p_south;
	JTextField t_input;
	
	//필요한 객체, 즉 사용할 객체가 있다면 has a관계로 보유하자.
	ChatA chatA; //현재 null
	ChatC chatC;

	public ChatB(){ //생성자에다가 하면 컴파일순서에 따라서 꼬인다.메소드를 따로만들자
		area=new JTextArea();
		scroll=new JScrollPane(area);
		p_south = new JPanel();		
		t_input=new JTextField(15);
		
		/*	new하면 안되는 이유?
		새로운 ChatA가 아닌, 나를 태어나게 했던 그 ChatA의 주소값을 이용해야 한다.
		chatA= new ChatA();*/
		
		this.add(scroll);
		p_south.add(t_input);
		this.add(p_south, BorderLayout.SOUTH);
		
		t_input.addKeyListener(this);
		
		setBounds(400, 100, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}

	
	public void keyPressed(KeyEvent e) {
		
		
	}
	
	public void keyReleased(KeyEvent e) {
		/*ChatA, ChatC에게 메시지 보내기*/
		
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			String msg=t_input.getText();
			this.area.append(msg+"\n");
			chatA.area.append(msg+"\n");
			chatC.area.append(msg+"\n");
			t_input.setText("");			
		}
		

	}

	
	public void keyTyped(KeyEvent e) {
		
		
	}	
	
	//외부의 어떤 객체가, 나에게 데이터를 주입시켜줄 수 있는 setter를 준비하자
	public void setChatA(ChatA chatA){
		this.chatA=chatA;
	}
	
	public void setChatC(ChatC chatC){
		this.chatC=chatC;
	}
}
