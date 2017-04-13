package com.ss.graphic;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoGallary2 extends JFrame implements ActionListener{
	JLabel label;
	JPanel p;
	JButton bt_prev, bt_next;
	ArrayList<String> imgArr;	
	Toolkit kit; //���Ӹ��鶧�� �ٸ����� ������ �ִ�.
	Image img;
	Canvas canvas;
	int count=0; //�迭�� �ε���
	
	String[] path={
		"D:/google/�ֿ뱳������/html_workspace/images/jeju01.jpg",
		"D:/google/�ֿ뱳������/html_workspace/images/jeju02.jpg",
		"D:/google/�ֿ뱳������/html_workspace/images/jeju03.jpg",
		"D:/google/�ֿ뱳������/html_workspace/images/jeju04.jpg",
		"D:/google/�ֿ뱳������/html_workspace/images/jeju05.jpg"				
	};
	
	public PhotoGallary2() {
		label=new JLabel(path[count]);
		p=new JPanel();
		bt_prev=new JButton("����");
		bt_next=new JButton("����");
		/*
		imgArr=new ArrayList<String>();	
		imgArr.add("D:/google/�ֿ뱳������/html_workspace/images/jeju01.jpg");
		imgArr.add("D:/google/�ֿ뱳������/html_workspace/images/jeju02.jpg");
		imgArr.add("D:/google/�ֿ뱳������/html_workspace/images/jeju03.jpg");
		imgArr.add("D:/google/�ֿ뱳������/html_workspace/images/jeju04.jpg");
		imgArr.add("D:/google/�ֿ뱳������/html_workspace/images/jeju05.jpg");
		*/	
				
		kit=Toolkit.getDefaultToolkit();
		img=kit.getImage(path[count]);
		
		//ĵ������ �̹����� �ö󰡱� ���� �̹����� �����Ǿ� �־�� �Ѵ�.
		canvas=new Canvas(){
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, 600, 550, this); //���⼭ this�� canvas�� �ǹ��Ѵ�.
				System.out.println("paintȣ��!");
			}
		};
		canvas.setBackground(Color.GRAY);	
		
		/*
		bt_prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				img=kit.getImage(imgArr.get(count));
				label.setText(imgArr.get(count));					
				canvas.repaint();
			}
		});
		
		bt_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				img=kit.getImage(imgArr.get(count));
				label.setText(imgArr.get(count));				
				canvas.repaint();
			}
		});
		*/
		
		//��ư���� ����
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
			
		
		p.add(bt_prev);
		p.add(bt_next);
		
		add(label, BorderLayout.NORTH);
		add(canvas);
		add(p, BorderLayout.SOUTH);
		
		setSize(600, 650);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
	}
	
	public void actionPerformed(ActionEvent e) {//e�� Ŭ���� ���ؼ� �߻��� event��ü�̴�.
		//System.out.println(e);
		
		//���â�� ���� ��
		//JOptionPane.showMessageDialog(this, "��������?");
		
		//actionEvent�� Ŭ���Ӹ� �ƴ϶�, ���� ������ �ƿ츣�� �̺�Ʈ ��ü�̴�.
		//���� ��ư�� actionevent�� ����Ű�°� �ƴϴ�.
		//�׷��� e.getSource�� ȣ���ϸ�, � ������Ʈ�� �̺�Ʈ�� �����״���
		//�����Ҽ� �����Ƿ�, ���� ū object������ ��ȯ�� �ش�.
		Object obj = e.getSource(); //�̺�Ʈ�� ����Ų ������Ʈ
		
		//ū�ʿ��� ���������� ���Ҷ��� cast�����ڸ� ����ؾ� �Ѵ�.
		JButton btn=(JButton)obj;
		
		if (btn == bt_prev) { //�ּҰ��� �����̶��..
			//JOptionPane.showMessageDialog(this, "����"); //���̾�α� �ڽ��� �����ȴ�. alert�� ����
			//parentComponent�� �����ο��� �� ������Ʈ�� �����ϰ� �ִ� ������Ʈ�� �ǹ��Ѵ�.
			//���⼭ this�� jframe�� �ǹ�
			
			prev();
			//�Լ��� ���� ����� ���� ���������� ����.
			
		}else if (btn == bt_next) {
			//JOptionPane.showMessageDialog(this, "����");			
			next();
		}
	}
	
	//���� ���� �����ֱ�
	public void prev(){
		//�̹����� ��� ����+���� ���� ����
		count--;
		img=kit.getImage(path[count]);
		
		//�����ڴ� paint�޼ҵ带 ȣ���� �� ����.
		//paint�� ����ȣ��ǳ�??
		/*������ �ش� ������Ʈ�� ������ ���� �� ������ ȣ��ȴ�
		 * ���� ��ư�� ������ �Ǹ�, ĵ������ ������ �������� ���� ������
		 * paint�޼ҵ�� ȣ����� �ʴ´�.
		 * �ذ�å) ĵ������ ����Ʈ�޼ҵ带 ����ȣ���ؾ� ������, ȣ��Ұ��̱� ������
		 * ����ȣ���ؾ� �Ѵ�.
		 * �ý������� paint�� ȣ���� �޶�� ��û�ؾ� �Ѵ�.
		 * �̶� ���� �޼ҵ尡 repaint() ---> update() ---> paint()
		 * 1. update()�޼ҵ�� ���� ȭ���� �� �����
		 * 2. paint()�޼ҵ尡 �ٽ� �׸���.
		 * ���� �̹��� �뷮�� ū ��쿣 �츮 ������ �����Ÿ��� ȿ���� ���� ���̴�.
		 * ���Ӹ��鶧 ������۸��� �̿��ϸ� �� �����Ÿ��� ȿ���� ���� �� �� �ִ�.*/
		
		canvas.repaint();	
		
		//�̿��ڰ� �׸��� �ٲٱ� ������ �̿��ڰ� �ٲܶ� �ڵ����� ȣ��ȴ�.
		//������ ��ư�� ������ ������ ĵ������ ����� ���� ������ ������ ȣ����� �ʴ´�.
		
		//�׸��� �����̶� ����Ǹ� ������ �׸��� �� ����� ���� �ٽ� �������
		//�����Ұ��� ���Ƽ� gpu, ram�� ���� �ʿ��Ұ�쵵 �ִ�.
		
		label.setText(path[count]);
	
		
	}
	
	//�������� �����ֱ�
	public void next(){
		count++;
		img=kit.getImage(path[count]);		
		label.setText(path[count]);
		canvas.repaint();	
	}
	
	
	
	public static void main(String[] args) {
		new PhotoGallary2();
	}

}
