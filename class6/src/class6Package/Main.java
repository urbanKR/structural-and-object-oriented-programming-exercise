package class6Package;

public class Main {

	public static void main(String[] args) throws Exception {

		StudentEx student1 = new StudentEx("Adam Adam", 123456);
		StudentEx student2 = new StudentEx("Adam Ada", 654321);
		System.out.println(student1.toString());
		System.out.println("student1 == student2? "+student1.equals(student2));
		System.out.println("How much student1 and student2 names have different characters? "+student1.compareTo(student2));
		System.out.println("Is student 1 proper? "+student1.isProper());
	}
}
