/*
�ڹپ��ε� GUI(Graphic User Interface,
�׷��������� ���ø����̼��� ����� �� �ֵ��� �����ϴ� ȯ��!!)
���ø����̼��� ������ �� �ִ�.
�׸��� �ڹٸ� ���� �� �� �� �ִ� ��ȸ, �����̴�.

��� �׷��� ���α׷��� ������ �󿡼� ����ǹǷ� �ڹٿ���
�����츦 ���� ���� �����.
*/
package gui;
//java�� lang�� �ڵ� import�ȴ�. �������� �������� import�ؾ��Ѵ�.
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Color;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.CheckboxGroup;
import java.awt.TextArea;
/*import java.awt.*; �ص� ���ƴ� ������ ���Ұ��� �˼� ����.
Ư�� �ٸ������*/
class WinTest{
	public static void main(String[] args){
		Frame frame=new Frame();
		/*������Ʈ�� �ʹ� ������� ��������Ƿ� �� ������ �ذ��ϱ� ����
		���̾ƿ��� �����Ѵ�.(�̵��� ������)*/
		FlowLayout flow=new FlowLayout();
		frame.setLayout(flow); //���̾ƿ� ����

		
		/*�������� ����Ʈ�� ������ �ʴ� �Ӽ��� ������.
		���� ���̰� ó������		*/
		frame.setVisible(true);
		frame.setSize(300, 400);
		frame.setTitle("�ȳ��ϼ���");

		//��ư�� ������
		Button bt; //null
		bt=new Button("�չ�ư");		
		frame.add(bt);

		//�ؽ�Ʈ �Է¹ڽ� ����
		TextField txt;
		txt=new TextField("�ؽ�Ʈ�� �Է��ϼ���");
		/*java.awt.TextField txt=new java.awt.TextField("�ؽ�Ʈ�� �Է��ϼ���");
		�� import���ϰ� ������ ������ �����ϴ�.*/
		frame.add(txt);

		//�����쿡 ���� ����
		/*���� ó�� ���� ��ü�� ���� ��ó��*/
		/*�ڹ��� ��� ��ü�� �ᱹ �Ϲ�, �߻�, �������̽� �� �ϳ��̴�.
		���� ó�������� ��ü�� ������ �ᱹ �޸𸮿� �÷��� ����϶�� �ذ��̱� ������
		3�� ��� ���̽��� ���ϴ��� ���� ������ �� �� ��ü�� �°� �޸𸮿� �ø���
		1) �Ϲ� - new����
		2) �߻� - �ڽ��� new����
		3) �������̽� - implements �� �ڽ��� new����
		//����� 2,3���� �� �ڽĵ��� new���� �ʾƵ� �����ϴ� ����� api����
		�����ϴ� ��찡 �ִ�.
		*/
		Color c=new Color(0, 0, 255);
		frame.setBackground(c);
		//1.��ü �ڷ����� �Ϲ� Ŭ����, �߻� Ŭ����, �������̽� ������ ������ �ִ�.
		//�Ϲ�Ŭ������ new�� ���� �ִ�.
		//�߻�Ŭ����, �������̽� subclass �������� �ʾƵ� ���� ���� �ִ�.	//���߿� ����.
		//2. �����ڸ� ����.

		//üũ�ڽ� ����
		Checkbox ch0=new Checkbox("����");
		Checkbox ch1=new Checkbox("����");
		Checkbox ch2=new Checkbox("����");
		Checkbox ch3=new Checkbox("�");

		frame.add(ch0);
		frame.add(ch1);
		frame.add(ch2);
		frame.add(ch3);
	
		//html������ select�� �ڹٿ���Choice�� �Ѵ�.
		//��� ���� �ٳ��� �����ְ� �غ���
		Choice cho=new Choice();		
		cho.add("���");
		cho.add("����");
		cho.add("�ٳ���");
		frame.add(cho); //�����ӿ� ����

		//������  ��, ���� üũ�Ѵ�.
		//����) java������ Radio��� �� ��ü�� ����!
		//Checkbox�� �׷�ȭ���Ѿ� �Ѵ�.
		CheckboxGroup radio1=new CheckboxGroup();
		Checkbox c1=new Checkbox("��", radio1, false);
		Checkbox c2=new Checkbox("��", radio1, true);
		frame.add(c1);
		frame.add(c2);

		//TextArea ����
		TextArea ta=new TextArea(20, 30);
		frame.add(ta);
	}
}
