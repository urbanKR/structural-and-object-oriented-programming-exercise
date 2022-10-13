package class10Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class VectorSort {
	protected Vector<String> words = new Vector<String>();
	// enter all words from input file in the words Vector
	public VectorSort(String fileName) throws FileNotFoundException {
		try {
			Scanner sc = new Scanner(new File(fileName));
			Pattern pt = Pattern.compile("[A-z]+");
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				Matcher mt = pt.matcher(line);
				if(mt.find()) 
				{
					words.add(line);
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void showWords(int cnt) {
		// print cnt first elements of the words Vector
		// enter your code here
		for(int i=0; i<cnt; i++) {
			System.out.println(words.get(i));
		}
	}
	// Sort the words vector. The sort order:
	// descending word length, words with the same length
	// in the case insensitive order
	public abstract void sortWordsComplex();
	// Sort the words vector. The sort order:
	// descending word length
	public abstract void sortWordsSimple();
}