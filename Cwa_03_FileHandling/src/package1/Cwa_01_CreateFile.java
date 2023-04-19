package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Cwa_01_CreateFile {

	public static void main(String[] args) throws IOException {

		File file = new File("DemoFile.txt");
		if (file.createNewFile()) {
			System.out.println("File is created");
		}
		
		InputStream is = new FileInputStream(file);
		Scanner sc =new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.print(sc.nextLine());
		}
	sc.close();
	is.close();
	}

}
