/*�Ʒ��� Ŭ�������� ��������� �� ������ �ڷ�����
��ü���� ��츸, has a�������Ѵ�.
�� ����� �ϸ� �繰�� ������� �Ѵ�.*/

package auto;

public class CarBody{
	int price; //�⺻�ڷ����̹Ƿ� has a���谡 �ƴϴ�.
	//�ʱ�ȭ���ϸ� 0���� �����Ϸ��� �ڵ��ʱ�ȭ �Ѵ�. 
	String name; //has a����

	Handle h;
	Engine e;
	Wheel w; //has a����
	/*��ü�ڷ����� �����Ϸ��� ���� ����Ʈ �ʱ�ȭ�� ����?
	�ƹ��� ��ü�� ����Ű�� ���� ���� ���۷��������� null�� �ʱ�ȭ�ȴ�.
	null��?? ���� ���ٴ� ���̴�.
	*/

	boolean airType; //false;

	public CarBody(){
		this.h=new Handle();
		this.e=new Engine();
		this.w=new Wheel();
	}
}
