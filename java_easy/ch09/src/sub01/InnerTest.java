package sub01;

import sub01.Outer.Inner;

/*
 * ��¥ : 2019/06/14
 * �̸� : ��â��
 * ���� : ��øŬ���� �ǽ��ϱ� p390
 */
public class InnerTest {

	public static void main(String[] args) {
		
		Outer out = new Outer(1);
		out.info();
		
		Inner inn = out.new Inner(2);
		inn.info();
	}
}
