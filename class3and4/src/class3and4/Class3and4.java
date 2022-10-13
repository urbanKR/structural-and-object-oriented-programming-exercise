package class3and4;
import java.util.Scanner; 

public class Class3and4 {

	public static boolean isAscending(int[] arr) {
		if(arr.length < 1)
		{
			System.out.print("Array is empty!");
			return false;
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>=arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
	public static void showMax(int[][] arr) {
		if(arr.length < 1) 
		{
            System.out.println("The array is empty!");
		}
		else
		{
			int max = arr[0][0];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j] > max)
					{
						max = arr[i][j];
					}
				}
			}
			System.out.print(max);
		}
	}
	
	public static double getAverageValue(int [][] arr) {
		if(arr.length < 1) 
		{
            System.out.println("The array is empty!");
            return 0;
		}
		double count = 0;
		double N = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				count += arr[i][j];
				N++;
			}
		}
		if(N!=0)
		{
			return count/N;
		}
		return 0;
	}
	
	public static int longestRow(int [][] arr) {
		if(arr.length < 1)
		{
			System.out.print("Array is empty!");
			return 0;
		}
		int count = 0;
		int maxCount = 0;
		int maxRow = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				count++;
			}
			if(count>maxCount)
			{
				maxCount = count;
				maxRow = i;
			}
			count = 0;
		}
		return maxRow;
	}
	
	static int[][] createArr(int n) {
		int arr[][] = new int [n][];
		int x = 1;
		for(int i=0;i<n;i++) {
			arr[i] = new int[x];
			x++;
		}
		return arr;
	}
	
	static void fillArr(int [][] data) {
		int x = 0;
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				data[i][j] = x;
				x++;
			}
		}
	}
	
	static void printTwoDim(int [][] data) {
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.println(data[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	static void readAndSkip(int [][] data) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) { 
				String input = sc.next();
				try
				{
					data[i][j] = Integer.parseInt(input);
				}
				catch(NumberFormatException e)
				{
					data[i][j] = -1;
				}
			}
		}
		sc.close();
	}
	
	static int[] flattenArr(int [][] data) {
		int k = 0;
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				k++;
			}
		}
		int arr[] = new int[k];
		k = 0;
		for(int m=0;m<data.length;m++) {
			for(int n=0;n<data[m].length;n++) {
				arr[k] = data[m][n];
				k++;
			}
		}
		return arr;
	}
	
	static void printOneDim(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\n");
		}
	}
	
	public static void main(String[] args) {
		int oneDim[] = {1, 2, 3, 87};
		int twoDim[][] = {{1, 4, 7}, {7, 127}, {3, 15, 19, 22, 5}};
		//int twoDim2[][] = {{1}, {7, 7}, {3, 4, 5}};
		/*System.out.print(isAscending(oneDim)+"\n");
		showMax(twoDim);
		System.out.print("\n"+getAverageValue(twoDim)+"\n");
		System.out.print(longestRow(twoDim)+"\n");
		createArr(3);
		//fillArr(twoDim2);
		flattenArr(twoDim);
		//printOneDim(flattenArr(twoDim));
		readAndSkip(twoDim);
		printTwoDim(twoDim);*/
		System.out.println("ooooo \nlooooooodofdo");
		
		
	}

}
