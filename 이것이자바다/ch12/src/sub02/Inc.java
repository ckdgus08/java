package sub02;

public class Inc {

	private int num;
	
	// synchronized  ����ȭ ���������� �����尣�� ������ ���´�.
	public synchronized void setNum() {
		
		num++;
		
	}
	
	public int getNum() {
		return num;
	}
}
