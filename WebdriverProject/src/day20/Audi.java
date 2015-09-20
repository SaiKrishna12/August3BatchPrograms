package day20;

public class Audi extends Car{

	String model;
	public void accl()
	{
		System.out.println("car accl");
	}
	public static void main(String[] args) {
		
		
		Audi a=new Audi();
		a.model="audi";
		a.accl();
		a.price=1111;
		a.start();
	}

}
