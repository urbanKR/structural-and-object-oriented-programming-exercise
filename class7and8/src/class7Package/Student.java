package class7Package;

public class Student extends HumanBeing {
	private String name;
	private int id;
	private int age;
	int gradeArrLength = 10;
	double[] gradeArr = new double[gradeArrLength];
	public Student (String name, int id, int age, int gradeArrLength) throws Exception{
		super(name, id, age);
		this.name = name;
		this.id = id;
		this.age = age; 
		if(gradeArrLength < 0)
		{
			throw new Exception ("Invalid gradeArrLength!");
		}
		this.gradeArr = new double[gradeArrLength];
	}
	public String toString() {
		return ("Student's name: "+name+", Student's id: "+id+", Student's age: "+age);
	}
	public boolean storeGrade(double grade) {
		// allowed values: 2.0, 3.0, 3.5, 4.0, 4,5 5,0, 5,5
		double[] possibleGradeArr = {2.0, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};

		int j=0;
		for(int k=0; k<gradeArr.length; k++) {
			if(gradeArr[k] != 0)
			{
				j++;
			}
		}
		for(int i=0; i<possibleGradeArr.length; i++) {
			if(grade == possibleGradeArr[i])
			{
				gradeArr[j] = grade;
				return true;
			}
		}
		return false;
	}
	public Double getAverageGrade() {
		double sum  = 0;
		double k = 0;
		for(int i=0; i<gradeArr.length; i++) {
			sum += gradeArr[i];
			k++;
		}
		if(k != 0)
		{
			return sum/k;
		}
		return 0.0;
	}
	public boolean setGradeArrLength(int gradeArrLength) {
		if(gradeArrLength < 0)
		{
			return false;
		}
		this.gradeArrLength = gradeArrLength;
		return true;
	}
	public Double getGrade(Double grade) {
		double[] possibleGradeArr = {2.0, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};
		for(int i=0; i<possibleGradeArr.length; i++) {
			if(grade == possibleGradeArr[i])
			{
				return grade;
			}
		}
		return null;
	}
	public double[] getAllGrades() {
		return gradeArr;
	}
//	public void writeAllGrades(double gradeArr[]) {
//		for(int i=0; i<gradeArr.length; i++) {
//			System.out.println("Grade nr "+i+": "+gradeArr[i]);
//			if(i%4==0)
//			{
//				System.out.println("\n");
//			}
//		}
//	}
	public static void testMe() throws Exception {
		Student student1 = new Student("Adam", 123456, 56, 3);
		student1.storeGrade(3.0);
		student1.storeGrade(4.0);
		student1.storeGrade(5.0);
		System.out.println(student1.toString());
		double[] gradeArr = student1.getAllGrades();
		for(int i=0; i<gradeArr.length; i++)
		{
			System.out.println("Grade nr "+(i+1)+": "+gradeArr[i]);
		}
//		student1.setAge(-23);
//		System.out.println("Age after setting: "+student1.getAge());
//		System.out.println("Is proper? "+student1.isProper());
	}
	public static void main(String[] args) throws Exception {
		testMe();
	}

}
