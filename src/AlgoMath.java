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
		//The constructor Math() is not visible -> Ŭ���� ��ü��  static ���� �����Ǿ� �ֱ� ������ new �����ڸ� ���� �ʴ´�.
		
		/*
		 * ���밪 ���ϴ� �޼ҵ�
		 * Math.ads(����(int));
		 * RETURN : int
		 */
		int a = Math.abs(-123);
		
		/*
		 * �ݿø� ���ϴ� �޼ҵ� 
		 * Math.round(�Ǽ�(float));
		 * RETURN : long
		 */
		long b = Math.round(123.4);
		
		/*
		 * �ø� ���ϴ� �޼ҵ�
		 * Math.ceil(�Ǽ�(double));
		 * RETURN : long;
		 */
		double d = Math.ceil(3123.1414);
		
		/*
		 * ������ ���ϴ� �޼ҵ�
		 * Math.floor(123.4);
		 * RETURN : double
		 */
		double e = Math.floor(123.45);
		
		
		/*
		 * 0.0 ���� 0.9 ������ ������ �Ǽ��� ���ϴ� �޼ҵ�
		 */
		Math.random();
		
		Random random = new Random();
		
		/*
		 * 0���� 99 ���� ������ ���ڸ� ���ϴ� �޼ҵ� 
		 */
		random.nextInt(100);
		/*
		 * 1���� 100���� ������ ���ڸ� ���ϴ� �޼ҵ�
		 */
		int f = random.nextInt(100) + 1;
	}
	
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
