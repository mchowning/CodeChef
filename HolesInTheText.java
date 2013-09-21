import java.util.*;
import java.io.*;


class HolesInTheText {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int numLines = Integer.parseInt(br.readLine());	
			for (int i = 0; i < numLines; i++) {
				String line = br.readLine();
				int holes = numHoles(line);
				System.out.println(holes);			
			}
		} catch (IOException e) {}
	}
	
	public static int numHoles (String str) {
		int holes = 0;
		for (char ch : str.toCharArray()) {
		/*for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);*/
			
			final HashSet<Character> hs = getSet();
			
			if (ch == 'B') {
				holes += 2;
			} else if (hs.contains(ch)) {

/*			//Alternatively
 			} else if (ch == 'A' ||
				ch == 'D' ||
				ch == 'O' ||
				ch == 'P' ||
				ch == 'Q' ||
				ch == 'R')
			{
*/
				holes ++;
			}

		}
		return holes;
	}

	private static HashSet<Character> getSet() {
		HashSet<Character> hs = new HashSet<Character>();
		hs.add('A');
		hs.add('D');
		hs.add('O');
		hs.add('P');
		hs.add('Q');
		hs.add('R');
		return hs;	
	}	
}