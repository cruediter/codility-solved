package swe;

public class CyclicRotation {

	public static void main(String[] args) {

		int[] A = {}; // max 100, min 0
		int K = 3; // max 100, min 0
		
		System.out.println(solution(A, K).toString());
	
		
	}
	
	
	public static int[] solution(int[] A, int K) {

		// Init 
		int N = A.length;
		
		// Pre-Condition
		if(N == 0  || (K % N) == 0) {
			return A;
		}
		
		// Logic 
		int[] result = new int[N];
		for (int i = 0; i < N; i++) {
			result[i] = A[(i + N - K%N) % N];
		}
		
		return result; 
	}

}
