package workspace1;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.print("점수를 입력하세요 : ");
		int Score = in.nextInt();
		
		if (Score >= 90)
			grade="A";
		else {
			if(Score >= 80)
				grade="B";
			else {
				if(Score >= 70)
					grade="C";
				else {
					if(Score >= 60)
						grade = "D";
					else
						grade = "F";
				}
			}
		}
		System.out.println("당신의 학점은" + grade);
	}
}
