package sub02;
/*
 * ��¥ : 2019/06/17
 * �̸� : ��â��
 * ���� : String Ŭ���� �ǽ��ϱ� ���� p496
 */
public class StringTest {

	public static void main(String[] args) {
		
		// ���ڿ�= ���� + �迭
		String str = "Hello";
		
		// ����  + �迭 
		char[] c = {'H','e','l','l','o'};
		
		// ���ڿ� ����
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "Hello";
		
		// ���ڿ� ������ ��
		if(str1 == str2) {
			System.out.println("str1�� str2 ��������(�ּҰ�) ����.");
		} else {
			System.out.println("str1�� str2 ��������(�ּҰ�) �ٸ���");
		}
		
		if(str2 == str4) {
			System.out.println("str2�� str4 ��������(�ּҰ�) ����.");
		} else {
			System.out.println("str2�� str4 ��������(�ּҰ�) �ٸ���");
		}
		
		// ���ڿ� �� 
		if(str1.equals(str2)) {
			System.out.println("str1�� str2 ���ڿ��� ����.");
		} else {
			System.out.println("str1�� str2 ���ڿ��� �ٸ���.");

		}
		
		
	}
}
