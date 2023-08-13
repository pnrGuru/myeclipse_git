package files.input.output;
import java.io.FileReader;
import java.io.*;

public class ReadData1 {

	public static void main(String[] args)throws IOException {
		FileReader fr=new FileReader("G:\\API_testing_pnr\\sir notes\\mytestfile.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String strAtfile;
		while((strAtfile = br.readLine())!= null) {
			System.out.println(strAtfile);
		}
		br.close();

	}

}
