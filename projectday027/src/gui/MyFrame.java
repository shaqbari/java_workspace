/*��ü���⿡�� ������ �繰�� �Ǿ��Ѵ�.
�Ʒ��� ������ �������� �繰�� ���� �̷��� �ϸ� �ȵȴ�.*/

package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

class MyFrame {
	public static void main(String[] args){
		JFrame frame=null;
		JPanel p_north=null;
		JButton bt_p=null;
		JTextArea ta_center=null;

		frame=new JFrame();
		p_north=new JPanel();
		bt_p=new JButton("�ȳ�");
		ta_center=new JTextArea();

		p_north.add(bt_p);
		frame.add(p_north, BorderLayout.NORTH);
		frame.add(ta_center, BorderLayout.CENTER);

		frame.setSize(300,400);
		frame.setVisible(true);
	}
}
