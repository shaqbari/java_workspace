package use;

class MainTest{
	public void test(){
	
	
	}

	//���� �޼ҵ�� �ý����� ȣ���ϹǷ�, �� java.exe����� ȣ���ϹǷ�
	//�����ڰ� ȣ���� �� ����.
	//����� java MainTest ����, ���, ���� �����
	//main�Լ��� ���ڷ� ���� ��� ���ڰ� ���޵ȴ�.
	public static void main(String[] args){
		int leng=args.length;
		System.out.println(args[0]);
		System.out.println("����� �ѱ� �迭�� ���̴� "+leng);

		/*integer�� wraper��ü
		integer�� parseInt�޼ҵ�� static���� ���ǵǾ�
		class�޼ҵ��̹Ƿ�	�ٷ� ���� ����
		�μ��� �ѱ� ���ڿ��� ���� ����ȭ ���� ��ȯ
		
		//����� �Է°��� �޾� ������ ���
		int dan=Integer.parseInt(args[0]);		
		for(int i=1; i<=9; i++){
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		*/

		/*
			mario.jpg�� ���� ���������� �μ��� ������
			�� �м� ����� �����ֱ�
			���ϸ��� mario
			Ȯ���ڴ� jpg
		*/
		//Ư������ Ư�������� �ϴ� ��찡 �����Ƿ�
		//�������� �ΰ�\\(�ͽ�������)���ٿ��� ���ڷ� �ν��Ѵ�.		
		String[] arr=args[0].split("\\."); //mario, jpg
		System.out.println(arr[0]);
		System.out.println(arr[1]);		
	
		System.out.println("���ϸ���"+arr[0]+"�̰�, Ȯ���ڴ�"+arr[1]+"�Դϴ�.");
		

		

	}
}
