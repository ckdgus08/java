package sub01;
/*
 * ��¥ : 2019/06/05
 * �̸� : ��â��
 * ���� : ������ �迭 �ǽ��ϱ� ���� p149 
 */
public class MultiArrayTest {
	
	public static void main(String[] args) {
		
		//1���� �迭
		int[] score = {80,90,78,65,89};
		
		int sum = 0;
		
		for (int i=0; i<score.length ; i++) { 
			sum+=score[i];
		}
		 
		System.out.println("������ �� : "+sum);
		
		// �迭 �ݺ���
		int [] math = {60,72,78,82,96};
		int total=0;
		
		for(int m : math) {
			total += m;
		}
		
		System.out.println("�������� �� : "+total);
		
		// 2���� �迭
		int[][] arr2d = {{1,2,3}, 
						 {4,5,6}, 
						 {7,8,9},
						 {10,11,12}};
		
		for (int a=0;a<4;a++) {
			for(int b=0;b<3;b++) {
				System.out.println("arr2d["+a+"]["+b+"] : "+arr2d[a][b]);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
