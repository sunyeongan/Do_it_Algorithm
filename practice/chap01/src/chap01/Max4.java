package chap01;


public class Max4 {
	// 네 값의 최댓값을 구하는 메서드 작성 
	
	public static int max4(int a, int b, int c, int d) {
		
		
		int max = a;
		
		if(max < b)
			max = b;
		if(max < c)
			max = c;
		if(max < d)
			max = d;
		
		return max;
	}

	public static void main(String[] args) {
		
		System.out.println("max4(4,3,2,1) = " +  max4(4,3,2,1));
		System.out.println("max4(1,2,3,4) = " +  max4(1,2,3,4));
		System.out.println("max4(1,4,3,2) = " +  max4(1,4,3,2));
		
		
		

	}

}
