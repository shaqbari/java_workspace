/*객체지향에서 본인이 사물이 되야한다.*/

package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

class MyFrame1 extends JFrame{ //나는 JFrame이다.
	JPanel p_north=null; //나는 JPanel을 가진다.
	JButton bt_p=null; //나는 JButton를 가진다.
	JTextArea ta_center=null; //나는 JTextArea를 가진다.
	
	//이 윈도우가 태어날때 각종 부품들도 같이태어나야 한다.!! 생성자를쓰자.
	public MyFrame1(){		
		this.p_north=new JPanel();
		bt_p=new JButton("안녕"); //this를 안붙이는 것이 자연스럽다.
		ta_center=new JTextArea(20, 30);

		p_north.add(bt_p);
		this.add(p_north, BorderLayout.NORTH);
		add(ta_center, BorderLayout.CENTER); //this를 안붙이는 것이 자연스럽다. 

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
	}

	
	public static void main(String[] args){
		//MyFrame1 myFrame=new MyFrame1();제어할게 아니니깐 변수생성할필요도 없다.
		new MyFrame1();
		

	}
}
