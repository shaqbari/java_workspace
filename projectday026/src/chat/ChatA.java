/*
���� ä���� �����Ѵ�.
*/
/*
����ä���� �����Ѵ�
�̺�Ʈ ������ 3�ܰ�!
1. ������ �����ʸ� �����Ͽ� ����(implements)�Ѵ�
2. �߻� �޼ҵ� ������
3. �����ʿ� ������Ʈ���� ����
*/

package chat;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class ChatA extends JFrame implements ActionListener, KeyListener{
	static JTextArea area;
	JScrollPane scroll;
	JPanel p_south;
	JTextField t_input;
	JButton bt_open;
	
	//�̷��� �ϸ� ������ ������ ���� ���δ�.
	static ChatA chatA;
	static ChatB chatB; //��������� ���� �ٸ��޼ҵ忡�� ���� �ִ�.	
	static ChatC chatC;
	boolean chatFlag=false;

	public ChatA(){
		super("chatA");
		area=new JTextArea(18,20);
		scroll=new JScrollPane(area);
		p_south=new JPanel();
		t_input=new JTextField(15);
		bt_open=new JButton("����");

		p_south.add(t_input);
		p_south.add(bt_open);

		add(scroll, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);

		
		//�����ֱ� ���� ��� ������Ʈ�� �������� ����		
		bt_open.addActionListener(this);
		
		//Ű�����ʿ��� ����
		t_input.addKeyListener(this);
		
		setBounds(100, 100, 300, 400); //x, y, width, height
		setVisible(true);
		t_input.requestFocus(); //Ŀ�� �ø���!!
		//setEname?
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		if(chatFlag==false){
			//System.out.println("���ⴭ����?");
			//ChatB�� �ν��Ͻ� �����
			//ChatB chatB=new ChatB(); ��������� �ٲٸ� �����ϸ� �ȵȴ�.
			chatB=new ChatB();
			chatC=new ChatC();
			t_input.requestFocus(); //Ŀ�� �ø���!!
			chatFlag=!chatFlag;
		}
	}

	public void keyPressed(KeyEvent e){
	
	}

	public void	keyReleased(KeyEvent e){
		int key=e.getKeyCode();
		//System.out.println(key);
		
		/*key���� ���͸� ������ 10�ΰ� �׽�Ʈ�� ���� �츮�� �˰ԵǾ���.
		������ �츮�� �ΰ��̱� ������ 10���ٴ� ENTER��� �ܾ �� �ͼ��ϴ�.
		�̷��� ������ ����� �ַ� ���ȴ�.
		�� �����, �� ���� ������ �ʴ� Ư¡�� �ִ°��� �ƴ϶�,
		���α׷��ӿ��� ģ���� �ܾ��� �ǹ̸� �ο��ϴ� ������ ���� ũ��!!
		*/
		if(key==KeyEvent.VK_ENTER){
			//System.out.println("�����ƾ�??");
			
			//1. ���� area�� t_input�� ���� ����ϰ�
			//area.setText("�Է��߾�?"); //��ü�ع���
			String msg=t_input.getText();		
			area.append(msg+"\n");  // \n�� �ٹٲ�
			t_input.setText("");//�ʱ�ȭ

			//2. ChatB�� area���� t_input���� ����Ѵ�.
			if(chatB!=null && chatC!=null){
				chatB.area.append(msg+"\n");
				chatC.area.append(msg+"\n");
			}
		}
	}

	public void	keyTyped(KeyEvent e){

	}


	public static void main(String[] args){
		chatA=new ChatA();
	}

}
