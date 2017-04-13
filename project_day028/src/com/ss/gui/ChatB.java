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
	
	//�ʿ��� ��ü, �� ����� ��ü�� �ִٸ� has a����� ��������.
	ChatA chatA; //���� null
	ChatC chatC;

	public ChatB(){ //�����ڿ��ٰ� �ϸ� �����ϼ����� ���� ���δ�.�޼ҵ带 ���θ�����
		area=new JTextArea();
		scroll=new JScrollPane(area);
		p_south = new JPanel();		
		t_input=new JTextField(15);
		
		/*	new�ϸ� �ȵǴ� ����?
		���ο� ChatA�� �ƴ�, ���� �¾�� �ߴ� �� ChatA�� �ּҰ��� �̿��ؾ� �Ѵ�.
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
		/*ChatA, ChatC���� �޽��� ������*/
		
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
	
	//�ܺ��� � ��ü��, ������ �����͸� ���Խ����� �� �ִ� setter�� �غ�����
	public void setChatA(ChatA chatA){
		this.chatA=chatA;
	}
	
	public void setChatC(ChatC chatC){
		this.chatC=chatC;
	}
}
