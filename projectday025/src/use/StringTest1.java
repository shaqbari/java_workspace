/*String�� ���� �ڼ��� �˾ƺ���
java.leng�� import���� �ʾƵ� �ڵ����� import�ȴ�.
*/

package use;

class StringTest1{
	public static void main(String[] args){
		//implicit(������, �Ͻ���) ������
		//��ġ �Ϲݺ���ó�� �����ϴ� ���
		//heap������ ���Ǯ(constant pool)�� �ִ� ����� �ּҸ� ����Ű�� �ȴ�.
		//�ߺ��Ǵ� ����� ���� ��� ���� �ּҰ��� ������ �ȴ�. 
		String s1="korea";
		String s2="korea";
		/*������ ���������� String ��ü�� �����ϸ� constant Pool�� ��ü�� �����ǹǷ�
		�̹� �����ϴ� ���ڿ� ��ü�� ��� �ߺ��������� �ʴ´�.
		���� �Ʒ��� �񱳿����ڴ� �ּҺ񱳿���.*/

		//explicit(�����) ������
		//new�� ���� ��ü�������� �״�� ����� ���
		//����� ������� ���� ���ڿ���ü�� �����ϸ� ��û�� �޸� ���� �ϰ� �ȴ�.
		String s3=new String("korea");
		String s4=new String("korea");
		//s3�� s4�� reference�����̴�.

		System.out.println(s1==s2); //true��µȴ�. ������ �ּҸ� ���Ѱ��̴�.
		System.out.println(s1.equals(s2)); //true��µȴ�.
		
		System.out.println(s3==s4); //false��µȴ�.
		System.out.println(s3.equals(s4)); //true��µȴ�.
		//equals()�޼ҵ带 ���� ����񱳰� �����ϴ�.
	}
}
