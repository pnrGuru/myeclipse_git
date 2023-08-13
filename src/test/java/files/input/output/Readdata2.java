package files.input.output;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Readdata2 {

	public static void main(String[] args)throws IOException {
		FileReader fr=new FileReader("G:\\API_testing_pnr\\my notes\\interview notes\\freshertestfile.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String textInfile;
		String substring="postman";
		while((textInfile=br.readLine())!=null) {
			
			System.out.println(textInfile);
			
			
		}
		

	}

}
