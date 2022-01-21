package swe;

public class PermMissingElem {

	public static void main(String[] args) {
		int[] A = {2, 3, 1, 5};
		
		System.out.println(solution(A));
	}
	
	private static int solution(int[] A) {

		// init
		int result = 0;
		boolean[] test = new boolean[A.length + 2];
	
		//logic
		for(int i : A) {
			test[i] = true;
		}
		
		for(int i = 1; i < test.length; i++) {
			if(!test[i]) {
				result = i;
				break;
			}
		}
		
		return result;
	}

}
