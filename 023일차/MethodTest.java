/*�ڹپ��� �ڷ����� �� 4����.
��ü�ڷ����� �ڷ����̴�.

�޼ҵ� ȣ��� �ѱ�� ���� ������ ũ�� 2���� ������ �ִ�
1. �⺻ �ڷ���
	- �⺻�ڷ����� �޼ҵ��� �μ��� �ѱ涧��
	ȣ��� �Ȱ��� ���� ����Ǿ�, ���� �Ѿ��.
	���� �ش� ���� ������ ������ ������ �ȹ޴´�.
	(call by value). ���� �Ѿ��.
2. ��ü �ڷ���
	-�޼ҵ� ȣ��� �μ��� �ѱ� �����Ͱ� ��ü���� ���,
	�� �ּҰ��� �Ѿ�Ƿ�, �ش簴ü�� ������ �޴´�.
	(call by reference)
*/

class MethodTest{
	public void test1(int a, boolean b, char c, Food x, String s){
	
	}

	public void test2(Food food){
		food.name="��ġ������";
	}

	public static void main(String[] args){
		Food f1=new Food();
		System.out.println(f1.name); //����� ��µ�

		//test2�� instance method�̴�. �׷��Ƿ� �ν��Ͻ� ���� �����ؾ��Ѵ�
		MethodTest mt=new MethodTest();
		mt.test2(f1);
		System.out.println(f1.name); //��ġ�������� ��µȴ�.
	}
}
