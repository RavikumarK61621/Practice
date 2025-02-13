package practiceJavaBasis;

class personone{
	public String name;
	protected int age;
	private String socialSecurityNumber;
	String address;
	
	personone(String name, int age, String socialSecurityNumber, String address){
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address = address;
			
	}
	void displaySSN() {
		System.out.println(socialSecurityNumber);
	}
}


class Employeeone extends personone{
		
	Employeeone(String name, int age, String socialSecurityNumber, String address){
		super(name,age,socialSecurityNumber,address);
		
		
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
		Employeeone em = new Employeeone("John", 28, "stbsd", "KKBN" );
		System.out.println(em.name);
		System.out.println(em.age);
		System.out.println(em.address);
		em.displaySSN();
		
	}
}

