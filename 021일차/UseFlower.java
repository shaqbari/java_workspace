/*���� ����غ���*/

class UseFlower{

	//���� �޼ҵ�! �� ������̴�.
	public static void main(String[] args){
		//��3���� �޸𸮿� �ø���, ������ ���� open, close�� ȣ���غ���

		Flower f0=new Flower();
		Flower f1=new Flower();
		Flower f2=new Flower();

		f0.open();
		f0.close();

		f1.open();
		f1.close();

		f2.open();
		f2.close();

		System.out.println(f0.color);
		
	}
}
