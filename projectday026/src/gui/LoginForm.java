/*로그인 폼 만들기*/

package gui;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;


class LoginForm{
	public static void main(String[] args){
		/* 만들것을 먼저 분석한뒤 의미를 부여하여 변수명을 지어서
		선언부터 먼저 하자(import 포함) 그래야 안햇갈린다.*/
		/*지역변수는 개발자가 초기화하지 않으면 자동으로 초기화되지 않으므로
		아래의 객체들에 대한 레퍼런스 변수엔 아무런 값도 들어있지 않다.*/
		Frame frame=null; //FM
		Panel p_center, p_south, p_container;
		Label la_id, la_pw;
		TextField t_id, t_pw; 
		Button bt_login, bt_regist;

		frame=new Frame("로그인 폼");
		p_center=new Panel();
		p_south=new Panel();
		p_container=new Panel();
		la_id=new Label("ID");
		la_pw=new Label("Password");
		t_id=new TextField(20);
		t_pw=new TextField(20);
		bt_login=new Button("로그인");
		bt_regist=new Button("회원가입");

		//센터영역 조합하기
		//붙이기 전에 레이아웃을 먼저 결정해야 한다.
		//Panel은 디폴트가 FlowLayout이므로, GridLayout으로 변경하자
		p_center.setLayout(new GridLayout(2,2));//1회성이므로 매개변수에서 선언하자
		p_center.add(la_id); //1행 1열
		p_center.add(t_id); //1행 2열
		p_center.add(la_pw); //2행 1열
		p_center.add(t_pw); //2행 2열

		//남쪽영영영역에 버튼 부착
		p_south.add(bt_login);
		p_south.add(bt_regist);

		//프레임 대신, BorderLayout을 적용할 컨테이너
		p_container.setLayout(new BorderLayout());

		//패널들을 프레임에 붙이자
		//frame.add(p_center, BorderLayout.CENTER);
		//frame.add(p_south, BorderLayout.SOUTH);

		//패널들을 컨테이너에 붙이자
		p_container.add(p_center, BorderLayout.CENTER);
		p_container.add(p_south, BorderLayout.SOUTH);

		//윈도우의 레이아웃을 Flow로전환
		frame.setLayout(new FlowLayout());

		//윈도우 크기 및 보이기 설정
		frame.add(p_container);
		frame.setSize(400, 200);
		frame.setVisible(true);	

		//awt를 쓰면 os에따라서 디자인이 깨지므로 swing을 쓴다.
	}
}
