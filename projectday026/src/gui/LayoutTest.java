package gui;
import java.awt.*;

class LayoutTest{
	public static void main(String[] args){
		Frame frame=new Frame();
		frame.setVisible(true);
		frame.setSize(400, 300);
		
		Button bt1=new Button("난형");
		Button bt2=new Button("난 동생");
	
		/*컨테이너당 오직 1개의 레이아웃만 적용할 수 있으므로,
		윈도우 영역중 일부에 대해 다른 레이아웃을 적용하려면,
		프레임 안에 또다른 컨테이너를 넣으면 된다. 주로 사용하는
		컨테이너는 Panel이라 불리는 객체이다.
		Panel은 디폴트로 FlowLayout이 적용되어 있으므로
		버튼의 크기가 깨지지 않는다.
		*/			
				
		//frame.add(bt1, BorderLayout.NORTH);
		//frame.add(bt2, BorderLayout.NORTH); 이렇게하면 bt2만 꽉채워나옴

		Panel p=new Panel();
		p.add(bt1);
		p.add(bt2);

		frame.add(p, BorderLayout.NORTH);

		
	}
}
