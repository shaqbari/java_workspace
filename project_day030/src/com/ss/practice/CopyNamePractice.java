package com.ss.practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CopyNamePractice extends JFrame implements ActionListener{
	JButton bt_open, bt_save, bt_exc;
	JTextField t_open, t_save;
	JFileChooser chooser;
		
	public CopyNamePractice() {
		bt_open= new JButton("열기");
		bt_save= new JButton("경로");
		bt_exc= new JButton("복사");
		t_open=new JTextField(34);
		t_save=new JTextField(34);
		chooser=new JFileChooser("E:/google/쌍용교육센터/java_workspace2/project_day030/src/com/ss/");		
		
		setLayout(new FlowLayout());
		
		add(bt_open);
		add(t_open);
		add(bt_save);
		add(t_save);
		add(bt_exc);
		
		bt_open.addActionListener(this);
		bt_save.addActionListener(this);
		bt_exc.addActionListener(this);
		
		setSize(500,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if (obj==bt_open) {
			open();
		}else if (obj==bt_save) {
			save();
		}else if (obj==bt_exc) {
			copy();
		}
	}
	
	//파일탐색기를 띄우고 지정한 파일이름을 t_open에 set
	private void open() {
		txtSet(chooser, t_open);		
	}
	
	//파일탐색기를 띄우고 지정한 파일이름을 t_open에 set
	private void save() {
		txtSet(chooser, t_save);
	}
	
	//t_open에 씌여진 경로의 파일을 t_save에 씌여진 경로로 복사
	private void copy() {
		String oriPath=t_open.getText();
		String destPath=t_save.getText();
		
		try {
			FileInputStream fis=new FileInputStream(oriPath);
			FileOutputStream fos=new FileOutputStream(destPath);
			int data=-1;
			
			while (true) {
				data=fis.read();
				if (data==-1)	break;
				fos.write(data);				
			}			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(this, "파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "io작업중 에러발생");
		} finally (){
			if(fos!=null){
				fos.close(); //fos는 쓰고 finally로 항상 닫아줘야 한다. 업그레이드 빨때 있으면 그거부터
			}
		}
	}
	
	private void txtSet(JFileChooser chooser, JTextField t) {
		int state=chooser.showOpenDialog(this);
		if (state==JFileChooser.APPROVE_OPTION) {
			File file= chooser.getSelectedFile();
			//showOpenDialog에서 메모리에 올라간 File type 인스턴스를 받는것이므로 따로 new하지 않아도 되고 import도 안해도 된다.
			t.setText(file.getPath());
		}
	}

	public static void main(String[] args) {
		new CopyNamePractice();
	}

}
