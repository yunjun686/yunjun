package chap3;

public class Student {
	String name;
	int kor,eng,math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal() {
		return (kor + eng + math);
	}
	public double getAverage() {
		return ( getTotal() / 3);
	}
	public void printInfo() {
		System.out.printf("%s 총점은 %d 평균은 %f\n", name, getTotal(), getAverage());
	}

}
