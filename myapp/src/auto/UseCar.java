package auto;
//���� ��Ű������ import�� �ʿ����.
class UseCar{
	public static void main(String[] args){
		CarBody cb=new CarBody();

		/*
		//w�� null�� �ƴϰ� �غ���
		cb.w=new Wheel(); //������ �ø���.
		cb.h=new Handle();
		cb.e=new Engine();
		���� ���� ����� ���� ����ü�� ���� ������ Ÿ�̾�, �ڵ�, ������ ���� ��޿��°�
		CarBody�� ������ �����Ҷ��� �ν��Ͻ��� �����ؼ�
		�ν��Ͻ� ���鶧 �����ڿ��� �ڵ�ȣ��ǰ� �ϴ°��� ����.
		*/

		System.out.println(cb.w);
	}
}
