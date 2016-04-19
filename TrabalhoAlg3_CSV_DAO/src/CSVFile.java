
public class CSVFile<T> {
	private CSVParser<T> objectParser;
	
	public void open(String filename){
		
	}
	public void close(){
		
	}
	public T readObject(){
		return null;
	}
	public void setObjectParser(CSVParser<T> parser) {
		this.objectParser = parser;
	}
}
