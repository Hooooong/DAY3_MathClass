import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class AlgoLotto {

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
