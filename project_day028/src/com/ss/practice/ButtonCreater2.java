package com.ss.practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonCreater2 extends JFrame {
	JPanel p_north, p_center;
	JButton bt_createButton, bt_setColor;
	ArrayList list = new ArrayList();
	int count = 0;

	public ButtonCreater2() {
		p_north = new JPanel();
		p_center = new JPanel();
		bt_createButton = new JButton("생성");
		bt_setColor = new JButton("색상변경");

		p_north.add(bt_createButton);
		p_north.add(bt_setColor);

		add(p_north, BorderLayout.NORTH);
		add(p_center);

		bt_createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createButton();
			}
		});

		bt_setColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor();
			}
		});

		setBounds(200, 300, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void createButton() {
		count++;
		JButton bt = new JButton(Integer.toString(count));
		list.add(bt);
		p_center.add(bt);
		p_center.updateUI();
	}

	public void setColor() {
		for (int i = 0; i < list.size(); i++) {
			JButton bt = (JButton) list.get(i);

			bt.setBackground(Color.YELLOW);
		}
	}

	public static void main(String[] args) {
		new ButtonCreater2();
	}

}
