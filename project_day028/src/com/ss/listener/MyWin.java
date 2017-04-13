package com.ss.listener;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyWin extends JFrame{	
	JTextField tf;
	JButton bt;
	
	MyActionListener myActionListener;
	MyKeyListener myKeyListener;
	
	public MyWin(){
		tf=new JTextField(20);
		bt=new JButton("Ŭ��");		
		
		myActionListener=new MyActionListener();
		myKeyListener=new MyKeyListener();
		
		//myActionListener�� �ʿ��� ���� �˷��ֱ�
		myActionListener.setMyWin(this);

		setLayout(new FlowLayout());
		
		add(tf);
		add(bt);		
		
		tf.addKeyListener(myKeyListener);
		bt.addActionListener(myActionListener);		
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}

	public static void main(String[] args){
		new MyWin();
	}
}
