/*������ ���� ��Ģ
1)Ŭ���� ��� �����Ұ�
2)��ȯ���� ���� ����!!
*/

class Ghost{
	String type;
	String color;

/*��Ǫ������ �ͽ��� �����Ҷ� � ��Ÿ�Ϸ� ���������� �Ʒ��� �޼ҵ忡������*/
	public Ghost(String type, String color){ //��ü�ڷ����� �ü��� �ִ�. //void�� �ᵵ �ȵȴ�. �Ϲݸ޼ҵ尡 �Ǹ� ������ ���� �����ڸ� ȣ���Ѵ�.
		this.type=type;
		this.color=color;
	}

	public void setInit(String type, String color){
		this.type=type;
		this.color=color;
	}

	public static void main(String[] args){
		Ghost g1=new Ghost("�ֿ�", "white"); //ȿ����, �¾�鼭 �ʱ�ȭ��
		
		g1.setInit("������", "white"); //�¾ �� ���������ϴ� ����
		
		System.out.println(g1.type);
	}
}
