package sub01;
/*
 * ��¥ : 2019/06/05
 * �̸� : ��â��
 * ���� : �迭 �ǽ��ϱ� ���� p149
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		// ���� ������ ������ ����
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		// �迭�� ������ ����
		int num[] = {1,2,3,4,5};
		
		// �迭 ����
		
		System.out.println("num[0] : " +num[0]);
		System.out.println("num[1] : " +num[1]);
		System.out.println("num[2] : " +num[2]);
		System.out.println("num[3] : " +num[3]);
		System.out.println("num[4] : " +num[4]);
		
		int i =0;
		
		while(i<5) {
			System.out.println("num["+i+"] : " +num[i]);
			i++;
		}
		
		//�迭 ����
		
		String ps1 = "������";
		String ps2 = "������";
		String ps3 = "�庸��";
		String ps4 = "������";
		String ps5 = "�̼���";
		
		String[] ps = {"������","������","�庸��","������","�̼���"};
		for(int q=0 ; q<ps.length ; q++) {
			System.out.println("ps["+q+"] : "+ps[q]);
		}
		
	}
}
