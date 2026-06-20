package 김준연;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("C:/test.txt");
		int c;
		while((c = fis.read()) != -1) System.out.print((char)c);
		fis.close();
	}
}
