package sub02;

public class Computer {

	//Ư��(�ɹ�����)
	private String cpu;
	private String ram;
	private String hdd;
	
	//������
	public Computer(String cpu, String ram, String hdd) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		
	}
	
	//���(�ɹ��޼���)
	public void calc() {
		System.out.println("����� �մϴ�... ");
		
	}
	
	public void internet() {
		System.out.println("���ͳ��� �մϴ�... ");

		
	}
	
	public void info() {
		System.out.println("CPU : "+cpu);
		System.out.println("RAM : "+ram);
		System.out.println("HDD : "+hdd);
		
	}
	
}
