/*override 100% ���� ��ġ
overloading �޼ҵ� �̸��� ��ġ(��ȯ�� ���x)
*/

public class A {
	public void doit() {
	
	}

//�����ε� ������
//return���� �ڷ����� ������� �̸��� ����
//�Ű������� �ڷ����� �ٸ��ų�, �����޶���Ѵ�.
	public String doit() { 
		
		return "a";
	}
	
	public double doit(int x) {
		return 1.0;
	}
}