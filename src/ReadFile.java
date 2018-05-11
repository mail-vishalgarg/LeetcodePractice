import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
	private static final String FILENAME="C:\\Users\\vishgarg.ORADEV\\eclipse-workspace\\VishalLeetCode\\test.txt";
	public static void main(String[] args) throws IOException{
		FileReader fileReader;
		try {
			fileReader = new FileReader(FILENAME);
			BufferedReader br = new BufferedReader(fileReader);
			String line = "";
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
			//Write to the file
			FileWriter fw = new FileWriter(FILENAME);
			BufferedWriter bw = new BufferedWriter(fw);
			String data = "\nHi How are you\n";
			bw.write(data);
			System.out.println("...Done...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
