import java.util.Random;

public class AlgoMath {
	
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
}
