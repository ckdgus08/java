package sub03;
/*
 * ��¥ : 2019/06/13
 * �̸� : ��â��
 * ���� : �������̽� �ǽ��ϱ� p344
 */
public class InterfaceTest3 {

	public static void main(String[] args) {
		
		// �������̽� �ǽ� 3 - ��ü�� ���յ��� ��ȭ 
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
	}
}
