/*� ����� ����� �� mp3player*/

package music;

/*��ӽ� �θ� �ҿ����� �߻�Ŭ������ ���
 �����ϰ� �ڵ带 �ϼ��� �ǹ��� �ڽĿ��� �־�����.*/
public class MP3Player extends MusicPlayer implements Jet{
							//   is a                          is a
/*���߻���� �����ϰ� �ִ� java���� �̹� MusicPlyer�� ����� �ް� �ֱ� ������
�ٸ� �߻�Ŭ������ ��ӹ����� ����.
��� �ٸ� Ŭ������ �޼ҵ常 ���´�.(interface) implements*/

	//������������ �̿��� �ð�ȭ ���
	public void equalizer(){
		System.out.println("������������");
	}

	//�θ� �ϼ� ���� �޼ҵ带 ���⼭ �ϼ��Ѵ�!
	public void playMP3(){
		System.out.println("mp3 �÷�����...");
	}
	//�߻�Ŭ������ subclass�� ������ �����Ѵ�.

	public void setVolume(){
	
	}

	public void fly(){
	
	}
}
