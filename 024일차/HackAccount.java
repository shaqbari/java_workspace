/*Account Ŭ������ ����Ϸ��� ������ Ŭ����*/

class HackAccount{
	public static void main(String[] args){
		//Account Ŭ������ �ν��Ͻ��� �������ϱ�
		Account ac=new Account();
		//ac.money=-10000000;
		//System.out.println("�ܰ�� "+ ac.money);
		
		ac.setMoney(-100000);

		//System.out.println("�ܰ�� "+ ac.money); �ܰ������ �ٷκҰ���
		int total=ac.getMoney();
		System.out.println(total);
	}
}
