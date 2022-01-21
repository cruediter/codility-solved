package swe;

public class binaryGap {

	public static void main(String[] args) {

		int N = 32;
		
		System.out.println(solution(N));
		
	}
	
	
	public static int solution(int N) { 
        int result = 0;
        int checker = 1<<30;
        int count = 0;

        while(checker > N) {
        	checker = checker >> 1;
        }
        
        for(int i = checker; i > 0; i=i>>1){  
            if((i & N) == i){  // 1이면
            	if(result < count){
                    result = count;
                }
            	count = 0; 
            } else { // 0 이다
                count++;
            }   
        }
        return result;
    }

}
