class UseDog{
	public static void main(String[] args){
		//강아지 인스턴스 1개 생성
		Dog d1=new Dog();
		System.out.println(d1.name);		
		
		System.out.println(d1.getName());
		//System.out.println(d1.setName()); setName은 return값이 없어 에러
		
		d1.setName("레오", "푸들");
		System.out.println(d1.name+" "+d1.type);
	}
}
