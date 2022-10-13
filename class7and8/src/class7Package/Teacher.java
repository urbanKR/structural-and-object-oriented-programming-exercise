package class7Package;

public class Teacher extends HumanBeing{
	private String name;
	private int id;
	private int age;
	private int yearsOfWork;
	public Teacher (String name, int id, int age, int yearsOfWork) throws Exception{
		super(name, id, age);
		this.name = name;
		this.id = id;
		this.age = age;
		// 0<= yearsOfWork <=50 and less than age+20
		// enter your code here
		if(!areYearsOfWorkProper(yearsOfWork))
		{
			throw new Exception("Invalid yearsOfWork!");
		}
		this.yearsOfWork = yearsOfWork;
	}
	public String toString() {
		return ("Teacher's name: "+name+", Teacher's id: "+id+", Teacher's age: "+age);
	}
	public int getYearsOfWork() {
		return yearsOfWork;
	}
	public boolean areYearsOfWorkProper(int yearsOfWork) {
		if(yearsOfWork < 0 || yearsOfWork > 50 || yearsOfWork >= age+20)
		{
			return false;
		}
		return true;
	}
	public boolean setYearsOfWork(int new_yearsOfWork) {
		if(!areYearsOfWorkProper(new_yearsOfWork))
		{
			return false;
		}
		this.yearsOfWork = new_yearsOfWork;
		return true;
	}
}

