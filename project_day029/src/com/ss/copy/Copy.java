/*특정 디렉토리 안의 파일을 원하는 위치로 복사해 본다*/
/*
1. 스트림이란?(Stream)
흐름을 뜻한다..
현실에서의 스트림은 그 대상이 물이지만,
전산에서의 스트림의 대상은 데이터 이다.
결국 데이터가 흐르는 모습을 가리켜 스트림이라고 한다.

2.종류
 1)방향에 따른 구분
	입력: 실행중인 프로그램으로 데이터가 들어가는 스트림
	출력: 실행중인 프로그램에서 데이터가 나오는 스트림

복사는 입출력을 모두 한다.
------------------------------------------------------------------------
컴파일 했을때 컴파일러가 무사히 컴파일을 마치면 이 프로그램은 정상 수행이 보장된것이다?? 아니다!
------------------------------------------------------------------------
자바코드를 작성후 컴파일 했을때, 문법에 없다고 하여 그 프로그램은 언제나 정상 수행을 보장해주진
않는다.
예) 파일의 경로를 잘못 적은 경우(문법 x, 데이터 문제)
	-->컴파일은 제대로 되었으나, 실행시 에러발생해서 비정상종료 된다.
예) 방금전까지는 파일이 존재해서 제대로 프로그램이 수행되고 있었는데, 누군가가 파일을 지워버리거나
이동시키는 경우(프로그램으로 감당 할 수 없는 외부 요인)
	-->실행시 에러발생해서 비정상 종료된다.

	비정상종료는 굉장히 위험하다.
	신뢰성이 감소해서 사용자 급감

	우주선발사 등 중요한 작업에서 치명적인 손실발생 
*/

package com.ss.copy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

class Copy extends JFrame{
	//입력 stream: input
	//출력 stream: output
	//둘이 합쳐서 IO

	FileInputStream fis;
	String ori="D:/google/쌍용교육센터/java_workspace2/project_day029/src/com/ss/res/jeju01.jpg";
	//만일 경로 String 를 잘못 작성작성해도 컴파일은 되지만 실행은 되지 않는다.예외사항발생!

	public Copy(){
		try{//이 코드는 무조건 실행부에 의해 시도된다.
			//sun에서는 try문에서 에러가 발생한 경우 프로그램을 비정상 종료시키지 않기 위해
			//실행부가 catch문으로 진입하게 하여 정상수행을 할 수 있는 기회를 준다.
			//복구보다는 문제가 발생한 원인에 대한 안내를 하는데 주로 이용된다.
			
			fis=new FileInputStream(ori); //미래에 에러를 발생할 가능성이 있는 코드
		
		//만일 이 try문에서 파일을 찾을 수 없는 에러가 발생할 경우,
		//sun에서는 FileNotFoundException 객체를 메모리에 올리고,
		//이 인스턴스를 개발자에게 전달해 준다.
		//왜?? 그래야 개발자가 에러정보를 이용하여 사용자에게 알맞는 메세지를 보여줄 수 있으니깐
		
		}catch(FileNotFoundException e){//에러발생하면 자동으로 메모리에 올라가므로 호출만하면된다.
			JOptionPane.showMessageDialog(this, "파일을 찾을 수 없습니다.");		
		}

		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public static void main(String[] args){
		new Copy();
	}
}
