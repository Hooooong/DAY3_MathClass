import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class AlgoLotto {

	/**
	 * Lotto ��ȣ ���ϴ� �޼ҵ�
	 * 
	 * @return
	 */
	public int[] getLottoNumber() {
		int[] result =  new int[6];
		Random random = new Random();
		
		for(int i = 0; i<result.length; i++) {
			result[i] = random.nextInt(45)+1;
			
			/*
			 * ���ǻ��� : random �� �ߺ��� ���� ���� �� �ֱ� ������ ����ó�� �ؾ� �Ѵ�.
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
	 * Lotto ��ȣ�� List �� Set �� ����Ͽ� ���
	 * 
	 * @return
	 */
	public List<Integer> getListLottoNumber(){
		List<Integer> result = new ArrayList<>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		Random random = new Random();
		
		
		// ���� �迭 - ũ�⸦ �������� ���礤 ��ü �迭
		// ���� : List, Set, Map
		// List => �ε����� ���� ������ �ִ� �迭
		// Set => List �� �����ѵ� �ߺ����� �Էµ��� �ʴ´�.
		// Map => Ű�� ���� ������ �ִ� ���� �迭, ���� �ߺ��� ���ȴ�.
		
		for(;6 > treeSet.size();) {
			// Set�� �ߺ��� ���� ���� �ʱ� ������ 6�������� �ڵ����� ����.
			treeSet.add(random.nextInt(45) + 1);
		}
		
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			result.add(iterator.next());
		}
		
		return result;
	}
}
