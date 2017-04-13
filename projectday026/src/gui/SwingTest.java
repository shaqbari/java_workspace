/*
�ڹ��� �׷��� ��ü���� awt���� ���������� awt�� os�� ���� �� �����
�޶����� ������ �ֱ� ������ �̸� ������ gui������Ʈ ��Ű���� swing�̴�.
�δ㰮�� ����, awt�� ���α׷������ �޶����� ���� ����, ���� ��Ű�����
Ŭ�������� �� Ʋ������.
����) awt�� ���� �������� �ʴ� �κ�(��ġ������, �̺�Ʈ)�� �̺�Ʈ �����ÿ� ������ ���ȴ�.
���) gui���α׷��� awt+swing�� �����Ͽ� ����Ѵ�.
*/

package gui;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.FlowLayout;

/*���߽� ����Ģ
1. Ŭ����
	- ���۴ܾ�� �ݵ�� �빮�ڷ� �����϶�.
	- 2�� �̻��� ���վ��� ��� ��Ÿ����� �̿��϶�

2. �޼ҵ�
	- �޼ҵ���� �ݵ�� �ҹ��ڷ� �����϶�!

3. ����
	- �ҹ��ڷ� ������ ��
	- Ư�����ڷ� �������� ����
	(���� - �����(_), $�� ����)
	- ���ڷ� ���ۺҰ� (ex: 2x=3)

4. ���
	- ��� �빮�ڷ� ǥ���� ��
	- ��� ���� ������ �ȳ�����, �ٸ� �����ڰ� �Ϲݺ������� �˰� ȥ���Ѵ�.

5. ���۷������� ����� �ҹ��ڷ� ����
*/

class SwingTest{
	public static void main(String[] args){
		JFrame frame=null;
		JPasswordField t_pass=null;
		JButton bt=null;

		frame=new JFrame("�� ������ ������");		
		t_pass=new JPasswordField(20);
		bt=new JButton("��������");

		frame.setLayout(new FlowLayout());
		frame.add(t_pass);
		frame.add(bt);

		//������ â�� ������, ���α׷� �� ���μ����� ���̴� �޼ҵ� ȣ��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
		frame.setVisible(true);
	}
}
