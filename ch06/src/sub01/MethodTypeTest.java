package sub01;
/*
 * ��¥ : 2019/06/07
 * �̸� : ��â��
 * ���� : �޼��� Ÿ�� �ǽ��ϱ� p214
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		
		// �޼��� ȣ��(����)
		int r1 = type1(2, 3);
		int r2 = type1(5, 7);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		
		int score1[] = {1,3,5,7,9};
		int score2[] = {2,4,6,8,10};
		type2(score1);
		type2(score2);
		
		double r3 = type3();
		System.out.println("r3 : "+r3);
		
		type4();
		
		// ������ �޼��� ����
		for(int q=2; q<=9; q++) {
			gugudan(q);
		}
		
		
	}
	
	public static void gugudan(int num1) { 
		for(int num2=1; num2<=9; num2++) {
			
		System.out.println(num1+"��  = "+num1+"*"+num2+" : "+num1*num2);
		}
	}
	
	
	
	//Ÿ��1 - �ŰԺ��� O , ���ϰ� O
	public static int type1(int x, int y) {
		int z = x * y;
		return z;		
		
	}
	
	//Ÿ��1 - �ŰԺ��� O , ���ϰ� X
	public static void type2(int[] score) {
		
		int sum = 0;
		
		for(int k=0; k < score.length ; k++) { 
			sum += score[k];
			
		}
		System.out.println("score �� :" +sum );
		
	}
	
	//Ÿ��1 - �ŰԺ��� X , ���ϰ� O
	public static double type3() {
		
		return 3.14;
		
		
		
	}
	
	//Ÿ��1 - �ŰԺ��� X , ���ϰ� X
	public static void type4() {
		
		int result = type1(3,4) ;
		System.out.println("type1(3,4) ���  : "+result);
		
		
	}
	
}
