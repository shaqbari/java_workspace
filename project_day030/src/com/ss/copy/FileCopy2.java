/*예외처리의 목적
=비정상 종료의 방지(즉 안정적인 시스템 운영을 목적)

일반적으로 프로그램이 정상 수행될 수 없는 상황을 가리켜 "에러"라 한다.
sun에서는 에러에 대한 나름 분류하여 클래스를 지원하고 있다.

1. 프로그래머가 대체할 수 없는 불가항력적 에러=Error
	
2. 프로그래머가 대처할 수 있는 에러=Exception(예외)
	자바언어의 관심사항은 바로 예외이다.
	sun에서는 이 예외를 상황에 따라 체계적인 클래스로 지원하고 있다.
	
	이 예외 객체들은 다시 크게 2가지 유형으로 분류된다.
		1) 컴파일 타임에 예외처리를 강요하는 경우=Checked Exception
		2) 컴파일 타임에 예외처리를 강요하지 않는 경우=Unchecked Exception(Runtime Exception) 

우선 컴파일러가 예외처리를 하라고 할때만 예외처리를 하면 된다. 
*/

package com.ss.copy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopy2{
	FileInputStream fis;	//파일을 대상으로 한 입력스트림
	FileOutputStream fos; //파일을 대상으로한 출력스트림

	public FileCopy2(){
		//아래의 코드는 장차, 에러가 발생할 수 있는 가능성이 있는 코드이다.
		//따라서 개발자가 문법을 잘 작성했음에도 불구하고, 특별한 안전장치를 마련하기를 강요한다.
		try{
			fis=new FileInputStream("D:/google/쌍용교육센터/java_workspace2/project_day030/src/com/ss/res/jeju01.jpg");
			//System.out.println("파일스트림에 성공했습니다.");
			
			fos=new FileOutputStream("D:/google/쌍용교육센터/java_workspace2/project_day030/src/com/ss/data/jeju01_copy.jpg");
			//빈파일을 만들어 준다.

			int data;
			/*
			data=fis.read(); //1byte를 읽어들임!
			System.out.println(data);//빨때가 꽂힌 상태에서 갑자기 파일이 없어지거나 수정 될 수 있다.
			data=fis.read(); //다음 1byte를 읽어들임
			System.out.println(data);
			*/
			
			while(true){
				data=fis.read(); //1byte를 읽어들임
				fos.write(data); //1byte 쓰기!

				if(data==-1)break; //한줄이면 이렇게 작성가능
				//위코드 다음에 write를 써야 한다. 안그러면 마지막에 -1이 들어가 데이터 망가질수도 있다.

				System.out.println(data);
			}
		}catch(FileNotFoundException e){ //에러가 발생하면 실행부가 이 영역으로 진입된다. 
			//catch문을 수행하면 프로그램이 비정상종료가 되지 않고 정상수행을 하게 된다.
			//사용자에게 안내하는 용도로 주로 catch문을 사용하게 된다.
			System.out.println("파일을 찾을 수 없습니다.");

			//심각한 오류인 경우 관리자에 이메일 전송하는 기능을 추가할 수도 있다.			
		}catch(IOException e){
			System.out.println("파일을 읽을 수 없습니다.");
		}finally{//모든 업무가 끝나는 시점
			//finally를 선언하면, try문을 수행하던 실행부가 무조건 이 영역을 거쳐서 간다.
			//finally코드의 사용목적
			/*주로 db연동과 스트림 사용시
			성공여부를 떠나서 무조건 자원을 닫거나 마무리 하려면 try문이던 catch문을 
			수행하던 무조건 거쳐야 하는 영역을 두기 위함이다.*/			
			try{
				if(fis!=null && fos!=null){
					fis.close();
					fos.close();
				}
			}catch(IOException e){
				System.out.println("파일을 읽을 수 없습니다.");
			}
		}
		
		
		//Stream을 쓰고나서는 파일과 연결된 stream을 제거해야한다.
		//안하면 계속 stream이 늘어나 메모리 누수현상이 일어난다.
		/*아래처럼 따로 빼지 않고 finally를 이용한다.
		try{
			if(fis!=null){
				fis.close(); //인풋스트림 연결 해제!
				//fFileNotFoundException발생하면 fis는 메모리에 올라가지 않기 때문에
				//nullpointExeption발생하므로 유효성체크후 실행해야함
			}
			if(fos!=null){
				fos.close();//아웃풋 스트림 연갤 해제!
			}
		}catch(IOException e){
			System.out.println("파일을 읽을 수 없습니다.");
		}
		*/
	}

	/*과제: 저번의 메모장 디자인에 파일 열기기능과 파일 쓰기 기능추가
	열기기능 탐색기 창뜨고 원하는 파일 누르면 데이터 쓸수 있게
	일요일 밤전까지 제출
	*/

	public static void main(String[] args){
		new FileCopy2();
	}
}
