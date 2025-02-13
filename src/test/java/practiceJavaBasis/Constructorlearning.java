package practiceJavaBasis;

public class Constructorlearning {

	public void Animals(){
		System.out.println("Fear sounds");
	}
	
	public void Birds(){
		System.out.println("Cute Sounds");
	}

	public void Humans(){
		System.out.println("Normal Sounds");
	}
	
	public void Vehicles(){
		System.out.println("Irritate Sounds");
	}
		
	Constructorlearning(String noise){
		System.out.println("Noise level: " + noise);
	}
	
	public static void main(String[] args) {
		Constructorlearning cl = new Constructorlearning("130 dB");
		
		cl.Animals();
		cl.Birds();
		cl.Humans();
		cl.Vehicles();
	}
}