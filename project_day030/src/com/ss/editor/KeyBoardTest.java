/*사실 파일, 키보드와 관련된 stream은 개발자가 만드는 것이 아니라
 * os가 만들어두고 우리는 거기에 얹혀있는 것이다
 * 그러므로 키보드의 경우 시스템으로부터 얻어오기만 하면 된다.
 *  */

package com.ss.editor;

import java.io.IOException;
import java.io.InputStream;

public class KeyBoardTest {
	
	public static void main(String[] args) {
		/*키보드는 개발자가 원할 때 생성할 수 있는 스트림이 아니라, 이미 시스템에서
		 * 컴퓨터 켤때 얻어두기 때문에, 개발자는 이미 존재하는 스트림을 얻어와 사용만
		 * 하면 된다. 자바에서는 os로 부터 스트림을 이미 얻어와서 System 클래스의
		 * 멤버변수인 in변수에 받아놓았다.
		 * 
		 * 자바는 하드웨어를 직접 제어하지 않고 또한 하드웨어 자체는
		 *  현 시스템을 운영하는 os가 제어하므로, 하드웨어에 대한 입력 스트림은
		 *  자바가 아닌 os가 이미 제어해놓고 있다.
		 *  따라서 자바 언어를 이용하여 키보드, 스캐너, 등등의 입력하드웨어의 값을
		 *  얻기 위해서는 각 하드웨어에 알맞는 스트림 클래스가 지원되는게 아니라,
		 *  오직 표준입력스트림인 inputStream을 쓰면 된다.
		 *
		 *

		엔터에는 '\n줄바꿈' '\r커서맨앞으로'라는 특수문자가 입력되는것이다.
		 * c언어의 스트림의 방향전환? 좀더 조사해보자.
		 * */
		
		
		
		InputStream is= System.in; //inputStream은 자바 stream의 최상위객체
		//윈도우에 의존적인 입력장비는 모두 System.in으로 받는다.
		int data;
		try {
			//read()메소드는 사용자의 입력이 있을때까지 블럭상태에 빠진다.
			//블럭상태란 대기상태를 말한다.
			//유저가 데이터입력시점을 결정하기 때문에 메모리를 올리기전 block상태가 있다.
			while(true){//여기서는 무한루프 돌려도된다 왜냐하면read때문에, 채팅이 이렇게 만들어진다.
				data=is.read(); //1byte읽기
				//System.out.print("룰루");
				System.out.print((char)data); //int형이면 특수문자까지 다나온다(enter13 carrige return10)
				//엔터에는 '\n줄바꿈' '\r커서맨앞으로'라는 특수문자가 입력되는것이다
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
