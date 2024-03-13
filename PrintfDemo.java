package chap02;

public class PrintfDemo {
   public static void main(String[] args) {
	   int i = 97;
	   String s = "Java";
	   double f = 3.14f;
	   System.out.printf("%d\n", i);
	   System.out.printf("%o\n", i);
	   System.out.printf("%x\n", i);
	   System.out.printf("%c\n", i);
	   System.out.printf("%5d\n", i);
	   System.out.printf("%05d\n", i);
	   System.out.printf("%s\n", i);
	   System.out.printf("%5s\n", i);
	   System.out.printf("%x-5s\n", i);
	   System.out.printf("%f\n", i);
	   System.out.printf("%e\n", i);
	   System.out.printf("%4.1f\n", i);
	   System.out.printf("%04.1f\n", i);
	   System.out.printf("%-4.1f\n", i);
	}
}
