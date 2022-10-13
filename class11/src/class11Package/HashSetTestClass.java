package class11Package;

import java.util.HashSet;
import java.util.Objects;

public class HashSetTestClass {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void nonGenericSetSum() {
	HashSet hs = new HashSet();
	Integer sum = 0;
	hs.add("test");
	hs.add(12);
	hs.add(9);
	hs.add(1.2);
	// insert the code here
	int size = hs.size();
	Object[] ob = hs.toArray(new Object[hs.size()]);
	//Object[] ob = hs.toArray();

	for(int i=0;i<size;i++) {
				if(isInt(ob[i]) == true)
				{
					sum = sum + (int)ob[i];
				}
	}
		System.out.print("Sum:"+sum);
	}
	public static boolean isInt(Object o) {
		if(Integer.class.isInstance(o)) 
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		nonGenericSetSum();
	}
}