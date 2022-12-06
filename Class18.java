package Java12;

import java.math.*;

public class Class18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger("8786567886771666523775892");
		BigInteger b = new BigInteger("1126838773993333890888316");
		BigInteger c = a.add(b);
		BigInteger d;
		BigInteger e;

		System.out.println("a+b=" + c);
		System.out.println("a-b=" + a.add(b.negate()));
		System.out.println("a-b=" + a.subtract(b));
		System.out.println("a*b=" + a.multiply(b));
		System.out.println("a/b=" + a.divide(b));
		System.out.println("a^3=" + a.pow(3));
		System.out.println("gcd(a,b)=" + a.gcd(b));
		d = a.divide(BigInteger.valueOf(1287687762333L));//(d)
		System.out.println("a/1287687762333L=" + d.doubleValue());
		e = a.multiply(BigInteger.valueOf(7762333));//(e)
		System.out.println("a*7762333=" + e.doubleValue());

	}

}
//(a) 本例是呼叫 BigInteger(String val) 建構元。
//(b) 將呼叫 negate() method 的 BigInteger 物件 obj,以-obj 傳回。
//(c) a.add(b.negate()) 是做 a+(-b) 的運算;而 a.subtract(b) 是做 a-b 運算,因此結果是
//相同的。