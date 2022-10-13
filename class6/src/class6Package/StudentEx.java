package class6Package;

public class StudentEx {
	private String name; // null or empty names are not allowed
	private int id; // the id must have of 6 digits
	// throw an Exception in the case of any problem
	public StudentEx(String name, int id) throws Exception {
		if(name == null || name.trim().length()<=0)
		{
			throw new Exception("Name can not be null or empty!");
		}
		int idLength = String.valueOf(id).length();
		if(id <= 0 || idLength != 6)
		{
			throw new Exception("Id must have 6 digits");
		}
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return ("Student's name: "+name+", student's id: "+id);
	}
	// two objects of the StudentEx class are equal if they have the same id
	// in all other cases return false
	public boolean equals(Object ob) {
		if(ob instanceof StudentEx && ((StudentEx) ob).getId()==id) 
		{
			return true;
		}
		return false;
	}
	// if ob is not a student return -1
	// if the object or ob is not a proper Student return -1
	// in all other cases use alphabetical, case not sensetive ordering of name
	// use a method from the String class
	public int compareTo(Object ob) {
		if(!(ob instanceof StudentEx)) 
		{
			return -1;
		}
		String objectName = getName();
		String obName = ((StudentEx)ob).getName();
		return(objectName.compareToIgnoreCase(obName));
	}
	public boolean isProper() {
		if(name != "Joe Doe") 
			return true;
		if(id != -1) 
			return true;
		return false;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}
