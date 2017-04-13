package com.ss.graphic;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoGallary2 extends JFrame implements ActionListener{
	JLabel label;
	JPanel p;
	JButton bt_prev, bt_next;
	ArrayList<String> imgArr;	
	Toolkit kit; //게임만들때는 다른것을 쓸수도 있다.
	Image img;
	Canvas canvas;
	int count=0; //배열의 인덱스
	
	String[] path={
		"D:/google/쌍용교육센터/html_workspace/images/jeju01.jpg",
		"D:/google/쌍용교육센터/html_workspace/images/jeju02.jpg",
		"D:/google/쌍용교육센터/html_workspace/images/jeju03.jpg",
		"D:/google/쌍용교육센터/html_workspace/images/jeju04.jpg",
		"D:/google/쌍용교육센터/html_workspace/images/jeju05.jpg"				
	};
	
	public PhotoGallary2() {
		label=new JLabel(path[count]);
		p=new JPanel();
		bt_prev=new JButton("이전");
		bt_next=new JButton("다음");
		/*
		imgArr=new ArrayList<String>();	
		imgArr.add("D:/google/쌍용교육센터/html_workspace/images/jeju01.jpg");
		imgArr.add("D:/google/쌍용교육센터/html_workspace/images/jeju02.jpg");
		imgArr.add("D:/google/쌍용교육센터/html_workspace/images/jeju03.jpg");
		imgArr.add("D:/google/쌍용교육센터/html_workspace/images/jeju04.jpg");
		imgArr.add("D:/google/쌍용교육센터/html_workspace/images/jeju05.jpg");
		*/	
				
		kit=Toolkit.getDefaultToolkit();
		img=kit.getImage(path[count]);
		
		//캔버스에 이미지가 올라가기 전에 이미지가 생성되어 있어야 한다.
		canvas=new Canvas(){
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, 600, 550, this); //여기서 this는 canvas를 의미한다.
				System.out.println("paint호출!");
			}
		};
		canvas.setBackground(Color.GRAY);	
		
		/*
		bt_prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				img=kit.getImage(imgArr.get(count));
				label.setText(imgArr.get(count));					
				canvas.repaint();
			}
		});
		
		bt_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				img=kit.getImage(imgArr.get(count));
				label.setText(imgArr.get(count));				
				canvas.repaint();
			}
		});
		*/
		
		//버튼마다 연결
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
			
		
		p.add(bt_prev);
		p.add(bt_next);
		
		add(label, BorderLayout.NORTH);
		add(canvas);
		add(p, BorderLayout.SOUTH);
		
		setSize(600, 650);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
	}
	
	public void actionPerformed(ActionEvent e) {//e가 클릭에 의해서 발생한 event객체이다.
		//System.out.println(e);
		
		//경고창을 띄우는 법
		//JOptionPane.showMessageDialog(this, "나눌렀어?");
		
		//actionEvent는 클릭뿐만 아니라, 여러 행위를 아우르는 이벤트 객체이다.
		//따라서 버튼만 actionevent를 일으키는게 아니다.
		//그래서 e.getSource를 호출하면, 어떤 컴포넌트가 이벤트를 일으켰는지
		//예측할수 없으므로, 가장 큰 object형으로 반환해 준다.
		Object obj = e.getSource(); //이벤트를 일으킨 컴포넌트
		
		//큰쪽에서 작은쪽으로 변할때는 cast연산자를 사용해야 한다.
		JButton btn=(JButton)obj;
		
		if (btn == bt_prev) { //주소값이 왼쪽이라면..
			//JOptionPane.showMessageDialog(this, "이전"); //다이얼로그 박스가 생성된다. alert와 동일
			//parentComponent는 디자인에서 그 컴포넌트를 포함하고 있는 컴포넌트를 의미한다.
			//여기서 this는 jframe을 의미
			
			prev();
			//함수를 따로 만드는 것이 유지보수상 좋다.
			
		}else if (btn == bt_next) {
			//JOptionPane.showMessageDialog(this, "다음");			
			next();
		}
	}
	
	//이전 사진 보여주기
	public void prev(){
		//이미지의 경로 변경+라벨의 값도 변경
		count--;
		img=kit.getImage(path[count]);
		
		//개발자는 paint메소드를 호울할 수 없다.
		//paint는 언제호출되나??
		/*유저가 해당 컴포넌트의 변경을 가할 때 스스로 호출된다
		 * 따라서 버튼을 누르게 되면, 캔버스의 변경을 가한적이 없기 때문에
		 * paint메소드는 호출되지 않는다.
		 * 해결책) 캔버스의 페인트메소드를 강제호출해야 하지만, 호출불가이기 때문에
		 * 간접호출해야 한다.
		 * 시스템한테 paint를 호출해 달라고 요청해야 한다.
		 * 이때 쓰는 메소드가 repaint() ---> update() ---> paint()
		 * 1. update()메소드는 기존 화면을 싹 지운다
		 * 2. paint()메소드가 다시 그린다.
		 * 따라서 이미지 용량이 큰 경우엔 우리 눈에는 깜빡거리는 효과가 나는 것이다.
		 * 게임만들때 더블버퍼링을 이용하면 이 깜빡거리는 효과를 없앨 수 도 있다.*/
		
		canvas.repaint();	
		
		//이용자가 그림을 바꾸기 때문에 이용자가 바꿀때 자동으로 호출된다.
		//하지만 버튼을 누르는 행위는 캔버스와 상관이 없기 때문에 눌러도 호출되지 않는다.
		
		//그림이 조금이라도 변경되면 기존의 그림은 싹 지우고 새로 다시 만들었네
		//연산할것이 많아서 gpu, ram이 따로 필요할경우도 있다.
		
		label.setText(path[count]);
	
		
	}
	
	//다음사진 보여주기
	public void next(){
		count++;
		img=kit.getImage(path[count]);		
		label.setText(path[count]);
		canvas.repaint();	
	}
	
	
	
	public static void main(String[] args) {
		new PhotoGallary2();
	}

}
