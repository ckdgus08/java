package sub03;
/*
 * ��¥ : 2019/06/10
 * �̸� : ��â��
 * ���� : Ŭ���� �ǽ��ϱ� 
 */
public class AddlerTest {

	public static void main(String[] args) {
		
		Addler ad = new Addler();
		ad.x =100;
		
		int[] arr = {1, 2, 3};
		
		ad.add(ad.x);
		System.out.println("ad.x = "+ad.x);
		
		ad.add(ad);
		System.out.println("ad.x = "+ad.x);
		
		ad.add(arr);
		System.out.println("arr[0] = "+arr[0]);
		
		Addler ad2 = ad.addNew(ad);
		
		System.out.println(ad2);
		System.out.println(ad);


		System.out.println("ad.x = "+ad.x);
		
		
	}
}
