package com.ss.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class MyAdapter extends KeyAdapter{
	private AdapterUse adapterUse;
	
	public void keyReleased(KeyEvent e) {		
		//AdapterUse�� area�� txt�� �Է��� ���ڿ� ���		
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			System.out.println("�����ƴ�?");
			String msg=adapterUse.txt.getText();			
			adapterUse.area.append(msg+"\n"); //setText();�ϸ� �������� ��ü�ع�����.
			adapterUse.txt.setText("");
		}
	}

	public AdapterUse getAdapterUse() {
		return adapterUse;
	}
	
	public void setAdapterUse(AdapterUse adapterUse) {
		this.adapterUse = adapterUse;
	}
	
	
	
}
