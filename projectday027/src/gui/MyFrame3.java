/*�����찡 ������� click�� �����ϸ� �̸� JVM�� �����ϰ� ActionEvent�� �˾Ƶ�´�
�����ڴ� AtionListener�� ActionEvent��Ŭ���� ���� �� �� ������
�̴� interface�� �����Ǿ� ���ϴ� ��ü�� �ٿ� ����Ҽ� �ִ�.*/
/*Ű���� �Է��� KeyEvent�� �����ڰ� KeyListener�� ������ �� �ִ�. */
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

class MyFrame3 extends JFrame implements ActionListener, KeyListener{ //���� JFrame�̸鼭 ActoinListener�̴�.
						/*is a*/             /*is a*/
	
	JPanel p_north=null; //���� JPanel�� ������.
	JButton bt_p=null; //���� JButton�� ������.
	JTextArea ta_center=null; //���� JTextArea�� ������.
	JTextField t_input;
	
	//�� �����찡 �¾�� ���� ��ǰ�鵵 �����¾�� �Ѵ�.!! �����ڸ�����.
	public MyFrame3(){		
		p_north=new JPanel();
		bt_p=new JButton("�ȳ�"); 
		ta_center=new JTextArea(20, 30);
		t_input=new JTextField(10);

		p_north.add(bt_p);
		p_north.add(t_input);

		//�г��� ���ʿ� ���δ�.
		add(p_north, BorderLayout.NORTH);
		add(ta_center, BorderLayout.CENTER); 

		//������ ������� �̺�Ʈ�� �������� ����
		//��ġ js������ addEventListener()�� ���� �۾����� �����ϸ� �ȴ�.
		//��ư�� �����ʿ��� ����
		bt_p.addActionListener(this); //��(this)�� listener�̴�.
		t_input.addKeyListener(this);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/*ActionListener�� ����ڰ� ����Ų �̺�Ʈ�� ActionEvent���� �����ϰ�,
	�� �̺�Ʈ�� �����Ǿ����� � ó���� ������ �����ڰ� �����ؾ� �ϱ� ������,
	ActionListener�� ������ Ȯ������ �� ���� �߻�޼ҵ带 ���� ��ü�̾�� �ϰ�,
	�� �������̽��� ��ӹ޴� �ڰ� � Ŭ������ �̹� �ڽ��ϼ��� �����Ƿ�,
	sun������ �߻�Ŭ������ �ƴ� �������̽��� ���������μ� ���߻�ӹ�����
	���ذ� �� �ֵ��� �ߴ�.*/
	public void actionPerformed(ActionEvent e){
		System.out.println("�� ������?");
	}

	//KeyListener���� �߻�޼ҵ带 ��� �������̵� �ؾ��Ѵ�.
	//api�������� �����ؼ����� ��Ÿ��Ȯ���� �ſ� ��������.
	//Ű�� ��������
	public void keyPressed(KeyEvent e){
		System.out.println("keyPressed");
	}
	//Ű�� ������ ����..
	public void keyReleased(KeyEvent e){
		System.out.println("keyReleased");
	}
	//Ÿ�ڸ� ĥ��.. ���� ���� ����. �������̵常 �ص���
	public void keyTyped(KeyEvent e){
	
	}
	
	public static void main(String[] args){
		//MyFrame1 myFrame=new MyFrame1();�����Ұ� �ƴϴϱ� �����������ʿ䵵 ����.
		new MyFrame3();
	}
}
