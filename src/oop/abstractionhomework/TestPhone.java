package oop.abstractionhomework;

public class TestPhone {

	public static void main(String[] args) {
		
		System.out.println("IPhone 12 ProMax");
		
		Phone proMax = new IPhone12(); 
		proMax.on();
		proMax.off();
		proMax.color();
		
		System.out.println("B-------R-----E------A-----K");
		
		System.out.println("IPhone 7 Plus");
		
		Phone plus = new IPhone7Plus(); 
		plus.on();
		plus.off();
		plus.color();


		
		
		
		
		/*Car highlander = new Toyota();
		highlander.start();
		highlander.stop();
		Toyota highlander1 = new Toyota();
		highlander1.carBody();
		Car.wheel();
		*/
		
		
		
		
	}

}
