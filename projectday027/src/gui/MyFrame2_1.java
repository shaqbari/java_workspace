/*��ü���⿡�� ������ �繰�� �Ǿ��Ѵ�.*/

package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

class MyFrame2_1 extends JFrame{ //���� JFrame�̴�.
	JPanel p_west=null; //���� JPanel�� ������.
	JPanel p_center=null;
	JButton bt_p_west=null; //���� JButton�� ������.	
	JTextField tf_p_center=null;
	JTextArea ta_p_center=null; //���� JTextArea�� ������.
	
	//�� �����찡 �¾�� ���� ��ǰ�鵵 �����¾�� �Ѵ�.!! �����ڸ�����.
	public MyFrame2_1(){		
		p_west=new JPanel();
		p_center=new JPanel();
		bt_p_west=new JButton("�ȳ�"); 
		tf_p_center=new JTextField(30);
		ta_p_center=new JTextArea(20, 30);

		p_west.add(bt_p_west);	
		p_center.add(tf_p_center);
		p_center.add(ta_p_center);

		add(p_west, BorderLayout.WEST);
		add(p_center, BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450,500);
		setVisible(true);
	}

	
	public static void main(String[] args){
		//MyFrame1 myFrame=new MyFrame1();�����Ұ� �ƴϴϱ� �����������ʿ䵵 ����.
		new MyFrame2_1();
	}
}
