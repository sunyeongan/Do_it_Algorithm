package chap01;
import java.util.Scanner;

//1,2,...n�� ���� ���մϴ�(����� �Է��ϵ���)
public class SumForPos {
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.println("n�� �� : ");
			n = scan.nextInt();
			
		}while(n<=0); // n�� 0���� Ŭ������ �ݺ� 
		
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			sum+=i;
		}
		
		System.out.println("1���� "+ n + "������ ���� " + sum + "�Դϴ�");

	}

}
