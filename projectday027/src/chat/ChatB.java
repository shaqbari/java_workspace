/*
���� ä���� �����Ѵ�.
*/
package chat;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class ChatB extends JFrame implements KeyListener{
	static JTextArea area;
	JScrollPane scroll;
	JPanel p_south;
	JTextField t_input;
	ChatA chatA;
	ChatC chatC;

	public ChatB(ChatA chatA, ChatC chatC){
		super("chatB");
		area=new JTextArea(18,20);
		scroll=new JScrollPane(area);
		p_south=new JPanel();
		t_input=new JTextField(15);
		this.chatA=chatA;
		this.chatC=chatC;
		
		//chatA=new ChatA(); ����� �̰ɾ��� ���ο� Aä��â�� �����.

		p_south.add(t_input);

		add(scroll, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);

		t_input.addKeyListener(this);
		
		setBounds(400, 100, 300, 400); //x, y, width, height
		setVisible(true);

		//���μ������̴°Ŵ� �Ѱ��� �ؾ��Ѵ�.
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void keyPressed(KeyEvent e){

	}

	public void keyReleased(KeyEvent e){
		int key=e.getKeyCode();

		/*����Ű�� ������ t_input���� text�� ������
		�ڽ��� area�� ���̰� chatA�� area���� ���δ�.*/
		if(key==KeyEvent.VK_ENTER){
			//System.out.println("b���� �����ƴ�?");
			String msg=t_input.getText();
			area.append(msg+"\n");
			chatA.area.append(msg+"\n");	
			chatC.area.append(msg+"\n");	
			t_input.setText("");
			t_input.requestFocus();
		}
	}

	public void keyTyped(KeyEvent e){
	
	}
}
