package class10Package;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
public class LambdaSort extends VectorSort {
	public LambdaSort(String fileName) throws FileNotFoundException {
		// TODO enter your code here
		super(fileName);
	}
	@Override
	public void sortWordsComplex() {
		// use a lambda function to sort data
		// examples of complex lambda sorts are e.g.
		// on https://www.baeldung.com/java-8-sort-lambda
		// enter your code here
		words.stream().sorted().forEach(s->System.out.println(s));
		//Collections.sort(words,(a,b)->a.compareTo(b));
		//Collections.reverse(words);
		
		//words.sort(Comparator.comparingInt(String::length));
	}
	@Override
	public void sortWordsSimple() {
		// use a lambda function to sort data
		// enter your code here
		//(words[0] w1, words[1] w2) -> w1.getName().compareTo(w2.getName());
		//words.sort((p1, p2) -> p1.compareTo(p2));
		words.sort(String::compareToIgnoreCase);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fn="Nostromo.txt" ;
		LambdaSort ls= new LambdaSort(fn);
		ls.showWords(10);
		ls.sortWordsComplex();
		ls.showWords(10);
		ls.sortWordsSimple();
		ls.showWords(10);
		System.out.print(fn);
	}
}