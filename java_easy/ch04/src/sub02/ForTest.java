package sub02;
/*
 * ��¥ : 2019/06/04
 * �̸� : ��â��
 * ���� : for�� �ǽ��ϱ� ���� p119
 */
public class ForTest {

	public static void main(String[] args) {
		
		
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		System.out.println("d");
		
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("��\n");
		
		
		
		
		
		System.out.println("hello Java~");
		
		// for
		
		for(int i=1 ; i<=3 ; i++) { 
			System.out.println("hello Java!");
		}

		// 1���� 10���� ��
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			sum += k ;
		}
			System.out.println("1���� 10���� �� : "+sum);
			
			// 1���� 10 ���� ¦�� ��
			int tot = 0;
			for(int k=1; k<=10 ; k++) {
				if(k%2 == 1) {
					tot+= k ;
				}
			}
			System.out.println("1���� 10���� ¦���� : "+tot);
			
			// ��ø for�� 
			for(int a=1 ; a<= 3 ; a++) {
			System.out.println("a : "+a);	
				for(int b=1; b<=5 ;b++) {
					System.out.println("b : "+b);
				}
			}
			
			
			//������ ���
			
			for(int a=2; a<=9; a++) {
				
				System.out.println(a+"�� ���");
				for(int b=1; b<=9; b++) {
					
					int c = a * b ;
					System.out.println(a+"x"+b+"="+c);
					
					
				}
			}
			
			//�� �ﰢ�� ���
			
			for(int start=10; start>=1;start--) {
				for(int end=1;end<=start;end++) {
					System.out.print("��");
				}
				System.out.print("\n");
			}
			
			
			
			
			
			
	}
}
