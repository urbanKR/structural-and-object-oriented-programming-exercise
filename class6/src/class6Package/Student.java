package class6Package;

public class Student {
	private String defaultName = "Joe Doe";
	private String name = defaultName; // null or empty names are not allowed, default value
	private int defaultId = -1;
	private int id = defaultId; // the id must consist of 6 digits, default value -1
	// use default values in the case of any problem
	public Student(String name, int id) {

		if(name != null && name.trim().length()>0) //lenght != 0
		{
			this.name = name;
		}
		int length = String.valueOf(id).length();
		if(id > 0 && length == 6) 
		{
			this.id = id;
		}
	}
	public String toString() {
		return ("Student's name: "+name+", student's id: "+id);
	}
	// two objects of the \student class are equal if they have the same id
	// in all other cases return false
	public boolean equals(Object ob) {
		if(ob instanceof Student && ((Student) ob).getId()==id) 
		{
			return true;
		}
		return false;
	}
	// if ob is not a student return -1
	// if the object or ob is not a proper Student return -1
	// in all other cases use alphabetical, case not sensetive ordering of name,
	//use a proper method from the String class
	public int compareTo(Object ob) {
		if(!(ob instanceof Student)) 
		{
			return -1;
		}
		if(!((Student)ob).isProper()||!isProper()) 
		{
			return -1;
		}
		String objectName = getName();
		String obName = ((Student)ob).getName();
		return(objectName.compareToIgnoreCase(obName));
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public boolean isProper() {
		if(name != defaultName) 
			return true;
		if(id != defaultId) 
			return true;
		return false;
	}
}