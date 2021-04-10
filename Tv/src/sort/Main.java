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
        sorterSystem.setArr(nums);
        sorterSystem.setMySort(mergeMySort);
        sorterSystem.sort();
        System.out.println();
        
        sorterSystem.setMySort(bubbleSort);
        sorterSystem.sort();
        System.out.println();
        
        sorterSystem.setMySort(heapSort);
        sorterSystem.sort();
        System.out.println();
        
        sorterSystem.setMySort(quickSort);
        sorterSystem.sort();
        System.out.println();
	}

}
