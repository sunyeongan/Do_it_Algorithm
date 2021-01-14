package chap01;
import java.util.Scanner;

// 입력한 정수값이 양수인지 음수인지 0인지 판단합니다.

public class JudgeSign {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		if(a>0)
			System.out.println("이 수는 양수입니다");
		else if(a<0)
			System.out.println("이 수는 음수입니다.");
		else
			System.out.println("이 수는 0 입니다");
				
				
				
				
				
				
				
				

	}

}
