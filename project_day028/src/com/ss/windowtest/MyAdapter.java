package com.ss.windowtest;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyAdapter extends WindowAdapter{
	/*어댑터가 이미 7개를 모두 오버라이드 했기 때문에 우리가 구현 강제를 받지 않는 상태이다
	 * 이중에서 원하는 메소드를 또 오버라이드 하자*/
	
	
	public void windowClosing(WindowEvent e) {
		System.out.println("종료버튼 눌렀어?");
		System.exit(0);
	}
}
