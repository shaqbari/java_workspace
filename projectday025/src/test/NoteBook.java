/*�Ʒ��� �������� Ŭ������ �ۼ��Ͻÿ�
1. ���ϴ� ��� �����Ͽ� Ŭ����ȭ ��Ŵ
2. ������� 2��
3. ��� �޼ҵ� 2��
*/

package test;
public class NoteBook{
	String name="�� ��Ʈ��";
	int price=1000000;

	public void setPrice(int price){
		this.price=price;
	}

	/*�Ʒ��Ͱ��� �ּ��� �տ� ���� �ΰ� ������ javadoc���� �����ϴ� �����api������ �޼ҵ忡 ���� ������ �Էµȴ�.*/

	/** price���� ������ �޼ҵ带 ������ ���̿���*/
	public int getPrice(){
		return this.price;
	}
}
