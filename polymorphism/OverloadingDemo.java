package polymorphism;

public class OverloadingDemo {
  int  add(int a, int b) {
	  int c=a+b;
	return c;
	  
  }
float add(float a, float b) {
	float c=a+b;
	  return c;
  }
long add(long a, long b) {
	long c=a+b;
	  return c;
}
double add(double a, double b) {
	return 0;
}
	public static void main(String[] args) {
		OverloadingDemo ol=new OverloadingDemo();
		System.out.println(ol.add(56576868, 768789090));
		

	}

}
