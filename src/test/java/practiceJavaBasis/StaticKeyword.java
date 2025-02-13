package practiceJavaBasis;

class counter{
	static int count = 0;
		   int instanceNumber = 0;
		   
		   counter(){
			   count = count+1;
			   instanceNumber = instanceNumber+1;
		   }
			void display() {
				System.out.println("count:" + count);
				System.out.println("instanceNumber :" + instanceNumber );
			}
}

public class StaticKeyword {

	public static void main(String[] args) {
		counter c1 = new counter();
		c1.display();
		counter c2 = new counter();
		c2.display();
		counter c3 = new counter();
		c3.display();
		counter c4 = new counter();
		c4.display();
	}

}
