/*
양자 채팅을 구현한다.
*/
/*
양자채팅을 구현한다
이벤트 구현의 3단계!
1. 적절한 리스너를 선택하여 구현(implements)한다
2. 추상 메소드 재정의
3. 리스너와 컴포넌트와의 연결
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
	
	//이렇게 하면 컴파일 순서에 따라 꼬인다.
	static ChatA chatA;
	static ChatB chatB; //멤버변수로 빼야 다른메소드에서 쓸수 있다.	
	static ChatC chatC;
	boolean chatFlag=false;

	public ChatA(){
		super("chatA");
		area=new JTextArea(18,20);
		scroll=new JScrollPane(area);
		p_south=new JPanel();
		t_input=new JTextField(15);
		bt_open=new JButton("열기");

		p_south.add(t_input);
		p_south.add(bt_open);

		add(scroll, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);

		
		//보여주기 직전 대상 컴포넌트와 리스너의 연결		
		bt_open.addActionListener(this);
		
		//키리스너와의 연결
		t_input.addKeyListener(this);
		
		setBounds(100, 100, 300, 400); //x, y, width, height
		setVisible(true);
		t_input.requestFocus(); //커서 올리기!!
		//setEname?
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		if(chatFlag==false){
			//System.out.println("열기눌렀어?");
			//ChatB의 인스턴스 만들기
			//ChatB chatB=new ChatB(); 멤버변수로 바꾸면 선언하면 안된다.
			chatB=new ChatB();
			chatC=new ChatC();
			t_input.requestFocus(); //커서 올리기!!
			chatFlag=!chatFlag;
		}
	}

	public void keyPressed(KeyEvent e){
	
	}

	public void	keyReleased(KeyEvent e){
		int key=e.getKeyCode();
		//System.out.println(key);
		
		/*key값이 엔터를 쳤을때 10인걸 테스트를 통해 우리는 알게되었다.
		하지만 우리는 인간이기 때문에 10보다는 ENTER라는 단어가 더 익숙하다.
		이러한 이유로 상수가 주로 사용된다.
		즉 상수란, 그 값이 변하지 않는 특징만 있는것이 아니라,
		프로그래머에게 친숙한 단어의 의미를 부여하는 목적이 아주 크다!!
		*/
		if(key==KeyEvent.VK_ENTER){
			//System.out.println("엔터쳤어??");
			
			//1. 나의 area에 t_input의 값을 출력하고
			//area.setText("입력했어?"); //대체해버림
			String msg=t_input.getText();		
			area.append(msg+"\n");  // \n은 줄바꿈
			t_input.setText("");//초기화

			//2. ChatB의 area에도 t_input값을 출력한다.
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
