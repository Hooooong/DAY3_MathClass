/**
 * 1~Max ���� �� ��, Ȧ�� ��, ¦�� ���� ���ϴ� Ŭ����
 * 
 * @author Android Hong
 *
 */
public class AlgoMax {
	
	/**
	 * 1���� max ������ ���� ���ϴ� �޼ҵ�
	 * 
	 * @param max : ����
	 * @return
	 */
	public long sum(long max) {
		// 1~max ���� ���ϴ� �ۼ��ϼ���.
		
		long sum = 0;
		/*
		for(int i = 1; i<= max; i=i+1) {
			sum = sum + i;
		}
		*/
		
		/**
		 * �� �� ���ϴ� ����
		 * 
		 * 
		 * 1	2	3	4	5	6	7	8	9	10
		 * 10	9	8	7	6	5	4	3	2	1
		 * ----------------------------------------
		 * 11	11	11	11	11	11	11	11	11	11
		 * 
		 * �� �� ���ϴ� ������
		 * (max + max*2) /2 �̴�.
		 */
		sum = ((1 + max) * max) / 2; 
		
		return sum;
	}
	
	/**
	 * 1���� max������  Ȧ�� ���� ���ϴ� �޼ҵ�
	 * @param max : ����
	 * @return
	 */
	public long evenSum(long max) {
		long sum = 0;
		long count = max/2 + max%2;
		
		/**
		 * Ȧ�� ���ϴ� ����
		 * 
		 * 5 �϶�
		 * 1 + 3 + 5 = 9
 		 * 
 		 * 7 �϶�
 		 * 1 + 3 + 5 + 7 = 16
		 * 
		 * 9 �϶�
		 * 1 + 3 + 5 + 7 + 9 = 25
		 * 
		 * Ȧ���� ���� ���ϴ� ������
		 * max �� Ȧ�� count*count �̴�.
		 * 
		 */
		sum = count*count;
		
		return sum;
	}
	
	/**
	 * 1���� max ������ ¦�� ���� ���ϴ� �޼ҵ�
	 * @param max : ����
	 * @return
	 */
	public long oddSum(long max) {
		long sum = 0;
		long count = max/2;
		
		/**
		 * ¦�� ���ϴ� ����
		 * 
		 * 6 �϶�
		 * 2 + 4 + 6 = 12
		 * ex) 3*4
		 * 8 �϶�
		 * 2 + 4 + 6 + 8 = 20
		 * ex) 4*5
		 * 
		 * 10 �϶�
		 * 2 + 4 + 6 + 8 + 10 = 30
		 * ex)5*6
		 * 
		 * ¦���� ���� ���ϴ� ������
		 * max�� ¦�� count*(count+1) �̴�.
		 * 
		 */
		sum = count * (1 + count);
		return sum;
	}
	
}
