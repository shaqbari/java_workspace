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
		super("나의 메모장");
		
		bar=new JMenuBar();
		
		m_file=new JMenu("파일");
		m_edit=new JMenu("수정");
		m_font=new JMenu("서식");
		m_view=new JMenu("보기");
		m_help=new JMenu("도움말");
		
		i_new=new JMenuItem("새로만들기");
		i_open=new JMenuItem("열기");
		i_save=new JMenuItem("저장");
		i_save_as=new JMenuItem("다른이름으로 저장");
		i_set=new JMenuItem("페이지 설정");
		i_print=new JMenuItem("인쇄");
		i_exit=new JMenuItem("끝내기");
		
		area=new JTextArea(30, 20);
		scroll=new JScrollPane(area);
		
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
