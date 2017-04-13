package animal.bird;

class UseDuck{
	public static void main(String[] args){
		Duck d=new Duck("오리"); //Bird도 같이 메모리에 올라간다.
		d.fly();
		
		System.out.println(d.name);
	}
}
