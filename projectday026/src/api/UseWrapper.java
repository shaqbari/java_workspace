package api;

class UseWrapper{
	public static void main(String [] args){
		Integer i=new Integer("3");
		/*i=5; �⺻�ڷ����� ��ü�ڷ������� �޾����Ƿ� 
		unBoxing�̶�� �Ѵ�. Wrapper class�����ؼ��� ����*/

		int x=3;
		x=i; /*���� boxing�̶���Ѵ�.
		�⺻�ڷ���-->��ü�ڷ���*/
	}
}
