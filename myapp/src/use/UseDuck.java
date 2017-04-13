/*
나와는 다른 위치에 존재하는 class를 사용해본다.
주의~ 자바는 클래스 위치를 알기위해
classpath만을 쳐다본다.

*/


package use;
import animal.bird.Duck;

class UseDuck{
	public static void main(String[] args){
		Duck d=new Duck();
	}
}