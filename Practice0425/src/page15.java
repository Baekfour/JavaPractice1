
public class page15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_iA, k17_iB;  // k17_iA �� k17_iB�� ���������� �����Ͽ� �־���.
		
		k17_iA = 0;  // ���� k17_iA�� 0���� �ʱ�ȭ�Ͽ���.
		while(true) { //while���� ����Ͽ� �ݺ����� ����Ͽ���.
			
			k17_iB = 0; // while�ȿ� ���� k17_iB�� 0���� �ʱ�ȭ�Ͽ� while���ȿ��� �����Ҷ� 0���� �����ϵ��� �Ͽ���.
			while(true) { // while�� �ȿ� while���� ����Ͽ� �������� �ݺ����� ���ư� �� �ֵ��� �Ͽ���.
				System.out.printf("*"); // "*"�� ����ϵ��� �Ͽ���
				
				if(k17_iA == k17_iB) break; // k17_iA�� k17_iB�� ���� ���϶� break�� ����Ͽ� while���� ������������ �����Ͽ���
				k17_iB++; // while�� �ȿ��� k17_iB�� 1�� �����ϵ��� �����Ͽ���.
			}
			System.out.printf("\n"); // k17_iA�� k17_iB�� �������� ������ while���� ���������� �Ǹ� ������ �ǵ��� ó���Ͽ���.
			k17_iA++; // ������ ������ �Ǹ� k17_iA�� 1�� �����ϵ��� ó���Ͽ���.
			if(k17_iA == 30) break; // 17_iA�� 1�� �����Ͽ� 30�� �Ǿ����� break�� ����Ͽ� ù while���� ������������ ó���Ͽ���.
		}							// �ᱹ 17_iA�� 0�϶� *�� �ϳ� ��µǰ� 17_iB�� 0���� �����Ƿ� ����ó���� �ȴ� 
									// �� ���� k17_iA�� 1�̹Ƿ� k17_iB�� 0���� 1���� �ι� ���ƾ� k17_iA�� k17_iB�� �������Ƿ� "*"�� �ι� ��Եȴ�
									// �׷��� i�� 30�϶����� 31������ ����� �ǰ� "*"�� ��� ������ 1���� �þ ���������� "*"�� 31�� ��µǰ�
	} 								// while���� �������ȴ�

}