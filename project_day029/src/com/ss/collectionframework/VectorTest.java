/*
 * 컬렉션 프레임웍 api객체중 list계열의 하위객체인 Vector를 학습해보자
 * List계열은 우리가 흔히 써왔던 배열과 거의 같다
 *                배열:                            list
 * 크기:  크기반드시 명시                선택사항, 유연함
 * 대상:	자바기본자료형+객체형		오직 객체형
 * */

package com.ss.collectionframework;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//컬렉션 프레임웍 객체에 Generic Type을 명시하면, 객체가 섞이는 것을 컴파일 타임에 방지해준다. 간장통의 마시지 마시오 라벨!
		Vector<String> v=new Vector<String>(); 
		//String전용 Vector가된다. 라벨역할! 라벨과 한몸인 자료형으로 생각하면 쉽다. 해당자료형으로 형변환할 필요가 없다.
		//generic은 객체자료형에만 적용된다.
		
		v.add("사과");
		v.add("딸기");
		//v.add(new JButton("나버튼")); //가능하지만 실행하면서  형변환 할때 에러발생할 확률 매우 높다.
		v.add("바나나");
		v.add("오렌지");
		
		//Object obj=v.get(2);
		//System.out.println(obj.toString());
		
		String obj=(String)v.get(2); //generic을 안쓴다면 형변환을 이용하는것이 fm이다. 
		System.out.println(obj); 
	
		for (int i = 0; i < v.size(); i++) {
			String obj2=v.get(i); //generic을 쓰면 해당자료형으로 형변환할 필요가 없다.
		}
		//컬렉션 프레임워크를 쓸때는 꼭 generic을 써주자. 
	}

}
