package practice;

class  Customer{
    private String name;
    private int age;
    private boolean isMarry;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}

	public void setIsMarry(boolean isMarry){
		this.isMarry=isMarry;
	}
	public boolean getIsMarry(){
		return this.isMarry;
	}

}