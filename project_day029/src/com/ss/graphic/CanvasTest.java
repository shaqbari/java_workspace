/*
 * �׸� �׷��� �������� �����Ǵ� ��ü��
 * canvas�� �׸��� �׷�����
 * �� ĵ������ �׷��� �ϳ�?
 * ĵ�����������̳� ó�� �ƹ��͵� ���� �����̴�.
 * �ֳ��ϸ� �� ��ȭ���� ǥ���� ��ü�̹Ƿ�.
 * */

package com.ss.graphic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CanvasTest extends JFrame{
	Canvas can; //�ֺ� ��ȭ��	
	Toolkit kit;// javaSE���� �̹����� �������� ��Ŷ ��ü�� �̿��ؾ� �Ѵ�.(sun�簡 ����)
	Image img; //�߻�Ŭ������ new ����, kit���κ��� ���;� �Ѵ�.
	
	public CanvasTest() {
		//img=new image(); �̹����� �߻�Ŭ������ new�ȵȴ�. 
		//�߻�Ŭ������ �� sub class�� �� �ʿ�� ����. �޸𸮳��� �ٸ� instance�� �̿��ϴ� ����� �ִ�
		//�̹����� toolkit�� ���� 
		//��ȯ���� ���� �ڽ��� �ڷ����� ��ȯ�ϴ°��� ���� �ν��Ͻ��� ��°��̴�.
		//��ȯ���� ���� ������� �� �޼ҵ��� ����� �� �� �ִ�.
		
		kit=Toolkit.getDefaultToolkit(); //�ν��Ͻ� ��� 
		//getDefaultToolkit()�޼ҵ�� static �޼ҵ��̴�. �׷��� �ٷ� Ŭ�������� ȣ�Ⱑ��
		img=kit.getImage("D:/google/�ֿ뱳������/html_workspace/images/pica.jpg");
				//�������ô� �ι���� �������÷� �ν��Ѵ�. �����츸 �������� ���Ƿ� �����þ��� ������ ������.
		
		//�����͸�Ŭ������ ĵ������ ��ӹ޴� Ŭ������ ����
		//���⼭ �������̵� ����
		can = new Canvas(){
			//paint�޼ҵ�� ��ǻ� ������ �Ұ��ϸ�
			//� �׸��� �׸����� �����ϴ� ��ü�� graphics��ü�̴�.
			public void paint(Graphics g) {//�̹� �μ��� ���������� �׳� ���� �ȴ�.
				/*
				g.drawLine(0, 0, 300, 400);
				g.drawOval(200, 200, 300, 300);
				g.drawRect(100, 100, 200, 200);
				*/
				g.drawImage(img, 200, 200, 300, 300, this); //ĵ������ �̹����� �����ڰ� �ȴ�.
			}	//�����͸�Ŭ���� �ȿ��� this�� �����͸�Ŭ���� �ڽ��� ����Ų��.
		};
		can.setBackground(Color.YELLOW);
		add(can);
		
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CanvasTest();
	}

}
