package chap2;

public class Phone {
	String model;
	int value;

	public static void main(String[] args) {
		System.out.println(value + " 만원 짜리 " + model + " 스마트폰");

	}

}

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 s8";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
	}
}