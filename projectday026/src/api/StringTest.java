/*
String�� ���� ���� �˾ƺ���
*/

package api;

class StringTest{
	
	public static void main(String[] args){
		//String�� �Һ��̴�.!!(immutable)
		String str="korea";
		str=str+"fighting"; //���Ʒ� �ΰ��� ���ڿ��� ���������� ����(�ּҰ� ���ε���)
		//���⼭ korea�� �����ɰ����� ���������� ��ǻ� String�� �ѹ� �����Ǹ� ����
		//������� �ʴ� �����.
		
		for(int i=0; i<100; i++){
			String str1="korea";
			str1=str1+i; //���Ʒ� �ΰ��� ���ڿ��� ���������� ����()
		}//�̷��� for���� ���� ���İ��� String��ü�� �鰳 ���������. ���̾��� �޸𸮰� ����

		/*�ذ�å) String�� �̿��Ͽ� ���� ���ڿ��� �����Ϸ����Ҷ��� ��� �ؾ��ϳ�?
		���氡���� ���ڿ��� ó�����ִ� api�̿�
		StringBuffer*/
		StringBuffer sb=new StringBuffer(); //java.lang�� ����־ import���� �ʾƵ��ȴ�.
		//StringBuffer�� �߰��ɻ��̸� ���ο� ���ڿ������ �������� �ʴ´�. �� 1���� ���߰���
		sb.append("korea");
		sb.append("fight");
		sb.append("and");
		sb.append("forever");
		/*sb�� String�� �ƴϱ� ������ println�μ��� ������
		�ڵ���ȯ�Ǳ� ������ ������� �����Ѵٸ� String������ ��ȯ�ؾ�
		�Ѵ�. Object��� �ֻ��� ��ü�� ������ �޼��� �� ��ü�� String����
		��ȯ���ִ� �޼ҵ尡 �ִ�. �ٷ� toString()*/
		System.out.println(sb.toString());
	}
}
