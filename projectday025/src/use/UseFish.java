/*�������� �Ẹ��*/
package use;
import animal.fish.Fish;
import animal.fish.Nimo;

class UseFish{
	public static void main(String[] args){
		Fish f1 = new Fish("��ġ");
		//f1.swim();

		Nimo n1=new Nimo();
		System.out.println(f1.equals(n1)); //equals�޼ҵ�� Fish���� �������� �ʾ����� ��� ��ü�� Object Ŭ������ ��ӹޱ� ������ ��밡���ϴ�.
		Object obj=f1; //�����ϴ�. //������ ���ŷ� ǥ���ѰͰ� ����

		//System.out.println(super.name);//�Ұ��� main������ super�� ���� ���� main�ڽ��� super�� ����Ű�� �Ǵ°��̴�.. �ν��Ͻ������� super�� this�� �����ϴ�.
		n1.swim();
		
		//����ȯ �غ���!! ���� �ڷ������� �����ϴ�
		//Fish�� Nimo�� ���� �ڷ����̴�. .
		//f1=n1; //���� ����Ŭ������ ū �ڷ����̴�
		//n1=f1; //�Ұ���
		//n1=(Nimo)f1;  //����
		//System.out.println(f1.name);
	}
}
