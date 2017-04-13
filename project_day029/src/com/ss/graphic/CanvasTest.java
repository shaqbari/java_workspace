/*
 * 그림 그려질 목적으로 지원되는 객체인
 * canvas에 그림을 그려보자
 * 왜 캔버스에 그려야 하나?
 * 캔버스는컨테이너 처럼 아무것도 없기 때문이다.
 * 왜냐하면 빈 도화지를 표현한 객체이므로.
 * */

package com.ss.graphic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CanvasTest extends JFrame{
	Canvas can; //텅빈 도화지	
	Toolkit kit;// javaSE에서 이미지를 얻으려면 툴킷 객체를 이용해야 한다.(sun사가 정함)
	Image img; //추상클래스라서 new 못함, kit으로부터 얻어와야 한다.
	
	public CanvasTest() {
		//img=new image(); 이미지는 추상클래스라 new안된다. 
		//추상클래스라도 꼭 sub class를 쓸 필요는 없다. 메모리내의 다른 instance를 이용하는 방법도 있다
		//이번에는 toolkit을 쓰자 
		//반환형을 보면 자신의 자료형을 반환하는것이 보통 인스턴스를 얻는것이다.
		//반환형을 보면 어느정도 그 메소드의 기능을 알 수 있다.
		
		kit=Toolkit.getDefaultToolkit(); //인스턴스 얻기 
		//getDefaultToolkit()메소드는 static 메소드이다. 그래서 바로 클래스에서 호출가능
		img=kit.getImage("D:/google/쌍용교육센터/html_workspace/images/pica.jpg");
				//역슬래시는 두번써야 역슬래시로 인식한다. 윈도우만 역슬래시 쓰므로 슬래시쓰는 습관을 들이자.
		
		//내부익명클래스로 캔버스를 상속받는 클래스를 생성
		//여기서 오버라이드 하자
		can = new Canvas(){
			//paint메소드는 사실상 행위에 불과하며
			//어떤 그림을 그릴지를 결정하는 객체는 graphics객체이다.
			public void paint(Graphics g) {//이미 인수로 들어와있으니 그냥 쓰면 된다.
				/*
				g.drawLine(0, 0, 300, 400);
				g.drawOval(200, 200, 300, 300);
				g.drawRect(100, 100, 200, 200);
				*/
				g.drawImage(img, 200, 200, 300, 300, this); //캔버스가 이미지의 관찰자가 된다.
			}	//내부익명클래스 안에서 this는 내부익명클래스 자신을 가리킨다.
		};
		can.setBackground(Color.YELLOW);
		add(can);
		
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CanvasTest();
	}

}
