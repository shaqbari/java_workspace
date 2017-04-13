/*
GUI���� ������Ʈ�� ���� ���ϴ� ��ġ�� �������ؼ���
��ġ�� �˾ƾ� �Ѵ�.
�ڹ� gui������ �� 5�� ������ ��ġ������(class)�� �����Ѵ�.
1.Flowlayout(��)
2.BorderLayout(��)
3.GridLayout
4.GridBagLayout
5.CardLayout
*/

package gui;
import java.awt.*;//�ظ��ϸ� ��������.

class BorderTest{
	public static void main(String[] args){
		//BorderLayout�� ��������, ���Ͷ�� ������ ��踦 ���� ���̾ƿ��̴�.
		Frame frame=new Frame();

		//�������� �ڽ��� ������ ��ġ�����ڸ� �����ϴ� �޼ҵ带 ������ �ִ�.
		/*
		BorderLayout b=new BorderLayout();
		frame.setLayout(b);
		*/
		
		frame.setLayout(new BorderLayout());//���� ������ ��ȸ���϶� �̷��� ������ �ִ�.
		frame.setVisible(true);
		frame.setSize(500, 400);

		//���ʿ� ��ư ��������!!
		Button bt_north=new Button("����");
		Button bt_east=new Button("����");
		Button bt_south=new Button("����");
		Button bt_west=new Button("����");
		Button bt_center=new Button("�߾�");

		//frame.add(bt_north);
		//������ ������ ������ �⺻������ center�� �ٴ´�. �׸��� ������ Ȯ���Ѵ�.

		frame.add(bt_north, BorderLayout.NORTH); 
		//���⼭ NORTH�� static���� ����Ǿ �ν��Ͻ� �������ϰ� �ٷ� ��밡��
		frame.add(bt_east, BorderLayout.EAST);
		frame.add(bt_south, BorderLayout.SOUTH);
		frame.add(bt_west, BorderLayout.WEST);
		frame.add(bt_center, BorderLayout.CENTER);

	}
}
