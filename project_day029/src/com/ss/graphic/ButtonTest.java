/*
 * ���ǿ����� �׷��ȿ�Ҵ� �Ʒ��� ����.
 *  �׸��� ��ü= ���
 *  �׸��� ���� ���� = ��, �ȷ�Ʈ
 *  �׷��� ��� = ĵ����
 *  
 *  ���꿡���� ���� �׷��� ��Ҹ� �״�� �ݿ��ϰ� �ִ�.
 *  ��ü= ������Ʈ ������
 *  ����=��:paint()�޼ҵ�
 *  		�ȷ�Ʈ:Graphics ��ü
 *  		����) ������ �ȷ�Ʈ���� �ξ� �� ����� ����
 *  �׷��� ���= ������Ʈ
 * */

package com.ss.graphic;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//��ư�� ������Ʈ�̹Ƿ�, �и��� ������ �׸����̴�.
public class ButtonTest extends JFrame{
	MyButton bt;
	
	public ButtonTest() {
		bt=new MyButton("����ư");
		
		setLayout(new FlowLayout());
		add(bt);
		
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ButtonTest();
	}

}
