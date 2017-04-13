class UseLion{
	public static void main(String[] args){
		//사자 2마리의 인스턴스를 생성하자!
		int a= 3;
		Lion lion1=new Lion();
		Lion lion2=new Lion();
		System.out.println(a);

		/*
		변수가 객체의 주소값을 담고 있을 경우 이러한 변수를 가리켜
		레퍼런스 변수reference(언급, 참조)라 한다.
		참조 변수는 객체 자체를 보유한 것이 아니라, 단지 그 객체가 
		heap 영역중 어느위치에 있는지 그 주소값만을 담고 있다.
		여기서 lion1과 lion2가 참조변수에 해당한다.
		*/
		System.out.println(lion1); //
	}
}
