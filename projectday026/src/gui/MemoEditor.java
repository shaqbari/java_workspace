/*메모장을 만들어보자*/
package gui;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;


class MemoEditor extends JFrame{
	JMenuBar bar; //초기값 null이 들어있다. 왜냐하면 멤버변수이기 때문에
	JMenu m_file, m_edit, m_font, m_view, m_help;
	JMenuItem i_new, i_open, i_save, i_save_as, i_set, i_print, i_exit;	
	JTextArea area;
	JScrollPane scroll; //스크롤 객체
	Font font;

	/*메모장 윈도우가 태어날때, 그 부품도 동시에 태어나야 하므로,
	생성자의 기회를 놓치지 말자*/
	public MemoEditor(){
		// int x=2; 불가능 왜냐하면 부모의 탄생보다 앞설수 없으므로
		super("나 윈도우 - 메모장");
		bar=new JMenuBar();
				
		//메뉴들을 생성하자!!
		m_file = new JMenu("파일");
		m_edit = new JMenu("수정");
		m_font = new JMenu("서식");
		m_view = new JMenu("보기");
		m_help = new JMenu("도움말");

		i_new = new JMenuItem("새로 만들기");
		i_open= new JMenuItem("열기");
		i_save= new JMenuItem("저장");
		i_save_as= new JMenuItem("다른 이름으로 저장");
		i_set= new JMenuItem("페이지 설정");
		i_print= new JMenuItem("인쇄");
		i_exit= new JMenuItem("끝내기");

		area=new JTextArea(20, 25);
		scroll = new JScrollPane(area); //스크롤이 area를 흡수한다.
		font = new Font("랄라", 1, 40);
		
		//메뉴를 bar에 붙이자
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_font);
		bar.add(m_view);
		bar.add(m_help);
		
		//메뉴아이템을 파일메뉴에 붙이자
		m_file.add(i_new);
		m_file.add(i_open);
		m_file.add(i_save);
		m_file.add(i_save_as);
		m_file.addSeparator();
		m_file.add(i_set);
		m_file.add(i_print);
		m_file.addSeparator();
		m_file.add(i_exit);

		area.setFont(new Font("VERDANA", Font.BOLD, 20));
		//다시 안쓸거면 인자에서 new
		area.setForeground(Color.GREEN);
		//GREEN은 Color의 상수(pulbic static final)이므로 바로 사용가능

		//메뉴바를 JFrame에 붙이자.
		setJMenuBar(bar);
		add(scroll); /*스크롤이 area를 이미 흡수했으므로 	

		최종적으로 스크롤을 부착해야한다.*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 100, 600, 500);
		setVisible(true);
		
	}

	public static void main(String[] args){
		new MemoEditor();
	}
}
