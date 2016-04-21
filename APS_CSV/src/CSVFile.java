import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CSVFile<T>{
	private CSVParser<T> objectParser;
	private Scanner leitor;

	public void Open(String filename) {
		try{
		FileReader fr = new FileReader(filename);
        leitor = new Scanner(fr);
        leitor.useDelimiter("[\n]");
        	while (leitor.hasNext()) {
        			T iterador;
        			iterador=readObject();
        			System.out.println("############################");
        			System.out.println(iterador.toString());
        	}
        	Close();
 		}catch (FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        }
	}
	
	public T readObject(){
		T elemento = objectParser.parseObject(leitor.next());
		return elemento;
	}
	
	public void Close(){
		leitor.close();
	}
	
	public void setParser(CSVParser parser){
		this.objectParser=parser;
	}

}
