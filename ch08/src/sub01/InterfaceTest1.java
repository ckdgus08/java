package sub01;
/*
 * ��¥ : 2019/06/13
 * �̸� : ��â��
 * ���� : �������̽� �ǽ��ϱ� p344
 */
public class InterfaceTest1 {

	public static void main(String[] args) {
		
		//�������̽� �ǽ� 1 - Ŭ������ ǥ�� ���̵� ��Ȱ 
		
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.powerOff();
		lg.soundUp();
		
		samsung.powerOn();
		samsung.powerOff();
		samsung.soundUp();
		
		
		
		
		
		
	}
}
