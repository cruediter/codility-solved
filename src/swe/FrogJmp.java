package swe;

public class FrogJmp {

	public static void main(String[] args) {

		int X = 10;
		int Y = 85;
		int D = 30;
		
		System.out.println(solution(X, Y, D));
	}

	public static int solution(int X, int Y, int D) { 
        int result = 0;
        
        // Init
        Y = Y - X;
        
        // logic
        result = Y/D;
        if (Y % D != 0) {
        	result++;
        }
        
        return result;
    }
	
}
