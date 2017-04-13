package com.ss.graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ManualMove extends JFrame{
	JPanel p;
	JButton bt;
	//int x,y;로 선언하면 멤버변수는 자동으로 초기화 된다. 지역변수는 안그러므로 꼭 초기화해줘야 한다.
	int x=0;
	int y=0;
	
	public ManualMove() {
		p=new JPanel(){
			protected void paintComponent(Graphics g) {
				g.drawOval(x, y, 50, 50);
			}			
		};
		//p.setBackground(Color.YELLOW); //패널 잘붙였는지 확인할 수 있다.
		
		bt=new JButton("움직이기");
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x+=10;
				y+=10;
				repaint(); //p.repaint();하면 좀 이상하게 된다??
				
				//프레임을 접근하는 방법
				test(); //this라고 명시하면 내부입력클래스를 명시하고, 안쓰면 jframe을 명시하게 된다.
			}
		});
		
		add(bt, BorderLayout.NORTH);
		add(p);
		
		setSize(600, 500);
		setVisible(true);
	}
	
	public void test() {
		System.out.println("test호출");
	}
	
	public static void main(String[] args) {
		new ManualMove();
	}

}
