package plant;
import plant.Plant;

public class Tree extends Plant{
	/*
	public Tree() {
		Plant(); //super("xxx");로 써야함
	}
	*/
	//사용자가 따로 생성자 정의하지 않으면 상속받을시 생성자에 super();호출
	public void growFruit(){
	}

	public void dropLeaves(){
	}
}
