package com.ss.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener{	
	private MyWin myWin;
	
	public MyActionListener(){
	
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("클릭했니?");
		
		//String msg=myWin.tf.getText();
		//System.out.println(msg);
		
		myWin.tf.setText("클릭했니?");
	}


	public MyWin getMyWin() {
		return myWin;
	}

	public void setMyWin(MyWin myWin) {
		this.myWin = myWin;
	}

		
}
