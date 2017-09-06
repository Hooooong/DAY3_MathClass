import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class AlgoMath {
	
	public static void main(String[] args) {
		AlgoMath algoMath = new AlgoMath();
		int lottoNumber[] = algoMath.getLottoNumber();
		
		for(int number : lottoNumber) {
			System.out.print(number + "\t");
		}
		System.out.println();
		
		double e = Math.floor(123.45);
		System.out.println(e);
	
	}
	
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
	
	/**
	 * Lotto 번호 구하는 메소드
	 * 
	 * @return
	 */
	public int[] getLottoNumber() {
		int[] result =  new int[6];
		Random random = new Random();
		
		for(int i = 0; i<result.length; i++) {
			result[i] = random.nextInt(45)+1;
			
			/*
			 * 주의사항 : random 은 중복된 값이 나올 수 있기 때문에 예외처리 해야 한다.
			 */
			for(int j = 0 ; j<i; j++) {
				if(result[i] == result[j]) {
					i --;
					break;
				}
			}
		}
		return result;
	}
	
	/**
	 * Lotto 번호를 List 와 Set 을 사용하여 출력
	 * 
	 * @return
	 */
	public List<Integer> getListLottoNumber(){
		List<Integer> result = new ArrayList<>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		Random random = new Random();
		
		
		// 동적 배열 - 크기를 제안하지 안흔ㄴ 객체 배열
		// 종류 : List, Set, Map
		// List => 인덱스와 값을 가지고 있는 배열
		// Set => List 와 유사한데 중복값이 입력되지 않는다.
		// Map => 키와 값을 가지고 있는 동적 배열, 값의 중복이 허용된다.
		
		for(;6 > treeSet.size();) {
			// Set은 중복된 값이 들어가지 않기 때문에 6개까지는 자동으로 들어간다.
			treeSet.add(random.nextInt(45) + 1);
		}
		
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			result.add(iterator.next());
		}
		
		return result;
	}

}
