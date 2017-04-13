/*
GridLayout ��ġ�����ڸ� ����غ���

�ڹ��� GUI������Ʈ�� ũ�� 2������ �з��ȴ�.
1. ���� �����ϴ� ��(container �����̳�)
	Frame, Panel
	�����̳ʴ� �ٸ� ������Ʈ�� ��� �÷������� 
	��, ��ġ�� ��� ������ ����ϴ� ��ü�̹Ƿ�
	��� �����̳ʴ� setLayout�̶�� �޼ҵ尡 �����ǰ� �ִ�.
	���� �����ڰ� �ƹ��͵� �������� ������?
	Frame - BorderLayout
				�׷��� �Ʊ� ���ʿ� ��չ�ư�� ������.
	Panel - FlowLayout
	
2. ������ ���Դ��ϴ� ��(visual component ���־� ������Ʈ)
	Button, TextField, Checkbox..
*/

package gui;
import java.awt.Frame; //��θ� ����
import java.awt.Button; //��θ� ����
import java.awt.GridLayout; //��θ� ����


class GridTest{
	public static void main(String[] args){
		Frame frame=new Frame("�׸��� ����");
		frame.setVisible(true); //���̰� ó��
		frame.setSize(200, 500);
			/*�⺻�ڷ����� ��ü �ڷ������� ����ȯ�ó� �پ��� ���� ó����
			Wrapper Ŭ������ �̿��Ѵ�.
			
			������ �ϴٺ���, �⺻�ڷ�����, ��ü �ڷ������� ����ȯ�̶����,
			�⺻�ڷ��������δ� �� �� ���� ����� �����ؾ��� ��찡 �ִ�.
			�̶� �����Ǵ� Ŭ������ �ٷ� WrapperŬ�����ε�,
			�ڹ��� ��� �⺻�ڷ������� 1:1�� �����ϴ� Wrapper Ŭ������ �ִ�
			byte -> Byte
			short -> Short
			int -> Integer
			long -> Long
			float -> Float
			double -> Double
			boolean -> Boolean
			char -> Character
			
			Wrapper Ŭ������ ���� 
			1) �⺻�ڷ����� ��ü�ڷ������� ����ȯ
			2) �⺻�ڷ����� ������� ���� �پ��ϰ� ������ ����� ������ ��ü��������
			����÷� ���� ���� �޼ҵ带�̿��Ͽ� ������ ó���ϱ� ���� ����.
			
			���� "21"�� �⺻�ڷ������� ��ȯ -->21
			int a=Integer.parseInt("21");
			*/

		//Frame�� ����Ʈ�� BorderLayout�̹Ƿ� GridLayout�� �����غ���
		GridLayout grid = new GridLayout(5, 2);
		frame.setLayout(grid);
		for(int i=1; i<=10; i++){
			Button bt=new Button(Integer.toString(i));
			frame.add(bt);
		}

		//���� �α�����
	}
}
