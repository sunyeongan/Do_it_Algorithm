package chap01;
import java.util.Scanner;

// �Է��� �������� ������� �������� 0���� �Ǵ��մϴ�.

public class JudgeSign {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int a = scan.nextInt();
		
		if(a>0)
			System.out.println("�� ���� ����Դϴ�");
		else if(a<0)
			System.out.println("�� ���� �����Դϴ�.");
		else
			System.out.println("�� ���� 0 �Դϴ�");
				
				
				
				
				
				
				
				

	}

}
