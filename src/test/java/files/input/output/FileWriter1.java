package files.input.output;
import java.io.*;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter1 {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-genered method stub
		FileWriter fw=new FileWriter("G:\\API_testing_pnr\\sir notes\\FileWriter.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("selenium ");
		bw.write("selenium 4");
		bw.write("cypress");
		
		System.out.println("finish please check ");
		bw.close();

	}

}
