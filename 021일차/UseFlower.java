/*꽃을 사용해보자*/

class UseFlower{

	//실행 메소드! 즉 실행부이다.
	public static void main(String[] args){
		//꽃3개를 메모리에 올리고, 각각의 꽃의 open, close를 호출해보자

		Flower f0=new Flower();
		Flower f1=new Flower();
		Flower f2=new Flower();

		f0.open();
		f0.close();

		f1.open();
		f1.close();

		f2.open();
		f2.close();

		System.out.println(f0.color);
		
	}
}
