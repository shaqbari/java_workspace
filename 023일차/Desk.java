public class Desk {
	int x; //�ν��Ͻ�����
	static int y;
	
	{ /*A �ν��Ͻ� �ʱ�ȭ ��
		�� Ŭ�����κ��� �ν��Ͻ��� �����ɶ����� ȣ��ȴ� ����,
		�� �ν��Ͻ��� �ʱ�ȭ ���!
		int x=10;���� ������: �ʱ�ȭ���� �̿��ϸ� ������ ���� �ʱⰪ�� �̿��Ҽ� �ִ�.
	*/
		for(int i=0;i<10;i++){
			x++;
		}
	}
	
	
	static { /*B ����ƽ �ʱ�ȭ ��
		�� Ŭ������ ����Ʈ �ڵ尡 static���� �ε� �ɶ�	ȣ��Ǵ� ����	*/
		for(int i=0;i<20;i++){
			y++;
		}
	}
	
	public static void main(String[] args){
		//System.out.println(x); //C x�� �ν��Ͻ� �����̹Ƿ� �����Ǿ߸� �����ִ�.
		int a=new Desk().x; //D
		System.out.println(a); //E
		System.out.println(y); //F
		
	}
}