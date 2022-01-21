package swe;

public class MinAbsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {7, 1, 1, 7};
		
		System.out.println(solution(A));
	}

	private static int solution(int[] A) {

		int N = A.length;
		
		if(N == 0) {
			return 0;
		}

		int[] countA = new int[101];
		
		for(int i = 0; i < N; i++){
			if(A[i] < 0) A[i] *= -1; 
			countA[A[i]]++; 
		}
		
		int result = 0;
		int temp = 0; 
		for(int i = 100; i > 0; i--) {
			if(result > 0) { 
				temp = result - (countA[i] * i);
				if(temp < 0) { 
					temp *= -1; 
					temp %= i;
				} 
				result = temp; 
			}else {
				result = (countA[i]%2)*i;
			}
		} 
		
		return result;
	}

}
