package oop.inheritancehomework;

public class MainClass {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		rec.set_valus(15, 20);
		System.out.println("Area of Rectangle = "+ rec.area());
		
		Triangle tri = new Triangle();
		tri.set_valus(20, 30);
		System.out.println("Area of Tryangle = "+ tri.area());
		
		

	}

}
