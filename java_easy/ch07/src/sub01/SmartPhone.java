package sub01;

public class SmartPhone extends Computer {

	private String brand;
	private String tel;
	private double size;
	private int price;
	
	public SmartPhone(String cpu,
					  String ram, 
					  String hdd,
					  String brand,
					  String tel,
					  double size,
					  int price)
	{
		super(cpu, ram, hdd);  // �θ� Ŭ���� ������ ����
		this.brand = brand;
		this.tel = tel;
		this.size = size;
		this.price = price;
		
	}
	
	public void call() {
		System.out.println(tel+"��ȣ�� ��ȭ �Ŵ� ��... ");
		
	}
	public void info() {
		System.out.println("------------------");
		super.info();
		System.out.println("��ǰ�� : "+brand);
		System.out.println("��ȭ��ȣ : "+tel);
		System.out.println("ȭ��ũ�� : "+size);
		System.out.println("���� : "+price);
		System.out.println("------------------");

	}
}
