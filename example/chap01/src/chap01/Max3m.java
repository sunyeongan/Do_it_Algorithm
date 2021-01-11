package chap01;

public class Max3m {
	
	public static int max3(int a, int b, int c) {
		
		int max = a;
		
		if(max < b)
			max = b;
		if(max < c)
			max = c;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("max3(3,2,1) = " + max3(3,2,1)); //a>b>c
		System.out.println("max3(3,2,2) = " + max3(3,2,2)); //a>b=c
		System.out.println("max3(1,2,3) = " + max3(1,2,3)); //a<b<c

	}

}
