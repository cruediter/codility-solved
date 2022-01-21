package swe;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] A = {-1000,1000};
		
		System.out.println(solution(A));
	}

	private static int solution(int[] A) {

		// init
		int result = Integer.MAX_VALUE;
		int N = A.length;
		
		// pre calc
		int[] sum = new int[N];
		sum[0] = A[0]; 
		for(int i = 1; i < N; i++) {
			sum[i] = sum[i-1] + A[i];
		}
		
		// logic
		int p1, p2, difference ;
		for(int i = 0; i < N-1; i++) { 
			p1 = sum[i];
			p2 = sum[N-1] - sum[i];
			difference = (p1 - p2);
			if(difference < 0) difference *= -1;
			if(result > difference) result = difference;
		} 
		
		return result;
	}
}
