package chap4Programing;

public class Car {
	static String color;
	static int count;
	static int rcount;
	
	public Car(String color){
		this.color = color;
		count++;
	}
	
	public static int getNumOfCar() {
		return count;
	}
	
	public static int getNumOfTedCar() {
		if((color.equals("red") || (color.equals("RED")))){
			rcount++;
		}
		
		return rcount;
	}
}
