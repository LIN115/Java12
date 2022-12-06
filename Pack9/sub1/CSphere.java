package Pack9.sub1;

public class CSphere {
	final static double PI = 3.14;
	private double radius;

	public CSphere(double r) {
		radius = r;
	}

	public void show() {
		double vol = 4 / 3.0 * PI * radius * radius;

		System.out.println("radius=" + radius);
		System.out.println(", volume=" + vol);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
