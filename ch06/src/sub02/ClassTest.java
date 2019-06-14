package sub02;
/*
 * ��¥ : 2019/06/07
 * �̸� : ��â��
 * ���� : Ŭ���� �ǽ��ϱ� ���� p191
 */
public class ClassTest {
	
	public static void main(String[] args) {
		
		// ��ü ����
		Account kb = new Account("��������", "123-12-1234", "������", 10000);
		
		kb.deposit(10000);
		kb.withdraw(7000);
		
		//private money �ܺ����� �ȵ�.
		//kb.money -= 1;
		
		kb.info();
		
		Account sh = new Account("��������", "121-11-2312", "������", 50000);

		sh.deposit(5000);
		sh.withdraw(9000);
		sh.info();
		
		// samsung ��ǻ�� ��ü ���� Intel i7, 16GB , 1TB
		// apple ��ǻ�� ��ü ���� Intel i5, 8GB , 512GB
		
		Computer samsung = new Computer("Intel i7","16GB","1TB");
		samsung.calc();
		samsung.internet();
		samsung.info();
		
		Computer apple = new Computer("Intel i5", "8GB", "512GB");
		apple.internet();
		apple.calc();
		apple.info();
		
	}

}
