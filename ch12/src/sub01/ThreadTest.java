package sub01;
/*
 * ��¥ : 2019/06/18
 * �̸� : ��â��
 * ���� : Thread �ǽ��ϱ� ���� p576
 */
public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("sub1");
		SubThread sub2 = new SubThread("sub2");

		sub1.start();
		sub2.start();
		
		for(int i=1 ; i<=10 ; i++ ) {
			
			Thread.sleep(1000);
			
			System.out.println("main ������ ����...");
			
		}
		
		System.out.println("maim ������ ����...");
		
	}

}
