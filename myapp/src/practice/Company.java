package practice;

class  Company{
	private int  memberCount;
	private String location;

	public void setMemberCount(int memberCount){
		this.memberCount=memberCount;
	}
	public int getMemberCount(){
		return this.memberCount;
	}

	public void setLoacation(String location){
		this.location=location;
	}
	public int getLocation(){
		return this.location;
	}
}