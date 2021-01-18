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
		
		System.out.print("a를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		System.out.print("b를 입력하세요 : ");
		input2 = scan.nextInt();
		
		System.out.print("정수 a 부터 b까지의 합은 " + sumof(input,input2) + "입니다 ");
		
	}

}
