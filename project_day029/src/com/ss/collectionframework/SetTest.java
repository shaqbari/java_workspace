/*컬렉션 프레임웍의 유형 2가지 중
 * 순서없는 객체들의 집합인 Set유형을 알아보자
 * */

package com.ss.collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// Set의 자식들중 TreeSet을 사용해 본다. set는 중복된 자료가 불가능하며 순서가 없다.
		TreeSet<String> set = new TreeSet<String>();

		set.add("사과");
		set.add("딸기");
		set.add("오렌지");

		/*
		 * String[] str = new String[set.size()]; set.toArray(str);
		 * 
		 * for (int i = 0; i < str.length; i++) { String msg = str[i];
		 * System.out.println(msg);
		 	}
		 */
		/*
		 * 컬렉션 프레임웍의 객체 중 순서없는 객체를 사용하다 보면, 대량의 처리시 반복문을직접 사용할 수 없다는 어려움에 부딪친다
		 * 해결책) 순서 없는 것을--> 순서있게 만들자(대롱) Enumeration(옛날), Iterator(최신)
		 */
		
		//iterator는 인터페이스이므로 new가 안되고 자식을 만들어 사용해야 하나
		//sun사에서는 자식을 사용하지 않고도 사용할 수 있는 방법을 만들어 두었다.
		//이경우 TreeSet의 iterator()메소드를 이용해 Iterator형의 자료형으로 반환하는 것이다.
		Iterator<String> it = set.iterator(); // 자료형을 명시해야 형변환을 안해도된다.
		/*
		String e1 = it.next(); // 다음요소에 접근
		String e2 = it.next(); // 다음요소에 접근
		String e3 = it.next(); // 다음요소에 접근
		// String e4=it.next(); //다음요소에 접근 없기 때문에 에러
		*/
		/*
		 * if (it.hasNext==true) {
		 * 	 	for(){
		 * 		}
		 *  }
		 */

		/*
		 * 반복문에는 for, while문이 있다.
		 *  for문은 시작과 끝값을 수치로 알고 있을때 유용하다.
		 *  While문은 소괄호안이  true일 동안 동작한다. 
		 *  반복할 숫자를 모르거나 변할때 유용하다.
		 * 
		 *  int=0;
		 *  while(){
		 *  	 i++;
		 *  	 if(i>=256){
		 *  		 break;
		 *  	 }
		 *   }
		 * 
		 */

		while (it.hasNext()) {
			String e = it.next();// 다음 요소에 접근
			System.out.println(e);
		}

		Iterator<String> it2 = set.iterator();
		while (it2.hasNext()) {
			String e = it2.next();// 다음 요소에 접근
			System.out.println(e);
		}
	}
}
