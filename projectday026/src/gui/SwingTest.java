/*
자바의 그래픽 객체들은 awt에서 지원하지만 awt가 os에 따라 그 모습이
달라지는 단점이 있기 때문에 이를 개선한 gui컴포넌트 패키지가 swing이다.
부담갖지 말자, awt와 프로그램방식이 달라지는 것은 없고, 단지 패키지명과
클래스명이 좀 틀려진다.
주의) awt는 눈에 보여지지 않는 부분(배치관리자, 이벤트)나 이벤트 구현시엔 여전히 사용된다.
결론) gui프로그램시 awt+swing을 조합하여 사용한다.
*/

package gui;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.FlowLayout;

/*개발시 명명규칙
1. 클래스
	- 시작단어는 반드시 대문자로 시작하라.
	- 2개 이상의 복합어일 경우 낙타기법을 이용하라

2. 메소드
	- 메소드명은 반드시 소문자로 시작하라!

3. 변수
	- 소문자로 시작할 것
	- 특수문자로 시작하지 말것
	(예외 - 언더바(_), $는 가능)
	- 숫자로 시작불가 (ex: 2x=3)

4. 상수
	- 모두 대문자로 표기할 것
	- 약속 어기면 에러는 안나지만, 다른 개발자가 일반변수인줄 알고 혼동한다.

5. 레퍼런스변수 선언시 소문자로 갈것
*/

class SwingTest{
	public static void main(String[] args){
		JFrame frame=null;
		JPasswordField t_pass=null;
		JButton bt=null;

		frame=new JFrame("난 개선된 윈도우");		
		t_pass=new JPasswordField(20);
		bt=new JButton("나눌러봐");

		frame.setLayout(new FlowLayout());
		frame.add(t_pass);
		frame.add(bt);

		//윈도우 창이 닫히면, 프로그램 즉 프로세스도 죽이는 메소드 호출
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
		frame.setVisible(true);
	}
}
