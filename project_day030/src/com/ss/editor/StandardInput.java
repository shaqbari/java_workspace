/*1.스트림의 방향서에 따른 분류
 * -입력 출력
 * 
 * 2. 스트림의 데이터 처리방법에 따른 분류
 *  1) 바이트 기반 스트림: 입출력시 1byte씩 처리 (빨대)
 *  2) 문자 기반 스트림: 입출력시 2byte씩 묶어서 이해할 수 있는 스트림 (업그레이드 빨때, 3d안경처럼 1byte를 2byte로 이해)
 *  		주의!!)2byte씩 읽거나, 쓰는게 아니다. 원래는 byte기반
 *  		문자기반스트림의 명명규칙
 *  		입력스트림: ~~Reader끝남
 *  		출력스트림: ~~writer끝남
 *  
 *  3) 버퍼 스트림
 *  
 */


package com.ss.editor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StandardInput {

	public static void main(String[] args) {
		//스트림 얻기	
		InputStream is=System.in; //System에서 미리 얻어놔서 new를 쓰지 않는다.
		InputStreamReader reader=null;		
		reader=new InputStreamReader(is);
		
		int data;
		try {			
			//while (true) {
				data = reader.read();  //block
				System.out.print((char)data); //한글은 2byte이므로 일부만 출력되어 깨진다.
			//}				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * System.in;//표준입력
	 * System.out;//표준출력
	 * */
	
	//콘솔로그창에 키보드로부터 입력받은 문자를 메모장에 저장하는거 추가해서 txt로 저장//그냥 쉬어

}
