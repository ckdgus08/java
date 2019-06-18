package sub02;
/*
 * ��¥ : 2019/06/18
 * �̸� : ��â��
 * ���� : IncreamentThread �ǽ��ϱ� ���� p576
 */
public class InctThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		Inc inc = new Inc();
		
		CountThread c1 = new CountThread(inc);
		CountThread c2 = new CountThread(inc);
		CountThread c3 = new CountThread(inc);
		
		c1.start();
		c2.start();
		c3.start();
		
		// �ش� ���꾲���尡 ���ξ������ �շ��Ǳ���� ���ξ����尡 ���.
		c1.join();
		c2.join();
		c3.join();
		
		System.out.println("������� : "+inc.getNum());
	}
}
