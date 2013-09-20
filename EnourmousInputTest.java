import java.io.*;

class EnourmousInputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int numLines = Integer.parseInt(in[0]);
		int divisor = Integer.parseInt(in[1]);
		int count = 0;
		for (int i = 0; i < numLines; i++) {
			int num = Integer.parseInt(br.readLine());			
			if (num % divisor == 0) count++;
		}
		System.out.println(count);
		br.close();
		System.exit(0);
	}
}
