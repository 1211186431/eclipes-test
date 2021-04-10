package sort;

public class SorterSystem {
    private MySort mySort;
    private int[] arr;
	public MySort getMySort() {
		return mySort;
	}

	public void setMySort(MySort mySort) {
		this.mySort = mySort;
	}
	
	public void sort() {
		this.mySort.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
    
}
