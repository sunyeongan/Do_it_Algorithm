package chap01;
import java.util.Scanner;

// 두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램 
// 단 변수 b에 입력한 값이 a이하이면 변수 b의 값을 다시 입력 

public class BeforeJudgeLoop {

	public static void main(String[] args) {
		int input, input2;
		int result = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("a의 값을 입력하세요 : ");
		
		input = scan.nextInt();
		
		
		System.out.print("b의 값을 입력하세요 : ");
		input2 = scan.nextInt();
		
		if(input>input2) {
			
			System.out.print("b의 값을 다시 입력하세요 : ");
			input2 = scan.nextInt();
			
		}
		
		result = input2-input;
		System.out.println("b-a : " + result);
		

	}

}
