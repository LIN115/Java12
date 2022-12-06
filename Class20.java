package Java12;

import java.math.*;

public class Class20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(256);
	}

	public static void f(int n) {
		BigInteger fn;
		BigInteger fn_1 = new BigInteger("1");
		BigInteger fn_2 = new BigInteger("1");

		System.out.println("1");
		System.out.println("1");
		for (int i = 3; i <= n; i++) {
			fn = fn_1.add(fn_2);
			System.out.println(fn);
			fn_2 = fn_1;
			fn_1 = fn;
		}
	}

}
