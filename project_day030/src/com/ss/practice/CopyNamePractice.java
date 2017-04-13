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
		bt_open= new JButton("����");
		bt_save= new JButton("���");
		bt_exc= new JButton("����");
		t_open=new JTextField(34);
		t_save=new JTextField(34);
		chooser=new JFileChooser("E:/google/�ֿ뱳������/java_workspace2/project_day030/src/com/ss/");		
		
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
	
	//����Ž���⸦ ���� ������ �����̸��� t_open�� set
	private void open() {
		txtSet(chooser, t_open);		
	}
	
	//����Ž���⸦ ���� ������ �����̸��� t_open�� set
	private void save() {
		txtSet(chooser, t_save);
	}
	
	//t_open�� ������ ����� ������ t_save�� ������ ��η� ����
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
			JOptionPane.showMessageDialog(this, "������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "io�۾��� �����߻�");
		} finally (){
			if(fos!=null){
				fos.close(); //fos�� ���� finally�� �׻� �ݾ���� �Ѵ�. ���׷��̵� ���� ������ �װź���
			}
		}
	}
	
	private void txtSet(JFileChooser chooser, JTextField t) {
		int state=chooser.showOpenDialog(this);
		if (state==JFileChooser.APPROVE_OPTION) {
			File file= chooser.getSelectedFile();
			//showOpenDialog���� �޸𸮿� �ö� File type �ν��Ͻ��� �޴°��̹Ƿ� ���� new���� �ʾƵ� �ǰ� import�� ���ص� �ȴ�.
			t.setText(file.getPath());
		}
	}

	public static void main(String[] args) {
		new CopyNamePractice();
	}

}
