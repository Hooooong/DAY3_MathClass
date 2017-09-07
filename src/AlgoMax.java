/**
 * 1~Max 까지 총 합, 홀수 합, 짝수 합을 구하는 클래스
 * 
 * @author Android Hong
 *
 */
public class AlgoMax {
	
	/**
	 * 1부터 max 까지의 합을 구하는 메소드
	 * 
	 * @param max : 범위
	 * @return
	 */
	public long sum(long max) {
		// 1~max 까지 더하는 작성하세요.
		
		long sum = 0;
		/*
		for(int i = 1; i<= max; i=i+1) {
			sum = sum + i;
		}
		*/
		
		/**
		 * 총 합 구하는 공식
		 * 
		 * 
		 * 1	2	3	4	5	6	7	8	9	10
		 * 10	9	8	7	6	5	4	3	2	1
		 * ----------------------------------------
		 * 11	11	11	11	11	11	11	11	11	11
		 * 
		 * 총 합 구하는 공식은
		 * (max + max*2) /2 이다.
		 */
		sum = ((1 + max) * max) / 2; 
		
		return sum;
	}
	
	/**
	 * 1부터 max까지의  홀수 합을 구하는 메소드
	 * @param max : 범위
	 * @return
	 */
	public long evenSum(long max) {
		long sum = 0;
		long count = max/2 + max%2;
		
		/**
		 * 홀수 구하는 공식
		 * 
		 * 5 일때
		 * 1 + 3 + 5 = 9
 		 * 
 		 * 7 일때
 		 * 1 + 3 + 5 + 7 = 16
		 * 
		 * 9 일때
		 * 1 + 3 + 5 + 7 + 9 = 25
		 * 
		 * 홀수의 합을 구하는 공식은
		 * max 의 홀수 count*count 이다.
		 * 
		 */
		sum = count*count;
		
		return sum;
	}
	
	/**
	 * 1부터 max 까지의 짝수 합을 구하는 메소드
	 * @param max : 범위
	 * @return
	 */
	public long oddSum(long max) {
		long sum = 0;
		long count = max/2;
		
		/**
		 * 짝수 구하는 공식
		 * 
		 * 6 일때
		 * 2 + 4 + 6 = 12
		 * ex) 3*4
		 * 8 일때
		 * 2 + 4 + 6 + 8 = 20
		 * ex) 4*5
		 * 
		 * 10 일때
		 * 2 + 4 + 6 + 8 + 10 = 30
		 * ex)5*6
		 * 
		 * 짝수의 합을 구하는 공식은
		 * max의 짝수 count*(count+1) 이다.
		 * 
		 */
		sum = count * (1 + count);
		return sum;
	}
	
}
