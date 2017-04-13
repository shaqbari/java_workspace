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
	//int x,y;�� �����ϸ� ��������� �ڵ����� �ʱ�ȭ �ȴ�. ���������� �ȱ׷��Ƿ� �� �ʱ�ȭ����� �Ѵ�.
	int x=0;
	int y=0;
	
	public ManualMove() {
		p=new JPanel(){
			protected void paintComponent(Graphics g) {
				g.drawOval(x, y, 50, 50);
			}			
		};
		//p.setBackground(Color.YELLOW); //�г� �ߺٿ����� Ȯ���� �� �ִ�.
		
		bt=new JButton("�����̱�");
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x+=10;
				y+=10;
				repaint(); //p.repaint();�ϸ� �� �̻��ϰ� �ȴ�??
				
				//�������� �����ϴ� ���
				test(); //this��� ����ϸ� �����Է�Ŭ������ ����ϰ�, �Ⱦ��� jframe�� ����ϰ� �ȴ�.
			}
		});
		
		add(bt, BorderLayout.NORTH);
		add(p);
		
		setSize(600, 500);
		setVisible(true);
	}
	
	public void test() {
		System.out.println("testȣ��");
	}
	
	public static void main(String[] args) {
		new ManualMove();
	}

}
