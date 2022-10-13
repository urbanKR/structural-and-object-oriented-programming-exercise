package class5package;

public class Class5class {

	public static int getMaxValueI(int arr[], int pos) {
		if(arr.length < 1 || pos >= arr.length) 
		{
            return 0;
		}
		else
		{
			int max = arr[pos];
			for(int i=pos; i<arr.length; i++) {
					if(arr[i] > max)
					{
						max = arr[i];
					}
			}
			return max;
		}
	}
	public static int getMaxValueR(int arr[], int pos) {
		if(arr.length < 1 || pos >= arr.length) 
		{
            return 0;
		}
	    if(pos < arr.length) 
	    {
	        if(arr[pos] > getMaxValueR(arr, pos+1))
	        {
	        	return arr[pos];
	        }
	        else
	        {
	        	return getMaxValueR(arr, pos+1);
	        }
	    } 
	    else 
	    {
	        return arr[pos-1];
	    }
	}
	public static int getTotalI(int arr[], int pos) {
		if(arr.length < 1 || pos >= arr.length) 
		{
            return 0;
		}
		int sum = 0;
		for(int i=pos; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public static int getTotalR(int arr[], int pos) {
		if(arr.length < 1 || pos >= arr.length) 
		{
            return 0;
		}
		if(pos < arr.length)
		{
			return arr[pos] + getTotalR(arr, pos+1);
		}
		return 0;
	}
	public static int getTotalGrtI(int[] arr, int pos, int limit) {
		if(arr.length < 1 || pos >= arr.length) 
		{
            return 0;
		}
		int sum = 0;
		for(int i=pos; i<arr.length; i++) {
			if(arr[i] > limit)
			{
				sum = sum + arr[i];
			}
		}
		return sum;
	}
	public static int getTotalGrtR(int[] arr, int pos, int limit) {
		if(arr.length < 1 || pos >= arr.length) 
		{
            return 0;
		}
		if(pos < arr.length)
		{
			if(arr[pos] > limit)
			{
				return arr[pos] + getTotalGrtR(arr, pos+1, limit);
			}
			return getTotalGrtR(arr, pos+1, limit);
		}
		return 0;
	}
	public static void printNormalI(int [] arr, int pos) {
		if(arr.length < 1 || pos >= arr.length) 
		{
            System.out.println("Array length or position value is incorrect!");
		}
		for(int i=pos; i<arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
	}
	public static void printNormalR(int [] arr, int pos) {
		if(arr.length < 1 || pos >= arr.length) 
		{
            System.out.println("Array length or position value is incorrect!");
		}
		if(pos < arr.length)
		{
			System.out.println(arr[pos]+"\t");
			printNormalR(arr, pos+1);
		}
	}
	public static void printReverseI(int [] arr, int pos) {
		if(arr.length < 1 || pos >= arr.length) 
		{
            System.out.println("Array length or position value is incorrect!");
		}
		for(int i=arr.length-1; i>=pos; i--) {
			System.out.println(arr[i]+"\t");
		}
	}
//	public static void printReverseR(int [] arr, int pos) {
//		if(arr.length < 1 || pos >= arr.length) 
//		{
//            System.out.println("Array length or position value is incorrect!");
//		}
//		if(pos >= 0)
//		{
//			System.out.println(arr[pos]+"\t");
//			printReverseR(arr, pos-1);
//		}
//	}
	public static void printReverseR(int [] arr, int pos) {
		if(arr.length < 1 || pos >= arr.length) 
		{
            System.out.println("Array length or position value is incorrect!");
		}
		if(pos < arr.length)
		{
			printReverseR(arr, pos+1);
			System.out.println(arr[pos]+"\t");
		}
	}
	
	public static void main(String[] args) {
		int[] testArr = {9, 2, 7, 10, 60, 100};
//		System.out.println(getMaxValueR(testArr, 2));
//		System.out.println(getMaxValueR(testArr, 2));
//		System.out.println(getTotalI(testArr, 2));
//		System.out.println(getTotalR(testArr, 2));
//		System.out.println(getTotalGrtI(testArr, 2, 9));
//		System.out.println(getTotalGrtR(testArr, 2, 9));
//		printNormalI(testArr, 2);
//		printNormalR(testArr, 2);
//		printReverseI(testArr, 2);
//		printReverseR(testArr, 2);
	}

}