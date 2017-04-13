/*
GUI에서 컴포넌트를 내가 원하는 위치에 놓기위해서는
배치를 알아야 한다.
자바 gui에서는 총 5개 유형의 배치관리자(class)를 지원한다.
1.Flowlayout(★)
2.BorderLayout(★)
3.GridLayout
4.GridBagLayout
5.CardLayout
*/

package gui;
import java.awt.*;//왠만하면 쓰지말자.

class BorderTest{
	public static void main(String[] args){
		//BorderLayout은 동서남북, 센터라는 방위와 경계를 갖는 레이아웃이다.
		Frame frame=new Frame();

		//프레임은 자신이 설정할 배치관리자를 결정하는 메소드를 가지고 있다.
		/*
		BorderLayout b=new BorderLayout();
		frame.setLayout(b);
		*/
		
		frame.setLayout(new BorderLayout());//위와 같지만 일회성일때 이렇게 쓸수도 있다.
		frame.setVisible(true);
		frame.setSize(500, 400);

		//북쪽에 버튼 부착하자!!
		Button bt_north=new Button("북쪽");
		Button bt_east=new Button("동쪽");
		Button bt_south=new Button("남쪽");
		Button bt_west=new Button("서쪽");
		Button bt_center=new Button("중앙");

		//frame.add(bt_north);
		//방위를 정하지 않으면 기본적으로 center에 붙는다. 그리고 주위로 확장한다.

		frame.add(bt_north, BorderLayout.NORTH); 
		//여기서 NORTH는 static으로 선언되어서 인스턴스 생성안하고 바로 사용가능
		frame.add(bt_east, BorderLayout.EAST);
		frame.add(bt_south, BorderLayout.SOUTH);
		frame.add(bt_west, BorderLayout.WEST);
		frame.add(bt_center, BorderLayout.CENTER);

	}
}
