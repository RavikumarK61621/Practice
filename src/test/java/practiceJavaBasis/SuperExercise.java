package practiceJavaBasis;
//using super keyword call the variable, method and contractor from parent class to child class
class Person{
	String name;
	
	Person(String name){
		 this.name=name;
	}
	
}

class Employee extends Person{
	int Emaployeeid;
	
	Employee(String empName, int Emaployeeid){
		super(empName);
		this.Emaployeeid = Emaployeeid;
	}
	public void EmaployeeDetails(){
		System.out.println(Emaployeeid);
		System.out.println(super.name);
	}
}

public class SuperExercise {
	
	public static void main(String[] args) {
		Employee eObj = new Employee("Thomas",123);
		eObj.EmaployeeDetails();
		
	}

}
