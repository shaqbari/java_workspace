package com.ss.windowtest;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyAdapter extends WindowAdapter{
	/*����Ͱ� �̹� 7���� ��� �������̵� �߱� ������ �츮�� ���� ������ ���� �ʴ� �����̴�
	 * ���߿��� ���ϴ� �޼ҵ带 �� �������̵� ����*/
	
	
	public void windowClosing(WindowEvent e) {
		System.out.println("�����ư ������?");
		System.exit(0);
	}
}
