package class11Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class SetTreeExamples {
	public static HashSet<Integer> fromFile(String fn) throws
	FileNotFoundException {
		// return a set of all integers from the file
			HashSet<Integer> numberSet = new HashSet<Integer>();
			Scanner fileScan = new Scanner(new File(fn));
			while(fileScan.hasNextInt())
			{
			     numberSet.add(fileScan.nextInt());
			}
			if(fileScan != null) 
			{
				fileScan.close();
			}
			return numberSet;
	}
	public static HashSet<Integer> getCommon(HashSet<Integer>h1,
			HashSet<Integer>h2) {
		// return numbers that are in both of HashSets
		HashSet<Integer> finalHs = new HashSet<Integer>();
		/*Integer[] h1Arr = h1.toArray(new Integer[h1.size()]);
		Integer[] h2Arr = h2.toArray(new Integer[h2.size()]);
		Arrays.sort(h1Arr);
		Arrays.sort(h2Arr);
		for(int i=0;i<h1Arr.length;i++) {
			for(int j=0;j<h2Arr.length;j++) {
				if(h1Arr[i] == h2Arr[j])
				{
					finalHs.add(h1Arr[i]);
				}
			}
		}
		return finalHs;
		*/
		for(int x: h2) {
			if(h1.contains(x))
			{
				finalHs.add(x);
			}
		}
		return finalHs;
	}
	public static HashSet<Integer> getAll(HashSet<Integer>h1, HashSet<Integer>h2) {
		// return numbers from any of the HashSets
		HashSet<Integer> finalHs = new HashSet<Integer>();
		for(int x: h1) {
				finalHs.add(x);
		}
		for(int x: h2) {
			finalHs.add(x);
	}
		return finalHs;
	}
	//return(result);
	
	//sort in descending order
	public static Vector<Integer> getSorted(HashSet<Integer> hs) {
		//return a vector with values from the set arranged in ascending order
		Vector<Integer> result= new Vector<Integer>();
		//enter the code here
		Integer[] hsArr = hs.toArray(new Integer[hs.size()]);
		Arrays.sort(hsArr);
		for(int i=0;i<hsArr.length;i++) {
			result.add(hsArr[i]);
		}
		return result;
	}
	public static Vector<Integer> getWeirdSort(HashSet<Integer> hs) {
		/*
		 * All prime numbers must stand before other numbers
		 * Within groups of prime and non-prime number
		 * use the ascending order
		 */
		Vector<Integer> result= new Vector<Integer>();
		Vector<Integer> notP= new Vector<Integer>();
		//enter the code here
		for(Integer nr: hs) {
			if(isPrime(nr))
			{
				result.add(nr);
			}
			else
			{
				notP.add(nr);
			}
		}
		Collections.sort(notP);
		for(Integer nr: notP) {
			result.add(nr);
		}
		return result;
	}
	public static boolean isPrime(Integer n) {
		if(n<2)
	    {
	        return false;
	    }
		for(int i=2; i*i<=n; i++)
	    {
	        if(n%i==0)
	        {
	        	return false;
	        }
	    }
		return true;
	}
	public static void showHashSet (HashSet<Integer> hs, int colNo) {
		//enter the code here, colNo stands for the column number in a line
		//do not forget about the last line
		//enter the code here
		int col = 0;
		for(Integer nr: hs) {
			col++;
			System.out.println(nr);
			if(col == colNo)
			{
				System.out.println();
			}
		}
	}
	/*
	 * the key: the number of digits in a number
	 * the value: a vector of all numbers with that length without
duplicates
	 */
	public static TreeMap<Integer, Vector<Integer>>
	createTreeMap(HashSet<Integer> data) {
		TreeMap<Integer, Vector<Integer>> result=new
				TreeMap<Integer, Vector<Integer>>();
		// enter the code here
		return result;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashSet<Integer> h1= fromFile("src\\class11Package\\numbers1.txt");
		HashSet<Integer> h2= fromFile("src\\class11Package\\numbers2.txt");
		HashSet<Integer> hw= getCommon(h1, h2);
		System.out.println("Common elements from h1, h2: \n"+getCommon(h1, h2)+"\n");
		System.out.println("All elements from h1, h2: \n"+getAll(h1, h2)+"\n");
		System.out.println("getSorted (elements from h1): \n"+getSorted(h1)+"\n");
		System.out.println("getWeirdSort (elements from h1): \n"+getWeirdSort(h1)+"\n");
		
		// test for all methods here e.g. getCommon(h1, h2);
	}
}