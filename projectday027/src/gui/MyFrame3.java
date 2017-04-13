/*윈도우가 가장먼저 click을 인지하며 이를 JVM에 전달하고 ActionEvent로 알아듣는다
개발자는 AtionListener로 ActionEvent의클릭을 감지 할 수 있으며
이는 interface로 구현되어 원하는 몸체에 붙여 사용할수 있다.*/
/*키보드 입력은 KeyEvent를 개발자가 KeyListener로 감지할 수 있다. */
package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class MyFrame3 extends JFrame implements ActionListener, KeyListener{ //나는 JFrame이면서 ActoinListener이다.
						/*is a*/             /*is a*/
	
	JPanel p_north=null; //나는 JPanel을 가진다.
	JButton bt_p=null; //나는 JButton를 가진다.
	JTextArea ta_center=null; //나는 JTextArea를 가진다.
	JTextField t_input;
	
	//이 윈도우가 태어날때 각종 부품들도 같이태어나야 한다.!! 생성자를쓰자.
	public MyFrame3(){		
		p_north=new JPanel();
		bt_p=new JButton("안녕"); 
		ta_center=new JTextArea(20, 30);
		t_input=new JTextField(10);

		p_north.add(bt_p);
		p_north.add(t_input);

		//패널을 북쪽에 붙인다.
		add(p_north, BorderLayout.NORTH);
		add(ta_center, BorderLayout.CENTER); 

		//누구를 대상으로 이벤트를 연결할지 결정
		//마치 js에서의 addEventListener()와 같은 작업으로 간주하면 된다.
		//버튼과 리스너와의 연결
		bt_p.addActionListener(this); //내(this)가 listener이다.
		t_input.addKeyListener(this);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/*ActionListener는 사용자가 일으킨 이벤트중 ActionEvent만을 감지하고,
	그 이벤트가 감지되었을때 어떤 처리를 할지는 개발자가 결정해야 하기 때문에,
	ActionListener는 내용을 확정지을 수 없는 추상메소드를 가진 객체이어야 하고,
	이 인터페이스를 상속받는 자가 어떤 클래스의 이미 자식일수도 있으므로,
	sun에서는 추상클래스가 아닌 인터페이스로 제공함으로서 다중상속문제를
	피해갈 수 있도록 했다.*/
	public void actionPerformed(ActionEvent e){
		System.out.println("나 눌렀어?");
	}

	//KeyListener들의 추상메소드를 모두 오버라이드 해야한다.
	//api문서보고 복사해서쓰면 오타날확률이 매우 낮아진다.
	//키를 눌렀을때
	public void keyPressed(KeyEvent e){
		System.out.println("keyPressed");
	}
	//키를 눌렀다 땔때..
	public void keyReleased(KeyEvent e){
		System.out.println("keyReleased");
	}
	//타자를 칠때.. 거의 쓸일 없다. 오버라이드만 해두자
	public void keyTyped(KeyEvent e){
	
	}
	
	public static void main(String[] args){
		//MyFrame1 myFrame=new MyFrame1();제어할게 아니니깐 변수생성할필요도 없다.
		new MyFrame3();
	}
}
