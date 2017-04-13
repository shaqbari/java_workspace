package use;

class MainTest{
	public void test(){
	
	
	}

	//메인 메소드는 시스템이 호출하므로, 즉 java.exe실행시 호출하므로
	//개발자가 호출할 수 없다.
	//실행시 java MainTest 오리, 사과, 감자 라고쓰면
	//main함수의 인자로 오리 사과 감자가 전달된다.
	public static void main(String[] args){
		int leng=args.length;
		System.out.println(args[0]);
		System.out.println("당신이 넘긴 배열의 길이는 "+leng);

		/*integer는 wraper객체
		integer의 parseInt메소드는 static으로 정의되어
		class메소드이므로	바로 접근 가능
		인수로 넘긴 문자열을 실제 정수화 시켜 반환
		
		//실행시 입력값을 받아 구구단 출력
		int dan=Integer.parseInt(args[0]);		
		for(int i=1; i<=9; i++){
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		*/

		/*
			mario.jpg와 같이 파일정보를 인수로 넣으면
			그 분석 결과를 보여주기
			파일명은 mario
			확장자는 jpg
		*/
		//특수문자 특정역할을 하는 경우가 많으므로
		//역슬래시 두개\\(익스케이프)를붙여야 문자로 인식한다.		
		String[] arr=args[0].split("\\."); //mario, jpg
		System.out.println(arr[0]);
		System.out.println(arr[1]);		
	
		System.out.println("파일명은"+arr[0]+"이고, 확장자는"+arr[1]+"입니다.");
		

		

	}
}
