package firstProgram;

public class BinerySearch {
	static int  BinerySearch(int[] a, int key) {
		int mid = 0, high = a.length-1, low = 0;
		while(low<=high) {
			mid = (low+high)/2;
			if(key==a[mid]) {
				return mid;
				
			}
			else if(key<a[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] a = {3,5,6,8,9,12,14,16,18};
		int key = 16;
		System.out.println(BinerySearch(a,key));

	}

}
