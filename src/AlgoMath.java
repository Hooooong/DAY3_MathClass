import java.util.Random;

public class AlgoMath {
	
	public void testMath() {
		//Math math = new Math();
		//The constructor Math() is not visible -> 클래스 자체가  static 으로 생성되어 있기 때문에 new 연산자를 쓰지 않는다.
		
		/*
		 * 절대값 구하는 메소드
		 * Math.ads(정수(int));
		 * RETURN : int
		 */
		int a = Math.abs(-123);
		
		/*
		 * 반올림 구하는 메소드 
		 * Math.round(실수(float));
		 * RETURN : long
		 */
		long b = Math.round(123.4);
		
		/*
		 * 올림 구하는 메소드
		 * Math.ceil(실수(double));
		 * RETURN : long;
		 */
		double d = Math.ceil(3123.1414);
		
		/*
		 * 내림을 구하는 메소드
		 * Math.floor(123.4);
		 * RETURN : double
		 */
		double e = Math.floor(123.45);
		
		
		/*
		 * 0.0 부터 0.9 까지의 랜덤한 실수를 구하는 메소드
		 */
		Math.random();
		
		Random random = new Random();
		
		/*
		 * 0부터 99 까지 랜덤한 숫자를 구하는 메소드 
		 */
		random.nextInt(100);
		/*
		 * 1부터 100까지 랜덤한 숫자를 구하는 메소드
		 */
		int f = random.nextInt(100) + 1;
	}
}
