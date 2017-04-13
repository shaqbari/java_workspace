/*
GridLayout 배치관리자를 사용해보자

자바의 GUI컴포넌트는 크게 2가지로 분류된다.
1. 남을 포함하는 자(container 컨테이너)
	Frame, Panel
	컨테이너는 다른 컴포넌트를 어떻게 올려놓을지 
	즉, 배치를 어떻게 할지를 고민하는 주체이므로
	모든 컨테이너는 setLayout이라는 메소드가 지원되고 있다.
	만일 개발자가 아무것도 지정하지 않으면?
	Frame - BorderLayout
				그래서 아까 최초에 대왕버튼을 만났다.
	Panel - FlowLayout
	
2. 남에게 포함당하는 자(visual component 비주얼 컴포넌트)
	Button, TextField, Checkbox..
*/

package gui;
import java.awt.Frame; //경로를 지정
import java.awt.Button; //경로를 지정
import java.awt.GridLayout; //경로를 지정


class GridTest{
	public static void main(String[] args){
		Frame frame=new Frame("그리드 공부");
		frame.setVisible(true); //보이게 처리
		frame.setSize(200, 500);
			/*기본자료형과 객체 자료형간의 형변환시나 다양한 업무 처리시
			Wrapper 클래스를 이용한다.
			
			개발을 하다보면, 기본자료형과, 객체 자료형간에 형변환이라던가,
			기본자료형만으로는 할 수 없는 기능을 구현해야할 경우가 있다.
			이때 지원되는 클래스가 바로 Wrapper클래스인데,
			자바의 모든 기본자료형마다 1:1로 대응하는 Wrapper 클래스가 있다
			byte -> Byte
			short -> Short
			int -> Integer
			long -> Long
			float -> Float
			double -> Double
			boolean -> Boolean
			char -> Character
			
			Wrapper 클래스의 목적 
			1) 기본자료형과 객체자료형간의 형변환
			2) 기본자료형을 대상으로 보다 다양하고 복잡한 기능을 구현시 객체차원으로
			끌어올려 보다 많은 메소드를이용하여 업무를 처리하기 위해 지원.
			
			문자 "21"을 기본자료형으로 변환 -->21
			int a=Integer.parseInt("21");
			*/

		//Frame은 디폴트가 BorderLayout이므로 GridLayout을 지정해보자
		GridLayout grid = new GridLayout(5, 2);
		frame.setLayout(grid);
		for(int i=1; i<=10; i++){
			Button bt=new Button(Integer.toString(i));
			frame.add(bt);
		}

		//과제 로그인폼
	}
}
