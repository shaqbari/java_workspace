package com.ss.copy;

class Test{
	public Test() {
				
	}
	
	public int returnTest(){
		System.out.println("먼저");
		System.out.println("다른");
		System.out.println("메소드");
		System.out.println("호출");
		return 3;
	}
	
	public static void main(String[] args) {
		Test test=new Test();
		int x=test.returnTest();
		System.out.println("다음에 반환한다"+x+"을");
	}
}
