package chap01;
import java.util.Scanner;

//���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷� �ۼ�
//������� 135 �Է��ϸ� '�� ���� 3�ڸ� �Դϴ�.'��� ����ϱ� 

public class NumberOfDigits {

	public static void main(String[] args) {
		int input;
		int digit = 1000;
		int cnt = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		input = scan.nextInt();
		
		while(input!= 0) {
			
			input = input/10;
			cnt ++;
			
		}
		
		System.out.print("�� ���� �ڸ�����  " + cnt + "�Դϴ�");
		
		
		

	}

}
