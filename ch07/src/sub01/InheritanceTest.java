package sub01;

/*
 * ��¥ : 2019/06/11
 * �̸� : ��â��
 * ���� : Ŭ���� ��� �ǽ��ϱ� p288
 */
public class InheritanceTest {
	
	public static void main(String[] args) {
		
		SmartPhone gallaxy = new SmartPhone("A10", "8GB", "128GB", "������10", "010-1234-", 6.5, 100000) ;
		SmartPhone iphone = new SmartPhone("2.3GHZ", "4GB", "512GB", "������7", "010-5678-", 5.5, 130000) ;

		gallaxy.internet();
		gallaxy.call();
		gallaxy.calc();
		gallaxy.info();
		
		iphone.internet();
		iphone.call();
		iphone.calc();
		iphone.info();
		
		
		
		
		
	}

}
