import java.io.*;

class Factorial {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numLines = Integer.parseInt(br.readLine());
		for (int i = 0; i < numLines; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(numZeroes(num));
		}
		System.exit(0);
	}
	
	public static int numZeroes(int num) {
		int result = 0;
		int divisor = 5;
		while (num / divisor >= 1) {
			result += num / divisor;
			divisor *= 5;
		}
		return result;
	}
}
