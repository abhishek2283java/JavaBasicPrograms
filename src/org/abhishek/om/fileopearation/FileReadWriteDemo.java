package org.abhishek.om.fileopearation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteDemo {

	public static void main(String[] args) throws IOException {
		//https://www.journaldev.com/851/java-file-separator-separatorchar-pathseparator-pathseparatorchar
		//https://stackoverflow.com/questions/3548775/platform-independent-paths-in-java
			
		String pathTemp=System.getProperty("user.dir");
		System.out.println("pathTemp = " + pathTemp);
		
		//platform independent and safe to use across Unix and Windows
		//File fileSafe = new File("tmp"+File.separator+"abc.txt");
		
		//File file = new File("C:\\MyJava\\ReadFile.txt");
		File file = new File(System.getProperty("user.dir") + File.separator + "target" + File.separator + "ReadFile.txt");
		Scanner scan = new Scanner(file);
		
		String fileContent = "";
		while(scan.hasNextLine()) {
			//System.out.println(scan.nextLine());
			if(fileContent == "")
				fileContent = fileContent.concat(scan.nextLine());
			else {
				fileContent = fileContent.concat("\n");
				fileContent = fileContent.concat(scan.nextLine());
			}
			//fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		//fileContent.concat("\b");
		
		File outputFile = new File(System.getProperty("user.dir") + File.separator + "target" + File.separator + "WrittenFile.txt");
		FileWriter writer = new FileWriter(outputFile);
		writer.write(fileContent);
		
		scan.close();
		writer.close();
	}

}
