package class7Package;

public class HumanBeing {
	// null or empty names are not allowed,
	// the first letter must uppercase, the rest lowercase.
	// if necessary correct (change to proper form) the cases.
	private String name;	
	// the id must consist of 6 digits starting with non zero
	private int id;
	// >1 and <120
	private int age;
	public HumanBeing(String name, int id, int age) throws Exception {
		if(name == null || name.trim().length()<=0)
		{
			throw new Exception("Invalid name!");
		}
		String properName = "";
		if(!(Character.isUpperCase(name.charAt(0))))
		{
			String firstLetter = Character.toString(name.charAt(0));
			firstLetter.toUpperCase();
			properName += firstLetter;
		}
		for(int i=0; i<name.length(); i++) {
			String nameLetter = Character.toString(name.charAt(i));
			if(!(Character.isLowerCase(name.charAt(i))))
			{
				nameLetter.toLowerCase();
			}
			properName += nameLetter;
		}
		this.name = properName;
		int idLength = String.valueOf(id).length();
		if(id <= 0 || idLength != 6)
		{
			throw new Exception("Invalid id!");
		}
		this.id = id;
		if(!(age > 1 && age < 120))
		{
			throw new Exception("Invalid age!");
		}
		this.age = age;
	}
	public String toString() {
		return ("HumanBeing name: "+name+", HumanBeing id: "+id+", HumanBeing age: "+age);
	}
	// two objects of the HumanBeing class are equal if they have the same id
	// in all other cases return false
	public boolean equals(Object ob) {
		if(ob instanceof HumanBeing && ((HumanBeing) ob).getId()==id) 
		{
			return true;
		}
		return false;
	}
	// if the ob is not a proper HumanBeing return -1
	// in all other cases use alphabetical, case not sensetive ordering of name,
	// use a proper method from the String class
	public int compareTo(Object ob) {
		if(!((HumanBeing)ob).isProper()||!isProper()) 
		{
			return -1;
		}
		String objectName = getName();
		String obName = ((HumanBeing)ob).getName();
		return(objectName.compareToIgnoreCase(obName));
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public boolean isProper() {
		int idLength = String.valueOf(id).length();
		if(name != "" || name != null) 
			return true;
		if(id >= 0 && idLength == 6) 
			return true;
		return false;
	}
	public boolean setAge(int age) {
		if(!(age > 1 && age < 120))
		{
			return false;
		}
		this.age = age;
		return true;
	}
	public int getAge() {
		return age;
	}
	public static void testMe() throws Exception {
		HumanBeing human1 = new HumanBeing("Adam", 123456, 56);
		System.out.println(human1.toString());
		human1.setAge(60);
		System.out.println("Age after setting: "+human1.getAge());
		System.out.println("Is proper? "+human1.isProper());
	}
	public static void main(String[] args) throws Exception {
		testMe();
	}
}
