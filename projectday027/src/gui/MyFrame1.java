/*��ü���⿡�� ������ �繰�� �Ǿ��Ѵ�.*/

package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

class MyFrame1 extends JFrame{ //���� JFrame�̴�.
	JPanel p_north=null; //���� JPanel�� ������.
	JButton bt_p=null; //���� JButton�� ������.
	JTextArea ta_center=null; //���� JTextArea�� ������.
	
	//�� �����찡 �¾�� ���� ��ǰ�鵵 �����¾�� �Ѵ�.!! �����ڸ�����.
	public MyFrame1(){		
		this.p_north=new JPanel();
		bt_p=new JButton("�ȳ�"); //this�� �Ⱥ��̴� ���� �ڿ�������.
		ta_center=new JTextArea(20, 30);

		p_north.add(bt_p);
		this.add(p_north, BorderLayout.NORTH);
		add(ta_center, BorderLayout.CENTER); //this�� �Ⱥ��̴� ���� �ڿ�������. 

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
	}

	
	public static void main(String[] args){
		//MyFrame1 myFrame=new MyFrame1();�����Ұ� �ƴϴϱ� �����������ʿ䵵 ����.
		new MyFrame1();
		

	}
}
