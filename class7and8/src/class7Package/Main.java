package class7Package;

public class Main {

	static HumanBeing[] HumanBeing = new HumanBeing[8];
	public static void showAllStudents(HumanBeing[] data) {
		// display all student data on the screen
		for(int i=0; i<HumanBeing.length; i++) {
			System.out.println(HumanBeing[i].toString());
		}
	}
	public static void bestStudents(HumanBeing[] data) {
		// display names of students
		// with highest average grade on the screen
		double highestAvgGrade = 0.0;
		for(int i=0; i<HumanBeing.length; i++) {
			if(HumanBeing[i] instanceof Student && ((Student) HumanBeing[i]).getAverageGrade() > highestAvgGrade)
			{
				highestAvgGrade = ((Student) HumanBeing[i]).getAverageGrade();
			}
		}
		System.out.println("Names of Students with highest avg grade("+highestAvgGrade+"): ");
		for(int j=0; j<HumanBeing.length; j++) {
			if(HumanBeing[j] instanceof Student && ((Student) HumanBeing[j]).getAverageGrade() == highestAvgGrade)
			{
				System.out.println(HumanBeing[j].getName());
			}
		}
	}
	public static Double getAvgSeniors(HumanBeing [] data, double minYears) {
		// return the avarage number of years of work
		// for teachers with more than 30 years of work
		double sum = 0;
		int count = 0;
		for(int i=0; i<HumanBeing.length; i++) {
			
			if(HumanBeing[i] instanceof Teacher && ((Teacher) HumanBeing[i]).getYearsOfWork() > minYears)
			{
				sum += ((Teacher) HumanBeing[i]).getYearsOfWork();
				count++;
			}
		}
		if(count != 0)
		{
			return (sum/count);
		}
		return 0.0;
	}

	public static void main(String[] args) throws Exception{
		
		Student student1 = new Student("Adam", 123456, 22, 3);
		Student student2 = new Student("Kamil", 123454, 21, 3);
		Student student3 = new Student("Andrzej", 123434, 12, 3);
		Student student4 = new Student("Jan", 123467, 11, 2);

		Teacher teacher1 = new Teacher("Mateusz", 123498, 56, 30);
		Teacher teacher2 = new Teacher("Adam", 123489, 65, 35);
		Teacher teacher3 = new Teacher("Jakub", 123490, 87, 40);
		Teacher teacher4 = new Teacher("Adam", 123409, 25, 12);
		
		HumanBeing[0] = student1;
		HumanBeing[1] = student2;
		HumanBeing[2] = student3;
		HumanBeing[3] = student4;
		HumanBeing[4] = teacher1;
		HumanBeing[5] = teacher2;
		HumanBeing[6] = teacher3;
		HumanBeing[7] = teacher4;
		
		student1.storeGrade(4.0);
		student1.storeGrade(3.5);
		student1.storeGrade(4.5);
		student2.storeGrade(4.0);
		student2.storeGrade(4.0);
		student2.storeGrade(4.0);
		student3.storeGrade(2.0);
		student3.storeGrade(2.0);
		student3.storeGrade(3.0);
		student4.storeGrade(5.0);
		student4.storeGrade(2.0);

		
		
		showAllStudents(HumanBeing);
		bestStudents(HumanBeing);
		System.out.println("Avarage number of years of work for teachers with more than 30 years of work: "+getAvgSeniors(HumanBeing, 30));
	}

}
