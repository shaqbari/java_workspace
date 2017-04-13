package com.ss.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyKeyAdpater extends KeyAdapter{	
	JTextField txt;
	JTextArea area;
	
	
	public MyKeyAdpater(JTextField txt, JTextArea area) {
		this.txt=txt;
		this.area=area;
	}	
	
	@Override
	public void keyReleased(KeyEvent e) {
		//AdapterUse�� area�� txt�� �Է��� ���ڿ� ���
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			String msg=txt.getText();
			area.append(msg+"\n");
			txt.setText("");
		}
	}
}
