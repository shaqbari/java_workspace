/*
 * 버튼 클래스는 final로 선언되어 있지 않으므로 당연히 상속이 가능하다!
 *버튼에만 해당하는것이 아님
 * */

package com.ss.graphic;

import java.awt.Graphics;

import javax.swing.JButton;

public class MyButton extends JButton{	
	//상속관계시 부모의 생성자는 물려주지 않으므로 스스로 만들어야 한다
	public MyButton(String title) {
		super(title);//부모의 생성자 호출
	}
	
	//모든 컴포넌트는 스스로를 그리므로, 이때 사용도는 메소드가 paint메소드 이며
	//이 메소드를 개발자가 오버라이드 한다면, 개발자가 버튼을 그리게 된다.
	
	//sun사보다 더 잘그릴 자신 없으면 오버라이드 하면 안됨
	/*sun에서 제공하는 컴포넌트 중 개발자가 그대로 사용해야할 것이 있고,
	 * 개발자가 주도하여 그래픽 처리를 해야 할 것이 있다.
	 * 컴포넌트 중 개발자가 무언가를 그리는 용도의 컴포넌트는 JPanel, JFrame등 주로
	 * 컨테이너 류를 대상으로 하자.!
	 * Canvas는 그림 그릴대상의 목적으로 제공됨
	 * j가 안붙은 canvas는 옛날거라서 그래픽 처리가 느리기 때문에 JPanel이 더빠르다.	 * 
	 * */
	public void paint(Graphics g) {
		System.out.println("그려져!!");
	}
	
	//패널은 뺏을만 하다. sun사의 컴포넌트중 패널과 같이 비어있는 컴포넌트는
	//개발자가 주도해 변경해 쓸만 하다.
}
