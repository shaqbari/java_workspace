/*�޸����� ������*/
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
	JMenuBar bar; //�ʱⰪ null�� ����ִ�. �ֳ��ϸ� ��������̱� ������
	JMenu m_file, m_edit, m_font, m_view, m_help;
	JMenuItem i_new, i_open, i_save, i_save_as, i_set, i_print, i_exit;	
	JTextArea area;
	JScrollPane scroll; //��ũ�� ��ü
	Font font;

	/*�޸��� �����찡 �¾��, �� ��ǰ�� ���ÿ� �¾�� �ϹǷ�,
	�������� ��ȸ�� ��ġ�� ����*/
	public MemoEditor(){
		// int x=2; �Ұ��� �ֳ��ϸ� �θ��� ź������ �ռ��� �����Ƿ�
		super("�� ������ - �޸���");
		bar=new JMenuBar();
				
		//�޴����� ��������!!
		m_file = new JMenu("����");
		m_edit = new JMenu("����");
		m_font = new JMenu("����");
		m_view = new JMenu("����");
		m_help = new JMenu("����");

		i_new = new JMenuItem("���� �����");
		i_open= new JMenuItem("����");
		i_save= new JMenuItem("����");
		i_save_as= new JMenuItem("�ٸ� �̸����� ����");
		i_set= new JMenuItem("������ ����");
		i_print= new JMenuItem("�μ�");
		i_exit= new JMenuItem("������");

		area=new JTextArea(20, 25);
		scroll = new JScrollPane(area); //��ũ���� area�� ����Ѵ�.
		font = new Font("����", 1, 40);
		
		//�޴��� bar�� ������
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_font);
		bar.add(m_view);
		bar.add(m_help);
		
		//�޴��������� ���ϸ޴��� ������
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
		//�ٽ� �Ⱦ��Ÿ� ���ڿ��� new
		area.setForeground(Color.GREEN);
		//GREEN�� Color�� ���(pulbic static final)�̹Ƿ� �ٷ� ��밡��

		//�޴��ٸ� JFrame�� ������.
		setJMenuBar(bar);
		add(scroll); /*��ũ���� area�� �̹� ��������Ƿ� 	

		���������� ��ũ���� �����ؾ��Ѵ�.*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 100, 600, 500);
		setVisible(true);
		
	}

	public static void main(String[] args){
		new MemoEditor();
	}
}
