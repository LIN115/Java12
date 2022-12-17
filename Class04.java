package Java12;

class CWindow121 {
	private int width;
	private int height;
	private String name;

	public CWindow121(int w, int h, String s) {
		width = w;
		height = h;
		name = s;
	}

	public void show() {
		System.out.println("Name=" + name);
		System.out.println("W=" + width + ", H=" + height);
	}
}

public class Class04 {

	public static void main(String[] args) {
		CWindow121 cw = new CWindow121(3, 5, "Big windows");
		cw.show();
	}
}