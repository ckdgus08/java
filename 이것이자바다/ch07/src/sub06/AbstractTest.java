package sub06;

/*
 * ��¥ : 2019/06/13
 * �̸� : ��â��
 * ���� : �߻� Ŭ���� �ǽ��ϱ� ���� p329
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		//�߻�Ŭ������ ��ü ���� �ȵ�.
		//Unit unit = new Unit();
		
		Unit unit1 = new Marin();
		Unit unit2 = new Zealot();
		Unit unit3 = new Zergling();
		
		unit1.move();
		unit1.attack();
		
		unit2.move();
		unit2.attack();
	
		unit3.move();
		unit3.attack();
		
	}
}
