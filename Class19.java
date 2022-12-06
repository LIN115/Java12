package Java12;

import java.math.*;

public class Class19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger fib = f(35);
		System.out.println("fib(35)=" + fib);
	}

	public static BigInteger f(int n) {
		BigInteger num;

		if (n == 1 || n == 2)
			return BigInteger.valueOf(1);
		else {
			num = f(n - 1);
			return (num.add(f(n - 2)));
		}
	}
}
