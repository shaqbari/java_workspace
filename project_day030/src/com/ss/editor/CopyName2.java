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


public class CopyName2 extends JFrame implements ActionListener{
	JButton bt_open, bt_save, bt_copy;
	JTextField t_open, t_save;
	FileInputStream fis; //파일을 대상으로 한 입력스트림
	FileOutputStream fos; //파일을 대상으로 한 출력스트림

	JFileChooser chooser;//파일 탐색기를 처리하는 객체
	File filedef, file, fileDir;
	
	public CopyName2() {
		bt_open = new JButton("원본경로");
		bt_save = new JButton("저장경로");		
		bt_copy = new JButton("복사실행");
		
		t_open = new JTextField("D:/google/쌍용교육센터/java_workspace2/project_day030/src/com/ss/res/jeju01.jpg", 46);
		t_save = new JTextField("D:/google/쌍용교육센터/java_workspace2/project_day030/src/com/ss/data/", 46);
		//file=new File("D:/google/쌍용교육센터/java_workspace2/project_day030/src/com/ss/res/jeju01.jpg");


		setLayout(new FlowLayout());
		
		add(bt_open);
		add(t_open);
		add(bt_save);
		add(t_save);
		add(bt_copy);

		//버튼과 리스너와의 연결
		bt_open.addActionListener(this);
		bt_save.addActionListener(this);
		bt_copy.addActionListener(this);
		
		//디폴트 디렉토리를 지정하면 편하다.
		//filedef=new File("D:/google/쌍용교육센터/java_workspace2/project_day030/src/com/ss/res/jeju01.jpg");
		//파일 추저를 미리 올려놓자
		chooser = new JFileChooser("D:/google/쌍용교육센터/java_workspace2/project_day030/src/com/ss");

		setSize(630,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		Object obj=e.getSource(); //이벤트 소스를 반환받는다.!!
		//ActionEvent의 대상은 버튼 뿐만아니라 textField등 다양한 컴포넌트가 올수 있기 때문에
		//오브젝트형으로 받아야 한다.
	
		if(obj==bt_open){
			System.out.println("열기");
			open();
			
		}else if(obj==bt_save){
			int state=chooser.showSaveDialog(this);
			//System.out.println(state);
			//상수는 인간에게 직관성을 부여해 준다. 왜?? 영어단어를 이용하니깐
			if (state==JFileChooser.APPROVE_OPTION) {
				//저장 경로를 텍스트필드에 출력!!
				File file=chooser.getSelectedFile(); //이메소드가 이미 메모리에 올려놓았기 때문에 따로 new할필요가 없다.
				
				//파일클래스가 보유한 절대경로 메소드를 이용하여 경로 봔한
				String path=file.getAbsolutePath();				
				t_save.setText(path);
			}
			
			
			
			
		}else if(obj==bt_copy){
			System.out.println("저장");
			copy();
		}
	}

	//파일열기
	public void open(){
		//chooser.showOpenDialog(this);//이렇게만 쓰면 지정한 파일명으로 바꿀수 없음
		/*chooser.showOpenDialog(this);
		if(chooser.getSelectedFile()!=null){
			file=chooser.getSelectedFile();
			String filePath=file.getPath();
			t_open.setText(filePath);
		}*/
		
		int state=chooser.showOpenDialog(this);
		//대입하면서 호출?? //가능 여러메소드 호출하고, 마지막에 return으로 반환! Test에서 확인
		if (state==JFileChooser.APPROVE_OPTION) {
			//유저가 선택한 파일에 대한 파일클래스 인스턴스 얻기			
			File file=chooser.getSelectedFile();
			
			//얻어진 인스턴스를 이용하여 절대경로 얻기
			String path=file.getAbsolutePath();
			
			//절대경로 텍스트필드에 출력하기
			t_open.setText(path);
		}
	}
/*
	public void savePath(){
		chooser.showSaveDialog(this);
		if(chooser.getSelectedFile()!=null){
			System.out.println("경로선택");
			fileDir=chooser.getSelectedFile();
			String dir=fileDir.getPath();
			t_save.setText(dir);
		}	
	}
*/
	//복사하기
	public void copy(){
		//원본파일에 스트림 생성하여, 데이터를 들이마시자
		//들어오는 데이터를 목적 파일에 내려쓰자
		
		String oriPath = t_open.getText();
		String destPath = t_save.getText(); //dest는 destination의 약자
		try{
			fis=new FileInputStream(oriPath);
			fos=new FileOutputStream(destPath);			
			int data=-1; //이렇게 초기화해도 되고 안해도 된다.

			while(true){
				data=fis.read();//현재 실행중인 프로그램으로 1byte씩 읽어들임!!
				//read(byte[] b)를 이용하면 한번에 수byte씩 읽을수 있다.
				if(data==-1)break; //fos가 먼저 오면 마지막에 -1데이터가 들어가 버린다.
				fos.write(data);

				//스트림을 닫자
				/*try문안에서 닫을 경우 문제점
				oriPath, destPath가 잘못되면
				실행부가 위에서 바로 catch문으로 들어가서 스트림을 닫지 못함
				fis.close();
				fos.close();
				*/				
			}
			JOptionPane.showMessageDialog(this, "복사완료");
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(this, "파일을 찾을 수 없습니다.");
			/* catch문안에 쓰면 정상적으로 수행되었을때 스트림을 닫지 못한다.
			fis.close();
			fos.close();
			*/
		}catch(IOException e){
			JOptionPane.showMessageDialog(this, "IO작업중 에러발생했습니다.");
		}finally{/*정상수행되던 예외가 발생하던 무조건 수행된다*/
			try{
				if(fis!=null && fos!=null){ //객체가 메모리에 올라왔다면
					fis.close();
					fos.close();
				}
			}catch(IOException e){
				JOptionPane.showMessageDialog(this, "IO작업중 에러발생했습니다.");
			}
		}
	}
	
	//숙제할때 setDefaultCloseOperation();함부로쓰면 스트림을 닫을 기회가 없어진다.
	//그러므로 윈도우리스너의 closing에서 스트림을 닫고 종료시켜야 한다.

	public static void main(String[] args) {
		new CopyName2();
	}
}
