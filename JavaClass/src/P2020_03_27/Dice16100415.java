package P2020_03_27;

public class Dice16100415 {

	public static void main(String[] args) {
		boolean temp = true;
		while (temp) {
			// temp ���� ������ true�� ������ ���� �� ����, false�� ������ ����.

			int user = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("1~6���� �ֻ��� ���� �Է��ϼ���."));
			// user �� ��ȭ���ڷ� �Է¹ޱ�
			while (!(user >= 1 && user <= 6)) {
				user = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("1~6���� �ֻ��� ���� �ٽ� �Է��ϼ���."));
				// �Է� ���� ���� 1~6 ������ �ƴҰ�� �� �Է¹ޱ�
			}
			
			int random = 7;
			while (random == 7) {
				random = (int) (Math.random() * 6 + 1);
				// ���� ���� - 1~6 ���̸� �����ؾ� ������ 6�� ������ Ȯ���� �ſ� �����Ƿ� 1~6������ Ȯ���� ����ϰ� ���ֱ� ����
				// 1~7���� ������ 7�� ���ð�� �ٽ� ������ �������ش�.
			}

			temp = compare(random, user);
			// ��ǻ��, ������� ���� ���ϴ� �Լ� + �ݺ����θ� ���� true or false�� ��ȯ
		}

	}

	public static boolean compare(int random, int user) {

		if (random > user) {
			// ��ǻ�� ���� �� Ŭ ���
			System.out.println("��ǻ�� : " +random + " ����� : "+user+" => " +"��ǻ�� �¸�!");
		} else if (user > random) {
			// ����� ���� �� Ŭ ���
			System.out.println("��ǻ�� : " +random + " ����� : "+user+" => " +"����� �¸�!");
		} else {
			System.out.println("��ǻ�� : " +random + " ����� : "+user+" => " +"���º�!");
			// ��ǻ��, ����� ���� ���� ���
		}

		String repeat = javax.swing.JOptionPane.showInputDialog("������ �ٽ� �Ϸ��� yes�� �Է����ּ���.");
		// �� ���� ���� ����
		if (repeat.equalsIgnoreCase("yes")) {
			// ����ڰ� Yes,yes,YES���� �Է��� �� ���ɼ��� �ֱ⿡ ��ҹ��ڸ� ������ �ʴ� IgnoreCase�� ���ڿ��� �����ش�.
			// (���ڿ� �񱳽� == �����ڸ� ����ϸ� ���ϴ� ����� ���� �� ����.)
			return true;
			// �� ����
		} else {
			// yes�� �Է����� �ʾ��� ���
			return false;
			// �� �������� ����
		}

	}
}
