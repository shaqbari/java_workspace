package com.ss.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JTextField txt;
	JTextArea area;
	JButton bt;
			
	public MyFrame() {
		txt = new JTextField(30);
		area = new JTextArea(15, 30);
		bt = new JButton("����ư");		

		setLayout(new FlowLayout());		
		
		add(txt);
		add(bt);
		add(area);

		//txt�� �����ʿ��� ����
		//txt.addKeyListener(new myKeyAdapter(area, txt)); �̷��� ���޵� ����
		
		/*.java ������ ����� ���� ���, Ŭ���� �ڵ� ��ü�� �޼ҵ��� �μ���, Ŭ������ ������� � �ٷ� ������ �� �� �ִ�.
		 *Anonymous inner class
		 *���� �͸�Ŭ������ ����ϴ� ����?
		 *.java vs ���� �͸�
		 *.java�� ���������� �����ҽ����� �ۼ��ϴ� ������ �ڵ��� ���뼺�� �ִ�. ������
		 *gui���α׷��� ��� Ư�� �̺�Ʈ �����ڵ�� Ư�� Ŭ������ �������̱� ������ ���밡�ɼ��� ����� ��������.
		 * �̰�� �����ڰ� .java���� ������, �μ��� ���� ��ü�� �Ѱܹ޴� ���� �ؾ��ұ�?		 * 
		 * �ش�) ��ȸ�� �ڵ�� ����!! �� ���� Ŭ������ �Ϻη� Ŭ������ ������� �������. �ȵ���̵忡�� ���� ���*/
		txt.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e) {
				//AdapterUse�� area�� txt�� �Է��� ���ڿ� ���
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					String msg=txt.getText();
					area.append(msg+"\n");
					txt.setText("");
				}
			}
		});//�����͸� Ŭ���� bin�� MyFrame$1.class�� �����ϵȴ�.
		//�߻� Ŭ������ new�� �Ұ��������� �߻�Ŭ������ ��ӹ������� new�ϴ°��̴�.! �������̽��� �̿Ͱ��� ����

		//�����͸� Ŭ������ ����
		//�����͸� �޼ҵ� �ڵ� �ȿ��� �ڽ��� ������ �ܺ��� Ŭ������ ��������� ����ó�� �� �� �ִ�.
		//�ڰ��� ���� ����
		//�����͸�Ŭ������ ������� ��� �̵��� ��������� ������ �� �ִٴ� ���ε�,
		//���� �����ڰ� ���������� �����͸��Լ������� ����ϰ��� �Ҷ��� �� ���������� final�� ����Ǿ��־�� �Ѵ�.
		int a=9;
		final int b=8; //final�̹Ƿ� ������ ����
		 
		bt.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {				
				System.out.println("������?");
				//a=8; a�� final�� �����Ǿ� ���� �ʾ� ������ ����
			}
		});
			
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
