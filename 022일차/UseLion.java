class UseLion{
	public static void main(String[] args){
		//���� 2������ �ν��Ͻ��� ��������!
		int a= 3;
		Lion lion1=new Lion();
		Lion lion2=new Lion();
		System.out.println(a);

		/*
		������ ��ü�� �ּҰ��� ��� ���� ��� �̷��� ������ ������
		���۷��� ����reference(���, ����)�� �Ѵ�.
		���� ������ ��ü ��ü�� ������ ���� �ƴ϶�, ���� �� ��ü�� 
		heap ������ �����ġ�� �ִ��� �� �ּҰ����� ��� �ִ�.
		���⼭ lion1�� lion2�� ���������� �ش��Ѵ�.
		*/
		System.out.println(lion1); //
	}
}
