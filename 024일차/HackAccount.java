/*Account 클래스를 사용하려는 악의의 클래스*/

class HackAccount{
	public static void main(String[] args){
		//Account 클래스의 인스턴스에 나쁜짓하기
		Account ac=new Account();
		//ac.money=-10000000;
		//System.out.println("잔고는 "+ ac.money);
		
		ac.setMoney(-100000);

		//System.out.println("잔고는 "+ ac.money); 잔고출력은 바로불가능
		int total=ac.getMoney();
		System.out.println(total);
	}
}
