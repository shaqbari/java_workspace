package com.ss.copy;

class Test{
	public Test() {
				
	}
	
	public int returnTest(){
		System.out.println("����");
		System.out.println("�ٸ�");
		System.out.println("�޼ҵ�");
		System.out.println("ȣ��");
		return 3;
	}
	
	public static void main(String[] args) {
		Test test=new Test();
		int x=test.returnTest();
		System.out.println("������ ��ȯ�Ѵ�"+x+"��");
	}
}
