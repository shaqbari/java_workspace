/*
양자 채팅을 구현한다.
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

class ChatC extends JFrame implements KeyListener{
	static JTextArea area;
	JScrollPane scroll;
	JPanel p_south;
	JTextField t_input;
	ChatA chatA;
	ChatB chatB;

	public ChatC(ChatA chatA, ChatB chatB){		
		super("chatC");		
		area=new JTextArea(18,20);
		scroll=new JScrollPane(area);
		p_south=new JPanel();
		t_input=new JTextField(15);
		this.chatA=chatA;
		this.chatB=chatB;
		
		p_south.add(t_input);

		add(scroll, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);

		t_input.addKeyListener(this);
		
		setBounds(700, 100, 300, 400); //x, y, width, height
		setVisible(true);

		//프로세서죽이는거는 한개만 해야한다.
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void keyPressed(KeyEvent e){

	}

	public void keyReleased(KeyEvent e){
		int key=e.getKeyCode();

		/*엔터키를 누르면 t_input에서 text를 가져와
		자신의 area에 붙이고 chatA의 area에도 붙인다.*/
		if(key==KeyEvent.VK_ENTER){
			//System.out.println("b에서 엔터쳤니?");
			String msg=t_input.getText();
			area.append(msg+"\n");
			chatA.area.append(msg+"\n");	
			chatB.area.append(msg+"\n");	
			t_input.setText("");
			t_input.requestFocus();
		}
	}

	public void keyTyped(KeyEvent e){
	
	}
}
