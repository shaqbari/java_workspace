package com.ss.graphic;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PhotoGallary extends JFrame{
	JLabel label;
	JPanel p;
	JButton bt_prev, bt_next;
	ArrayList<String> imgArr;	
	Toolkit kit;
	Image img;
	Canvas canvas;
	int count=0;
	
	public PhotoGallary() {
		label=new JLabel("∞Ê∑Œ");
		p=new JPanel();
		bt_prev=new JButton("¿Ã¿¸");
		bt_next=new JButton("¥Ÿ¿Ω");
		
		imgArr=new ArrayList<String>();	
		imgArr.add("D:/google/Ω÷øÎ±≥¿∞ºæ≈Õ/html_workspace/images/jeju01.jpg");
		imgArr.add("D:/google/Ω÷øÎ±≥¿∞ºæ≈Õ/html_workspace/images/jeju02.jpg");
		imgArr.add("D:/google/Ω÷øÎ±≥¿∞ºæ≈Õ/html_workspace/images/jeju03.jpg");
		imgArr.add("D:/google/Ω÷øÎ±≥¿∞ºæ≈Õ/html_workspace/images/jeju04.jpg");
		imgArr.add("D:/google/Ω÷øÎ±≥¿∞ºæ≈Õ/html_workspace/images/jeju05.jpg");
				
		kit=Toolkit.getDefaultToolkit();
		img=kit.getImage(imgArr.get(0));
		
		canvas=new Canvas(){
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, 600, 550, this);
			}
		};
		canvas.setBackground(Color.GRAY);	
		
		bt_prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				img=kit.getImage(imgArr.get(count));
				label.setText(imgArr.get(count));					
				canvas.repaint();
			}
		});
		
		bt_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				img=kit.getImage(imgArr.get(count));
				label.setText(imgArr.get(count));				
				canvas.repaint();
			}
		});
		
		p.add(bt_prev);
		p.add(bt_next);
		
		add(label, BorderLayout.NORTH);
		add(canvas);
		add(p, BorderLayout.SOUTH);
		
		setSize(600, 650);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
	}
	public static void main(String[] args) {
		new PhotoGallary();
	}

}
