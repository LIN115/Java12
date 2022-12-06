package Java12;

class CWindow {
	private int width;
	private int height;
	private String name;

	public CWindow(int w, int h, String s) {
		width = w;
		height = h;
		name = s;
	}

	public void show() {
		System.out.println("Name=" + name);
		System.out.println("W=" + width + ",H=" + height);
	}
}

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWindow cw = new CWindow(3, 5, "Big window");
		cw.show();
	}

}
