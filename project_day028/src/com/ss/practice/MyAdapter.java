package com.ss.practice;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyAdapter extends KeyAdapter {
	/* KeyAdater에서 원하는 것만 재정의해야하므로 상속받아야 한다. */
	JTextField txt;
	JTextArea area;

	public MyAdapter(JTextField txt, JTextArea area) {
		this.txt = txt;
		this.area = area;
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			String msg=txt.getText();
			area.append(msg+"\n");
			txt.setText("");
		}
	}
}
