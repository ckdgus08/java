package sub04;

public class Increment {

	// ������� (ĸ��ȭ)
	private int num1;
	// Ŭ���� ����, ���� ����
	public static int num2;
	
	public Increment( ) {
		this.num1++;
		this.num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	// Ŭ���� �޼���, ���� �޼���
	public static void add( ) {
		// static �޼��忡���� none static ������ ���� �� �� ����.
		//num1++;    
		num2++;
	}
}
