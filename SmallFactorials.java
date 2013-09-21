import java.io.*;
import java.math.BigInteger;

class SmallFactorials {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nLines = Integer.parseInt(br.readLine());
		for (int i = 0; i < nLines; i++) {
			int num = Integer.parseInt(br.readLine());
			BigInteger fact = factorial(num);
			System.out.println(fact);
		}
		System.exit(0);
	}
		
	public static BigInteger factorial(int n) {
		BigInteger bigNum = new BigInteger(Integer.toString(n));
		return factorial(bigNum);
	}
	
	private static BigInteger factorial(BigInteger n) {
		if (n.equals(BigInteger.ONE)) return n;
		return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
}
