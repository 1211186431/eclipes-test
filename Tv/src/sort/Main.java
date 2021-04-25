package sort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SorterSystem sorterSystem=new SorterSystem();
        MySort bubbleSort=new Bubble();
        MySort heapSort=new Heap();
        MySort mergeMySort=new Merge();
        MySort quickSort=new Quick();
        int[] nums = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 10 };
        int[] nums2 = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 10 };
        int[] nums3 = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 10 };
        int[] nums4 = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 10 };
        sorterSystem.setArr(nums);
        sorterSystem.setMySort(mergeMySort);
        sorterSystem.sort();
        System.out.println();
        
        sorterSystem.setArr(nums2);
        sorterSystem.setMySort(bubbleSort);
        sorterSystem.sort();
        System.out.println();
        
        sorterSystem.setArr(nums3);
        sorterSystem.setMySort(heapSort);
        sorterSystem.sort();
        System.out.println();
        
        sorterSystem.setArr(nums4);
        sorterSystem.setMySort(quickSort);
        sorterSystem.sort();
        System.out.println();
	}

}
