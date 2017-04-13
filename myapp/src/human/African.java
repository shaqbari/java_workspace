package human;

public class African extends Person{//extends는 is a관계(상속)를 나타낸다. 
	String skin="black";

	//extends는 덮어쓰는게 아니라 접근할수 있는관계를 만들어준다.
	//String name="";가능

	public void dance(){
		System.out.println("흑인이 춤을 춘다");
	}
}
