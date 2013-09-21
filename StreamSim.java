import java.io.*;

// MORE TROUBLE THAN IT IS WORTH.

public class StreamSim {
	
	private ByteArrayOutputStream byteOut;
	private PrintWriter pw;
	private BufferedReader br;
	
	public void initializeOutput() {
		byteOut = new ByteArrayOutputStream();
		pw = new PrintWriter(byteOut);
	}
	
	public void addToOutput(String str) {
		pw.println(str);
	}
	
	public InputStream getInputStream() {
		pw.flush();
		ByteArrayInputStream is = new ByteArrayInputStream(byteOut.toByteArray());
		pw.close();
		return is;
	}
	
	public void closeOutput() {
		pw.flush();
		ByteArrayInputStream is = new ByteArrayInputStream(byteOut.toByteArray());
		pw.close();
		try {
			byteOut.close();
		} catch (IOException e) { }
		br = new BufferedReader(new InputStreamReader(is));
	}
	
	public String readOutput() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {}
		return str;
	}
}
