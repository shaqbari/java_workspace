package plant;

public class Plant{
	private String name;

	public Plant(String name){
		this.name = name;
	}
	public Plant(){
		this("fern");
	}
	
	/*
	public Plant(){
		Plant("fern"); 자기자신을 지칭할때는 this를 써야한다.
	}
	*/

	public String getName(){
		return name;
	}
}
