package swe;

public class FrogRiverOne {

	public static void main(String[] args) {

		
		int X = 5;
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		
		System.out.println(solution(X, A));
		
		
	}
	
	public static int solution(int X, int[] A) {

		int[] countArray = new int[X+1];
		int result = 0;
		
		// init
		for(int i = 1; i < countArray.length; i++) {
			countArray[i] = -1;
		}
		
		for(int i = 0; i < A.length; i++) {
			if(countArray[A[i]] == -1 || countArray[A[i]] >= i) {
				countArray[A[i]] = i;
			}
		}
		
		for(int i = 1; i < countArray.length; i++) {
			if(countArray[i] < 0) {
				result = -1;
				break;
			}else if(result < countArray[i]){
				result = countArray[i];
			}
		}
		
		return result;
	}

}
