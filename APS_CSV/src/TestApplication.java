import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestApplication {

	public static void main(String[] args) {
		String filename = "F:\\Principal\\SENAC - 2016.1\\Algoritmos III\\pacientes.csv";
		CSVFile<Paciente> file = new CSVFile<Paciente>();
		
		PacienteParser PP = new PacienteParser();
		file.setParser(PP);
		file.Open(filename);

		/*
		try {
            FileReader fr = new FileReader("B:\\Principal\\Analise e Desenvolvimento de Sistemas\\nomes.csv");
            Scanner leitor = new Scanner(fr);
            CSVFile File = new CSVFile();
            //leitor.hasNext()  leitor.next()
            leitor.useDelimiter("[},]");
           
            while (leitor.hasNext()) {
            	Pessoa p = new Pessoa(leitor.next(),leitor.next(),leitor.next(),leitor.next(),leitor.next());
            	l.Inserir(p);
               
            }
            l.print();
            leitor.close();
        } catch (FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        }*/

	}

}
