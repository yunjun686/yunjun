package workspace1;

public class While2Demo {

	public static void main(String[] args) {
		int row =2;
		while(row < 10) {
			int colum = 1;
			while (colum < 10) {
				System.out.print("%4d", row + colum);
				colum++;
			}
			System.out.println();
			row ++;
		}
	}
}
