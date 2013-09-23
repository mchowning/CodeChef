import java.io.*;
import java.util.Arrays;

class TurboSort {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int numLines = Integer.parseInt(br.readLine());
			int[] nums = new int[numLines];
			for (int i = 0; i < numLines; i++) {
				nums[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(nums);
			
			/* Doing this without using the PrintWriter in this way resulted
			   in the problem timing out. It's the single flush at the end that
			   seems like the secret.  If I set the PrintWriter to flush at the
			   end of every line automatically, then it timed out again. */
			PrintWriter pw = new PrintWriter(System.out);
			for (int i = 0; i < numLines; i++) {
				pw.println(nums[i]);
			}
			pw.flush();
		} catch (IOException e) {}
		System.exit(0);
	}
}
