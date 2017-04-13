package com.ss.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame {
	JPanel p_north, p_center, p_south ;
	JButton bt1, bt2, bt3;
	JTextArea area;
	JTextField txt;
	
	public Test() {		
		p_north=new JPanel();
		p_center= new JPanel();
		p_south=new JPanel();
		bt1=new JButton("입력");
		bt2=new JButton("열기");
		bt3=new JButton("울랄라");
		area=new JTextArea(30, 20);
		txt=new JTextField(20);
		
		p_north.add(bt1);
		p_north.add(bt2);
		p_north.add(bt3);		
		p_center.add(area);
		p_south.add(txt);
		
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼눌렀니");
			}
		});
		
		txt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					System.out.println("엔터키눌렀니?");
				}
			}
		});
		
		
		add(p_north, BorderLayout.NORTH);
		add(p_center);
		add(p_south, BorderLayout.SOUTH);
		
		setBounds(200, 200, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			new Test();			
		}
	}

 }
