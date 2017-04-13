/*객체지향에서 본인이 사물이 되야한다.*/

package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

class MyFrame2_1 extends JFrame{ //나는 JFrame이다.
	JPanel p_west=null; //나는 JPanel을 가진다.
	JPanel p_center=null;
	JButton bt_p_west=null; //나는 JButton를 가진다.	
	JTextField tf_p_center=null;
	JTextArea ta_p_center=null; //나는 JTextArea를 가진다.
	
	//이 윈도우가 태어날때 각종 부품들도 같이태어나야 한다.!! 생성자를쓰자.
	public MyFrame2_1(){		
		p_west=new JPanel();
		p_center=new JPanel();
		bt_p_west=new JButton("안녕"); 
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
		//MyFrame1 myFrame=new MyFrame1();제어할게 아니니깐 변수생성할필요도 없다.
		new MyFrame2_1();
	}
}
