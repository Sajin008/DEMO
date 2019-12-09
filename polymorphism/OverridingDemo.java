package polymorphism;


class Bike{
	void model() {
		System.out.println("FZ");
	}
}
class NewBike extends Bike{
void model() {
		System.out.println("R15");
	}
}
public class OverridingDemo {
public static void main(String[] args) {
	Bike d=new Bike();
	d.model();
	
}
}
