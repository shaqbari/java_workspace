package com.ss.practice;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	JPanel p_north, p_center;
	JTextField txt;
	JTextArea area;
	
	public MyFrame() {
		p_north=new JPanel();
		p_center=new JPanel();
		txt=new JTextField(20);
		area=new JTextArea(10, 20);
		
		p_north.add(txt);
		p_center.add(area);
		
		add(p_north, BorderLayout.NORTH);
		add(p_center);
		
		txt.addKeyListener(new MyAdapter(txt, area));
		
		setBounds(400, 300, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}	
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
