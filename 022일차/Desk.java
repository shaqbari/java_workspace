class Desk{
	//String color="red"; //��������̸鼭 �ν��Ͻ� ����
	static String color1="green"; //static

	public void up(){
		String color2="black"; //color2�տ��� this�� �����Ȱ��̴�.
	}

	public static void main(String[] args){
		//color="yellow";	//color�� �ν��Ͻ� �����̱� ������ �ν��Ͻ��� �������� ��� �����Ͽ���
		//System.out.println(color);

		System.out.println(Desk.color1); //color1�� static�̶� �̷��� Ŭ������. ���� �����ϴ� ���� ��Ģ
	}
}
