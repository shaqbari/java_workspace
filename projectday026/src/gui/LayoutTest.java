package gui;
import java.awt.*;

class LayoutTest{
	public static void main(String[] args){
		Frame frame=new Frame();
		frame.setVisible(true);
		frame.setSize(400, 300);
		
		Button bt1=new Button("����");
		Button bt2=new Button("�� ����");
	
		/*�����̳ʴ� ���� 1���� ���̾ƿ��� ������ �� �����Ƿ�,
		������ ������ �Ϻο� ���� �ٸ� ���̾ƿ��� �����Ϸ���,
		������ �ȿ� �Ǵٸ� �����̳ʸ� ������ �ȴ�. �ַ� ����ϴ�
		�����̳ʴ� Panel�̶� �Ҹ��� ��ü�̴�.
		Panel�� ����Ʈ�� FlowLayout�� ����Ǿ� �����Ƿ�
		��ư�� ũ�Ⱑ ������ �ʴ´�.
		*/			
				
		//frame.add(bt1, BorderLayout.NORTH);
		//frame.add(bt2, BorderLayout.NORTH); �̷����ϸ� bt2�� ��ä������

		Panel p=new Panel();
		p.add(bt1);
		p.add(bt2);

		frame.add(p, BorderLayout.NORTH);

		
	}
}
