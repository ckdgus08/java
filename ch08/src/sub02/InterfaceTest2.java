package sub02;
/*
 * ��¥ : 2019/06/13
 * �̸� : ��â��
 * ���� : �������̽� �ǽ��ϱ� p344
 */
public class InterfaceTest2 {
	
	public static void main(String[] args) {
		
		// �������̽� �ǽ� 2 - ���� ����� ��Ȱ
		SmartTV stv = new SmartTV();
		stv.internet();
		stv.booting();
		stv.powerOff();
		stv.powerOn();
		stv.syncAndroid();
	}

}
