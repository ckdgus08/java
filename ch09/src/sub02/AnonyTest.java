package sub02;
/*
 * ��¥ : 2019/06/14
 * �̸� : ��â��
 * ���� : �͸�ü �ǽ��ϱ� p404
 */
public class AnonyTest {

	public static void main(String[] args) {
		
		//�͸�ü - �������̽��� Ŭ���� ���� ���� new �������� ������ ���� 
		
		Person p = new Person() {
			
			@Override
			public void info() {
				System.out.println("Person info ����....");
			}
			
			@Override
			public void hello() {
				System.out.println("�ȳ��ϼ���.");

			}
		};
		
		p.hello();
		p.info();
		
		
	}
	
}
