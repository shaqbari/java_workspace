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
		Plant("fern"); �ڱ��ڽ��� ��Ī�Ҷ��� this�� ����Ѵ�.
	}
	*/

	public String getName(){
		return name;
	}
}
