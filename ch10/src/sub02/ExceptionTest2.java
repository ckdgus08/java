package sub02;
/*
 * ��¥ : 2019/06/14
 * �̸� : ��â��
 * ���� : ���� ���� �ǽ��ϱ� p433
 */
public class ExceptionTest2 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2 , 3 , 4 , 5};
		try {
	
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			} 
		
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		// Null Point ����
		try {
			
	
		Eagle eagle = new Eagle();
		Tiger tiger = null;
		
		eagle.move();
		tiger.move();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		// Ŀ���� ����
		
		try {
			
		Animal ani = new Tiger(); // ��ĳ����
		Tiger tiger = (Tiger) ani;  // �ٿ�ĳ����
		Eagle eagle = (Eagle) ani;	// �ٿ�ĳ����
		
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("���α׷� ����");
	}
	
	
}
