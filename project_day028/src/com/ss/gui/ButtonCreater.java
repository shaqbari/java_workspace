package com.ss.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonCreater extends JFrame {
	JPanel p_north, p_center;
	JButton bt_create, bt_color;
	/*���ݱ��� ����ؿԴ� �迭�� �뷮�� �����͸� �����ְ� ó���Կ� �־ ��û�� �̵���
	 * ��Դ�. ������ �ڹ�, c, c#�� ���� �������α׷������� �迭 ������ �� ũ�⸦ �ݵ��
	 * ����ؾ��Ѵٴ� Ư¡�� ����� �ڷ����� �����Ǿ�� �Ѵٴ� ������ ������ �������� ��������.
	 * �ڹٿ����� �뷮�� ��ü(�ڡڡڡڡ�)�� ó���ϴµ� ������ ���̺귯���� �����ϴµ�
	 * �̷��� ���̺귯���� ������ �÷��� �����ӿ��̶� �ϰ�, java.util ��Ű���� ���ִ�.
	 * 
	 * �ڹ��� collection framework���� �����ϴ� ��ü�� �� ���� ����ϱ� ������
	 * ��� ����Ѵٴ� ���� ��û�� ���̴�.
	 * ������ ���� �׶����� ������ ���� �����ϸ� �ȴ�.
	 * 
	 * ũ�� �������� ������ �ִµ�
	 * set: ������ ���� ����
	 * list: ������ �ִ� ��
	 * map: key�� value�� �����Ǿ� �ִ� ��	 * 
	 * 
	 * ����!!
	 * �迭���� �޸� �÷��� �����ӿ��� ����� �Ǵ� ���� ���� �繰�� ��ü�� �����ȴ�.
	 * �迭�� �������� ��Ƽ� ó���ϴµ� �����ϴ�. 
	 *  */
	//JButton[] bts=new JButton[40];
	ArrayList list=new ArrayList();
	//�� ���� �迭! ũ�⸣�� ������� �ʾƵ� �ǰ�, ��ü���� �ٷ��.
	
	int count = 0;

	public ButtonCreater() {
		p_north = new JPanel();
		p_center = new JPanel();
		bt_create = new JButton("��ư ����");
		bt_color = new JButton("���� ����");

		p_north.add(bt_create);
		p_north.add(bt_color);

		add(p_north, BorderLayout.NORTH);
		add(p_center);

		// �̺�Ʈ ����
		bt_create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ư ���� �̺�Ʈ ���� ������ ¥�⺸�ٴ� �޼ҵ带 ���°��� ����.
				/*
				 * System.out.println("������?");
				 * p_center.add(Integer.toString(count)); btCount++;
				 */
				createButton();
			}
		});

		bt_color.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("������?2");
				//��� ��ư�� ������� ���� ����
				setColor();
				
			}
		});

		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// ��ư ���� �޼ҵ�!!
	/*
	 * �ǰ��Կ���, ������ �� ������? �̺�Ʈ�� �����Ͽ� ������ �ۼ��ϸ� �̺�Ʈ ����� ���濡 ���� ������ �ջ�����ϱ�.
	 */
	public void createButton() {
		count++;
		JButton bt = new JButton(Integer.toString(count));
		
		//js�� push()�� ���� ����� �޼ҵ� ȣ������
		list.add(bt); //1�� �߰�
		System.out.println("������� �������� " + list.size());
		
		p_center.add(bt);
		p_center.updateUI(); // refresh�ؾ� �׷��� �ٲ�� ���δ�.
	}
	
	public void setColor(){
		for(int i=0; i<list.size(); i++){
			//JButton bt=list.get(i); i��� ������Ʈ������ �ٲ���� downcast 
			JButton bt=(JButton)list.get(i);
			bt.setBackground(Color.YELLOW);
			//i����ư��.setBackground();			
		}		
	}

	public static void main(String[] args) {
		new ButtonCreater();
	}

}
