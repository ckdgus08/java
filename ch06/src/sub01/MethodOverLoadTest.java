package sub01;
/*
 * ��¥ : 2019/06/07
 * �̸� : ��â��
 * ���� : �޼��� �����ε� �ǽ��ϱ� ���� p230
 */
public class MethodOverLoadTest {

	public static void main(String[] args) {
		
		overload();
		overload(true);
		overload("ȫ�浿");
		overload(1, 4);
		overload(7);
	}
	
	public static void overload() {
		System.out.println("1��° �����ε� �ż���...");
		
	}
	public static void overload(int i) {
		System.out.println("2��° �����ε� �ż���...");

	}
	public static void overload(int a, int b) {
		System.out.println("3��° �����ε� �ż���...");

	}
	public static void overload(String name) {
		System.out.println("4��° �����ε� �ż���...");

	}
	public static void overload(boolean ok) {
		System.out.println("5��° �����ε� �ż���...");

	}
}
