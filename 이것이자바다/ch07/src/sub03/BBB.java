package sub03;

public final class BBB extends AAA {

	@Override  //������̼�
	public void md1() {
		System.out.println("BBB - md1()");
	}
	
	//Overloading method
	public final void md2(int a) {
		System.out.println("BBB - md2()");   // fianl �޼���� �ڽ�Ŭ�������� override �� �� ����.
	}
	
}
