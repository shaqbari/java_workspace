package com.ss.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class MyAdapter extends KeyAdapter{
	private AdapterUse adapterUse;
	
	public void keyReleased(KeyEvent e) {		
		//AdapterUse의 area에 txt에 입력한 문자열 출력		
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			System.out.println("엔터쳤니?");
			String msg=adapterUse.txt.getText();			
			adapterUse.area.append(msg+"\n"); //setText();하면 이전꺼를 대체해버린다.
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
