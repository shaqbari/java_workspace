package music;

class UsePlayer{
	public static void main(String[] args){
		new MP3player(); //가능 
		//new MusicPlyaer(); 불완전한 클래스는 절대 new로 생성할 수 없다.
		//sub클래스가 강제된 구현을 완료하면 인스턴스 생성할때 자동으로 먼저 올라간다.
		/*new할 수는 없지만, 자식이 생성될 때, 부모의 인스턴스 먼저 생성되는
		원칙에 따라 메모리에 올라가게 되어있다.*/
	}
}
