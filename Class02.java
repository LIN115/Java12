package Java12;

class CCircle {
	private double pi = 3.14;
	private double radius;

	public CCircle(double r) {
		radius = r;
	}

	public void show() {
		System.out.println("radius=" + radius + ",area=" + pi * radius * radius);
	}
}

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cirl = new CCircle(4.0);
		cirl.show();
	}

}
