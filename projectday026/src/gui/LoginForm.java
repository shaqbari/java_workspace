/*�α��� �� �����*/

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
		/* ������� ���� �м��ѵ� �ǹ̸� �ο��Ͽ� �������� ���
		������� ���� ����(import ����) �׷��� ���ް�����.*/
		/*���������� �����ڰ� �ʱ�ȭ���� ������ �ڵ����� �ʱ�ȭ���� �����Ƿ�
		�Ʒ��� ��ü�鿡 ���� ���۷��� ������ �ƹ��� ���� ������� �ʴ�.*/
		Frame frame=null; //FM
		Panel p_center, p_south, p_container;
		Label la_id, la_pw;
		TextField t_id, t_pw; 
		Button bt_login, bt_regist;

		frame=new Frame("�α��� ��");
		p_center=new Panel();
		p_south=new Panel();
		p_container=new Panel();
		la_id=new Label("ID");
		la_pw=new Label("Password");
		t_id=new TextField(20);
		t_pw=new TextField(20);
		bt_login=new Button("�α���");
		bt_regist=new Button("ȸ������");

		//���Ϳ��� �����ϱ�
		//���̱� ���� ���̾ƿ��� ���� �����ؾ� �Ѵ�.
		//Panel�� ����Ʈ�� FlowLayout�̹Ƿ�, GridLayout���� ��������
		p_center.setLayout(new GridLayout(2,2));//1ȸ���̹Ƿ� �Ű��������� ��������
		p_center.add(la_id); //1�� 1��
		p_center.add(t_id); //1�� 2��
		p_center.add(la_pw); //2�� 1��
		p_center.add(t_pw); //2�� 2��

		//���ʿ��������� ��ư ����
		p_south.add(bt_login);
		p_south.add(bt_regist);

		//������ ���, BorderLayout�� ������ �����̳�
		p_container.setLayout(new BorderLayout());

		//�гε��� �����ӿ� ������
		//frame.add(p_center, BorderLayout.CENTER);
		//frame.add(p_south, BorderLayout.SOUTH);

		//�гε��� �����̳ʿ� ������
		p_container.add(p_center, BorderLayout.CENTER);
		p_container.add(p_south, BorderLayout.SOUTH);

		//�������� ���̾ƿ��� Flow����ȯ
		frame.setLayout(new FlowLayout());

		//������ ũ�� �� ���̱� ����
		frame.add(p_container);
		frame.setSize(400, 200);
		frame.setVisible(true);	

		//awt�� ���� os������ �������� �����Ƿ� swing�� ����.
	}
}
