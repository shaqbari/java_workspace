package com.ss.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener{	
	private MyWin myWin;
	
	public MyActionListener(){
	
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Ŭ���ߴ�?");
		
		//String msg=myWin.tf.getText();
		//System.out.println(msg);
		
		myWin.tf.setText("Ŭ���ߴ�?");
	}


	public MyWin getMyWin() {
		return myWin;
	}

	public void setMyWin(MyWin myWin) {
		this.myWin = myWin;
	}

		
}
