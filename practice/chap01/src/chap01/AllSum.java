package chap01;
import java.util.Scanner;

public class AllSum {
	
	public static int sumof(int a, int b) {
		int sum = 0;
		
		for(int i = a; i<=b; i++) {
			
			sum +=i;
			
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		int input, input2;
		
		System.out.print("a�� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		System.out.print("b�� �Է��ϼ��� : ");
		input2 = scan.nextInt();
		
		System.out.print("���� a ���� b������ ���� " + sumof(input,input2) + "�Դϴ� ");
		
	}

}
