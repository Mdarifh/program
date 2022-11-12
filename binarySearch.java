 package firstProgram;

public class binarySearch {
	static int binarySearch(int[] a, int key){
		 
		int l=0, h = a.length-1,mid=0;
		while(l<=h) 
		{
			mid = (l+h)/2;
			if(key==a[mid])
			{
				return mid;
			}
			else if(key<a[mid])
			{
				h=mid-1;
			}
			else 
			{
				l=mid+1;
			}
			return -1;
		}
	
		
   }
	
	
	public static void main(String[] args) {
		int [] a = {3,4,5,23,45,67,22,45};
		//Arrays.sort(a);
		int key =45;
		System.out.println(binarySearch(a,key));
		// TODO Auto-generated method stub

	}

}
