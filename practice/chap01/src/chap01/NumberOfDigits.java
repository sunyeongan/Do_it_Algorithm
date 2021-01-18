package chap01;
import java.util.Scanner;

//양의 정수를 입력하고 자릿수를 출력하는 프로그램 작성
//예를들어 135 입력하면 '그 수는 3자리 입니다.'라고 출력하기 

public class NumberOfDigits {

	public static void main(String[] args) {
		int input;
		int digit = 1000;
		int cnt = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		input = scan.nextInt();
		
		while(input!= 0) {
			
			input = input/10;
			cnt ++;
			
		}
		
		System.out.print("그 수의 자릿수는  " + cnt + "입니다");
		
		
		

	}

}
