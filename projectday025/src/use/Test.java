/*
sun���� �����ϴ� ������ Ŭ�������� ������ ������ APO��� �ϸ�,
�� API��ü���� ���� ������ ������ API Document��� �Ѵ�.
*/

package use;
class Test{
	int a=3;
	//Dog d; import���� �����鿡������.
	String s; //import ���� �ʾƵ� ���� �ȳ���.
	/*String Ŭ������ sun���� �����ϴ� �⺻api��ü�� �ϳ�����.
	���� java.lang��Ű���� ����ۼ��� �ʹ��� �⺻������ �ʿ��� �͵��̹Ƿ�
	�����ڰ� import���� �ʾƵ� �ȴ�.*/

	public static void main(String[] args){
		Test t=new Test();

		System.out.println(t.a);

		
		String str="korea vs japan";

		char c=str.charAt(2);
		System.out.println(c);

		for(int i=0; i<str.length(); i++){
			char c1=str.charAt(i);
			System.out.print(c1); //����� ���η� ���
		}
		/*
		for(){
			char c=str.charAt(io)
		}
		*/
		
		//a vs j�� ����غ���
		String c2=str.substring(4, 10);
		System.out.println(c2);

		//���߿� �ٸ� ���ڰ� �͵� a vs j�� ����غ���
		String str1="koreaaaaa vs jjjjapan";
		
		int index=str1.indexOf(" ");//ù��°�� �߰ߵǴ� ���鹮���� index�� ��ȯ�޴´�
		String ch=str1.substring(index-1, index+5);
		System.out.println(ch);

		//(1) ���ڿ����� 4��° ��ġ�� 'e' ���ڸ� �����Ͽ� ����ϼ���. 
			char c01=str.charAt(3);
			System.out.println(c01);
		//(2) ���� �� ù��° a�� index (����)�� ����ϼ���.
			int index02=str.indexOf("a");
			System.out.println(index02);

		//(3) ���� �� ������ a�� index �� ����ϼ���
			int index03=str.indexOf("a", 11);
			System.out.println(index03);

			int startIndex=0;
			int indexBefore=str.indexof("a", startIndex)


		//(4) ���ڿ��� �� ���̸� ����ϼ���.
			int length04=str.length();
			System.out.println(length04);

		//(5) korea �� "�ڸ���"�� ��ü�Ͽ� "�ڸ��� java"�� ����ϼ���.
			String ch05=str.replace("korea", "�ڸ���");
			System.out.println(ch05);
		//(6) 3��°���� 8��° ���ڿ����� �����Ͽ� ����ϼ���.
			String ch06=str.substring(2,8);
			System.out.println(ch06);
	
		//(7) �빮�ڷ� ��ȯ�Ͽ� "KOREA JAVA" �� ����ϼ���.
			String ch07=str.toUpperCase();
			System.out.println(ch07);

	}
}
