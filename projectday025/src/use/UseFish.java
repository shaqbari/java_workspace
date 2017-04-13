/*물고기들을 써보자*/
package use;
import animal.fish.Fish;
import animal.fish.Nimo;

class UseFish{
	public static void main(String[] args){
		Fish f1 = new Fish("삼치");
		//f1.swim();

		Nimo n1=new Nimo();
		System.out.println(f1.equals(n1)); //equals메소드는 Fish에서 정의하지 않았지만 모든 객체는 Object 클래스를 상속받기 때문에 사용가능하다.
		Object obj=f1; //가능하다. //생선을 저거로 표현한것과 유사

		//System.out.println(super.name);//불가능 main에서는 super를 쓸수 없다 main자신의 super를 가리키게 되는것이다.. 인스턴스내에서 super와 this가 가능하다.
		n1.swim();
		
		//형변환 해보자!! 같은 자료형끼리 가능하다
		//Fish와 Nimo는 같은 자료형이다. .
		//f1=n1; //가능 상위클래스가 큰 자료형이다
		//n1=f1; //불가능
		//n1=(Nimo)f1;  //가능
		//System.out.println(f1.name);
	}
}
