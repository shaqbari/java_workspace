/*어떤 사원이 만들게 될 mp3player*/

package music;

/*상속시 부모가 불완전한 추상클래스일 경우
 완전하게 코드를 완성할 의무는 자식에게 주어진다.*/
public class MP3Player extends MusicPlayer implements Jet{
							//   is a                          is a
/*다중상속을 금지하고 있는 java에서 이미 MusicPlyer는 상속을 받고 있기 때문에
다른 추상클래스를 상속받을수 없다.
대신 다른 클래스의 메소드만 따온다.(interface) implements*/

	//이퀄라이저를 이용한 시각화 기능
	public void equalizer(){
		System.out.println("오르락내리락");
	}

	//부모가 완성 못한 메소드를 여기서 완성한다!
	public void playMP3(){
		System.out.println("mp3 플레이중...");
	}
	//추상클래스는 subclass의 구현을 강제한다.

	public void setVolume(){
	
	}

	public void fly(){
	
	}
}
