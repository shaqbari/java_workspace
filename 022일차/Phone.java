/*�ڹ��� �޼ҵ忡 ���� �н��Ѵ�.
	1.�Ű����� �ִ� �Լ�
	2.��ȯ�� �ִ� �Լ�
*/

class Phone{	
	//�Ű����� �ִ� �޼ҵ�
	public void call(int a){	//java������ �޼ҵ��� �Ű������� �ڷ������־���Ѵ�.
		System.out.println(a);
	}

	public void call2(int a){	//java������ �޼ҵ��� �Ű������� �ڷ������־���Ѵ�.
		System.out.println(this); //this�� ������ �ν��Ͻ��ڽ��� ���Ѵ�.
		//this��? �ν��Ͻ��� �ڱ��ڽ��� ����Ű�� ���� ���۷��������̴�.

		this.getPrice(); 
		//���� Phone�� �ν��Ͻ�ȭ �Ǿ� heap�� ���� �ö󰡱� ������. this�� ���°��� �ڿ�������.
	}

	//��ȯ���� �ִ� �޼ҵ�
	//��ȯ���� ���� ��쿣 �ݵ��
	//�� ��ȯ���� �ش��ϴ� �ڷ����� ����ؾ� �Ѵ�.(�޼ҵ��� �տ�....)
	public int getPrice(){ //��ȯ���� �ִ� ��� void��� ��ȯ���� �ڷ����� ���ش�.
		return 5;		
	}

	public static void main(String[] args){
		/*Phone�� �ν��Ͻ� �޼ҵ常�� �����ϰ� �����Ƿ�, �޼ҵ带 ����ϱ� ���ؼ���
		���� phone�� �ν��Ͻ��� �޸𸮿� �������� �켱�̴�.*/
		Phone p=new Phone();
		p.call(70);

		p.call2(70);
		System.out.println(p);	//p�� ��������� �ּҰ� ��µȴ�.
	
		p.getPrice(); //5��� ���ų� ��������

		//��ȯ�����ִ� �޼ҵ�� �����ͳ� ���������̹Ƿ� ȣ���� ������ ��ų� ���
		int y=p.getPrice();
		System.out.println(y);

		//System.out.println(p.call(70)); return���� ��� �Ű������� ������� ���Ѵ�.
	}
}
