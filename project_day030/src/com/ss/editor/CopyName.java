package com.ss.editor;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class CopyName extends JFrame implements ActionListener{
	JButton bt_open, bt_save, bt_exc;
	JTextField t_open, t_save;
	FileInputStream fis; //������ ������� �� �Է½�Ʈ��
	FileOutputStream fos; //������ ������� �� ��½�Ʈ��

	JFileChooser chooser;//���� Ž���⸦ ó���ϴ� ��ü
	File filedef, file, fileDir;
	
	public CopyName() {
		bt_open = new JButton("����");
		bt_save = new JButton("���");		
		bt_exc = new JButton("����");
		t_open = new JTextField("D:/google/�ֿ뱳������/java_workspace2/project_day030/src/com/ss/res/jeju01.jpg", 46);
		t_save = new JTextField("D:/google/�ֿ뱳������/java_workspace2/project_day030/src/com/ss/data/", 46);
		//file=new File("D:/google/�ֿ뱳������/java_workspace2/project_day030/src/com/ss/res/jeju01.jpg");


		setLayout(new FlowLayout());
		
		add(bt_open);
		add(t_open);
		add(bt_save);
		add(t_save);
		add(bt_exc);

		//��ư�� �����ʿ��� ����
		bt_open.addActionListener(this);
		bt_save.addActionListener(this);
		bt_exc.addActionListener(this);
		
		//���� ������ �̸� �÷�����
		filedef=new File("D:/google/�ֿ뱳������/java_workspace2/project_day030/src/com/ss/res/jeju01.jpg");
		chooser = new JFileChooser(filedef);

		setSize(600,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		Object obj=e.getSource(); //�̺�Ʈ �ҽ��� ��ȯ�޴´�.!!
		//ActionEvent�� ����� ��ư �Ӹ��ƴ϶� textField�� �پ��� ������Ʈ�� �ü� �ֱ� ������
		//������Ʈ������ �޾ƾ� �Ѵ�.
	
		if(obj==bt_open){
			System.out.println("����");
			open();
			
		}else if(obj==bt_save){
			System.out.println("������ ��μ���");
			savePath();
		}else if(obj==bt_exc){
			System.out.println("����");
			copy();
		}
	}

	//���Ͽ���
	public void open(){
		//chooser.showOpenDialog(this);//�̷��Ը� ���� ������ ���ϸ����� �ٲܼ� ����
		chooser.showOpenDialog(this);
		if(chooser.getSelectedFile()!=null){
			file=chooser.getSelectedFile();
			String filePath=file.getPath();
			t_open.setText(filePath);
		}	
	}

	public void savePath(){
		chooser.showSaveDialog(this);
		if(chooser.getSelectedFile()!=null){
			System.out.println("��μ���");
			fileDir=chooser.getSelectedFile();
			String dir=fileDir.getPath();
			t_save.setText(dir);
		}	
	}

	//�����ϱ�
	public void copy(){
		//�������Ͽ� ��Ʈ�� �����Ͽ�, �����͸� ���̸�����
		//������ �����͸� ���� ���Ͽ� ��������
		
		String oriPath = t_open.getText();
		String destPath = t_save.getText(); //dest�� destination�� ����
		try{
			fis=new FileInputStream(oriPath);
			fos=new FileOutputStream(destPath);			
			int data=-1; //�̷��� �ʱ�ȭ�ص� �ǰ� ���ص� �ȴ�.

			while(true){
				data=fis.read();//���� �������� ���α׷����� 1byte�� �о����!!
				//read(byte[] b)�� �̿��ϸ� �ѹ��� ��byte�� ������ �ִ�.
				if(data==-1)break; //fos�� ���� ���� �������� -1�����Ͱ� �� ������.
				fos.write(data);

				//��Ʈ���� ����
				/*try���ȿ��� ���� ��� ������
				oriPath, destPath�� �߸��Ǹ�
				����ΰ� ������ �ٷ� catch������ ���� ��Ʈ���� ���� ����
				fis.close();
				fos.close();
				*/				
			}
			JOptionPane.showMessageDialog(this, "����Ϸ�");
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(this, "������ ã�� �� �����ϴ�.");
			/* catch���ȿ� ���� ���������� ����Ǿ����� ��Ʈ���� ���� ���Ѵ�.
			fis.close();
			fos.close();
			*/
		}catch(IOException e){
			JOptionPane.showMessageDialog(this, "IO�۾��� �����߻��߽��ϴ�.");
		}finally{/*�������Ǵ� ���ܰ� �߻��ϴ� ������ ����ȴ�*/
			try{
				if(fis!=null && fos!=null){ //��ü�� �޸𸮿� �ö�Դٸ�
					fis.close();
					fos.close();
				}
			}catch(IOException e){
				JOptionPane.showMessageDialog(this, "IO�۾��� �����߻��߽��ϴ�.");
			}
		}
	}
	
	//�����Ҷ� setDefaultCloseOperation();�Ժηξ��� ��Ʈ���� ���� ��ȸ�� ��������.
	//�׷��Ƿ� �����츮������ closing���� ��Ʈ���� �ݰ� ������Ѿ� �Ѵ�.

	public static void main(String[] args) {
		new CopyName();
	}
}
