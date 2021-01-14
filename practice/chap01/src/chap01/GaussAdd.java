package chap01;
import java.util.Scanner;

//가우스 덧셈을 이용해 1+2..n까지의 값을 구하시오 

public class GaussAdd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("n 의 값 : ");
		int n = scan.nextInt();
		
		int gsum = 0;
		
		gsum = (1+n)*5;
		
		System.out.print("1부터 " + n + "까지의 합은 : " + gsum);
		
		
	}

}
