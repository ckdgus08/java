package sub02;
/*
 * ��¥ : 2019/06/12
 * �̸� : ��â��
 * ���� : Ŭ���� ��� �ǽ��ϱ� p288
 */
public class InheritTest {

	public static void main(String[] args) {
		
		SalaryStudent std1 = new SalaryStudent("������", 21,"�ΰ��","��ǻ��","�Ｚ");
		SalaryStudent std2 = new SalaryStudent("������", 20,"�漺��","������","LG");
		
		std1.hello();
		System.out.println();
		std2.hello();
	}
}
