/*�̺�Ʈ ���α׷��ֽ� �����ʰ� �������̽��̱� ������ �� �ϳ��� �޼ҵ带 �������̵� ���� ������
 ���� ������ ����� ���� �Ǿ�, ������ ������ �߻��Ѵ�.
 �� ��Ģ�� Ư���� �߻�޼ҵ带 ���� ������ �������̽� �ϰ�� �ʹ� ��ȿ�����̰� �ǰ��ϴ�.
 
 �ذ�å) �����ڸ� ����Ͽ� �̹� �������� �޼ҵ带 �������س��� ��ü���� ������ ����Ͷ� �Ѵ�.!!
 but- ����ʹ� ������ �����Ǵ� ���� �ƴ϶�, ����� ���� 3���̻��� �߻�޼ҵ带 ������ �����ʶ��
 ����� ������ �ϴ� �ǽ��غ��� �Ѵ�. */

package com.ss.windowtest;

import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*������ �̺�Ʈ�� �����غ���.*/
public class WindowTest extends JFrame{
	JButton bt;
	
	public WindowTest() {
		// TODO Auto-generated constructor stub
		bt=new JButton("����ư");
		setLayout(new FlowLayout());
		
		add(bt);
		
		addWindowListener(new MyAdapter()); //this ��� windowAdaptor�� windowListener�� ���� �� �ִ�. MyAdaptor���� ��ӹ޾� ���ϴ°͸� �������̵��ؼ� ����. 
		
		setSize(300, 400);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE); �����츮������ �޼ҵ带 �̿��ؼ� ����� �Ѵ�.
	}
	
	public static void main(String[] args){
		new WindowTest();
	}

}
