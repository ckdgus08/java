package sub03;
/*
 * ��¥ : 2019/06/12
 * �̸� : ��â��
 * ���� : �������̵� �޼��� �ǽ��ϱ� ���� p288
 */
public class OverrideTest {

	public static void main(String[] args) {
		
		BBB b = new BBB();
		
		b.md1();   // overriding 
		b.md2();   // overloading 
		b.md2(1);
		b.md3();
		
		//final �ǽ��ϱ�
		
		final int NUM = 1;  // final = ����    :  ����� ���� (���� �̸� �빮�ڷ� ǥ��)
							//       = �޼��� : �������̵� ����
							//       = Ŭ���� : ��� ����
		final double PI = 3.14;
		// num = 2 ;
	}
}
