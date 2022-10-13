package class9Package;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class9class {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("data1.txt"));
			int adamsCount = 0;
			int januaryStudents = 0;
			int NamesStartingWithB = 0;
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				Pattern pattern = Pattern.compile("(\\w+)[\\t](\\w+)[\\t](\\d+)[\\t](\\d{2})[.](\\d{2})[.](\\d{4})");
				Matcher matcher = pattern.matcher(line);

				if(matcher.find()) 
				{
					if(matcher.group(1).equals("Adam")) 
					{
						adamsCount++;
					}
					if(Integer.parseInt(matcher.group(5)) == 1) 
					{
						januaryStudents++;
					}
					if(matcher.group(1).charAt(0) == 'B') 
					{
						NamesStartingWithB++;
					}
				}
			}
			System.out.println("Number of students with \"Adam\" as their first name: "+adamsCount);
			System.out.println("Number of students born in January: "+januaryStudents);
			System.out.println("Number of students whose first name starts with \"B\": "+NamesStartingWithB);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}