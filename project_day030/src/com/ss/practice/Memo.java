package com.ss.practice;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame{
	JMenuBar bar;
	JMenu m_file, m_edit, m_font, m_view, m_help;
	JMenuItem i_new, i_open, i_save, i_save_as, i_set, i_print, i_exit;
	JTextArea area;
	JScrollPane scroll;
	
	public Memo() {
		super("���� �޸���");
		
		bar=new JMenuBar();
		
		m_file=new JMenu("����");
		m_edit=new JMenu("����");
		m_font=new JMenu("����");
		m_view=new JMenu("����");
		m_help=new JMenu("����");
		
		i_new=new JMenuItem("���θ����");
		i_open=new JMenuItem("����");
		i_save=new JMenuItem("����");
		i_save_as=new JMenuItem("�ٸ��̸����� ����");
		i_set=new JMenuItem("������ ����");
		i_print=new JMenuItem("�μ�");
		i_exit=new JMenuItem("������");
		
		area=new JTextArea(30, 20);
		scroll=new JScrollPane(area);
		
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
		
		setJMenuBar(bar);
		add(scroll);
		
		
		setBounds(300, 400, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Memo();
	}
}
