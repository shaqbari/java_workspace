public class Phone {
	//멤버 3개 인스턴스변수1개

	int memory=300; //A
	int price; //B   멤버변수의 경우값을 대입하지 않으면 0을 default로 자동으로 대입한다
	
	public void call(){
		int n; //C
		//System.out.println("n의 값은 "+n); //D 초기화되지 않은지역변수를 쓰려고하면 에러가난다. 그러므로 지역변수는 반드시 초기화화자
	}
}