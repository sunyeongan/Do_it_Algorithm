package chap01;
import java.util.Scanner;

// �� ���� a,b�� ������ �Է��ϰ� b-a�� ����ϴ� ���α׷� 
// �� ���� b�� �Է��� ���� a�����̸� ���� b�� ���� �ٽ� �Է� 

public class BeforeJudgeLoop {

	public static void main(String[] args) {
		int input, input2;
		int result = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("a�� ���� �Է��ϼ��� : ");
		
		input = scan.nextInt();
		
		
		System.out.print("b�� ���� �Է��ϼ��� : ");
		input2 = scan.nextInt();
		
		if(input>input2) {
			
			System.out.print("b�� ���� �ٽ� �Է��ϼ��� : ");
			input2 = scan.nextInt();
			
		}
		
		result = input2-input;
		System.out.println("b-a : " + result);
		

	}

}
