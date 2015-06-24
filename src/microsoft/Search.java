package microsoft;

public class Search {
	public static int binarySearch(int[] arr, int target) {
		int start = 0, end = arr.length - 1;
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if(arr[mid] >= target){
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
		}
		return start;
	}
	public static void main(String[] args){
		int[] arr = {3,6,78,90};
		System.out.println(binarySearch(arr, 6));
		int[] arr2 = {3,6,6,6,6,78,90};
		System.out.println(binarySearch(arr2, 6));
	}
}
