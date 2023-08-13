package files.input.output;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;



public class FileWriterWriteData2file {

	public static void main(String[] args) throws IOException{
		
		FileWriter fw=new FileWriter("G:\\API_testing_pnr\\sir notes\\mytestfile.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("File writer is a class used to write a data in a file1 \n");
		bw.write("File writer is a class used to write a data in a file2 \n");
		bw.write("File writer is a class used to write a data in a file3 \n");
		bw.write("File writer is a class used to write a data in a file4 \n");
		bw.write("File writer is a class used to write a data in a file5 \n");
		System.out.println("finish");
		bw.close();
		

		
		}
	
}
		
		
		

	


