class UseDog{
	public static void main(String[] args){
		//������ �ν��Ͻ� 1�� ����
		Dog d1=new Dog();
		System.out.println(d1.name);		
		
		System.out.println(d1.getName());
		//System.out.println(d1.setName()); setName�� return���� ���� ����
		
		d1.setName("����", "Ǫ��");
		System.out.println(d1.name+" "+d1.type);
	}
}
