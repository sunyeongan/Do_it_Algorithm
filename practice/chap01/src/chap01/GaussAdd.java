package chap01;
import java.util.Scanner;

//���콺 ������ �̿��� 1+2..n������ ���� ���Ͻÿ� 

public class GaussAdd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("n �� �� : ");
		int n = scan.nextInt();
		
		int gsum = 0;
		
		gsum = (1+n)*5;
		
		System.out.print("1���� " + n + "������ ���� : " + gsum);
		
		
	}

}
