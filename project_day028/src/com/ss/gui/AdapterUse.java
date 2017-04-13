package com.ss.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AdapterUse extends JFrame {
	JTextField txt;
	JTextArea area;
	MyAdapter myAdapter;

			
	public AdapterUse() {
		txt = new JTextField(30);
		area = new JTextArea(15, 30);
		myAdapter = new MyAdapter();

		setLayout(new FlowLayout());
		
		myAdapter.setAdapterUse(this);
		
		add(txt);
		add(area);

		//txt와 리스너와의 연결
		txt.addKeyListener(myAdapter);

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new AdapterUse();
	}

}
