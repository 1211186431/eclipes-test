package sort;

public class Heap implements MySort {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		// ����Ԫ�ص������Ǵ�0��ʼ��,�������һ����Ҷ�ӽ��array.length/2 - 1
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			adjustHeap(arr, i, arr.length); // ������
		}

		// �����߼������ѽ���
		// ���棬��ʼ�����߼�
		for (int j = arr.length - 1; j > 0; j--) {
			// Ԫ�ؽ���,������ȥ���󶥶�
			// �Ѵ󶥶ѵĸ�Ԫ�أ��ŵ��������󣻻��仰˵������ÿһ�εĶѵ���֮�󣬶�����һ��Ԫ�ص����Լ�������λ��
			swap(arr, 0, j);
			// Ԫ�ؽ���֮�󣬺������ʣ����һ��Ԫ�������ٿ������������ˡ�
			// ������������Ҫ����ģ������Ѿ�ȥ���˲���Ԫ�صĶ��ˣ���Ҳ��Ϊʲô�˷�������ѭ�����ԭ��
			// �����ʵ���������϶��£��������ҽ��е�����
			adjustHeap(arr, 0, j);
		}
	}

	/**
	 * ������������ؼ��ĵط�
	 * 
	 * @param array  �����
	 * @param i      ��ʼ���
	 * @param length �ѵĳ���
	 */
	private void adjustHeap(int[] array, int i, int length) {
		// �Ȱѵ�ǰԪ��ȡ��������Ϊ��ǰԪ�ؿ���Ҫһֱ�ƶ�
		int temp = array[i];
		for (int k = 2 * i + 1; k < length; k = 2 * k + 1) { // 2*i+1Ϊ������i��������(��Ϊi�Ǵ�0��ʼ��),2*k+1Ϊk��������
			// ��k��ָ���ӽڵ������Ľڵ�
			if (k + 1 < length && array[k] < array[k + 1]) { // �����������,��������������������
				k++;
			}
			// ������ֽ��(�����ӽ��)���ڸ���㣬�����ֵ�Ľ���
			if (array[k] > temp) {
				swap(array, i, k);
				// ����ӽڵ�����ˣ���ô�����ӽڵ�Ϊ�����������ܵ�Ӱ��,���ԣ�ѭ�����ӽڵ����ڵ������������ж�
				i = k;
			} else { // ���ý�����ֱ����ֹѭ��
				break;
			}
		}
	}

	/**
	 * ����Ԫ��
	 * 
	 * @param arr
	 * @param a   Ԫ�ص��±�
	 * @param b   Ԫ�ص��±�
	 */
	private void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
