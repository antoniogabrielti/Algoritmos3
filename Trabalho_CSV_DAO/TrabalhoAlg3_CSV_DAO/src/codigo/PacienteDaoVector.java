package codigo;

import datastructures.IteradorVetor;
import datastructures.Vetor;


public class PacienteDaoVector implements PacienteDao<PacienteDaoVector> {

         private Vetor<Paciente> VetorPacientes = new Vetor<Paciente>();
         private IteradorVetor<Paciente> Iterador = new IteradorVetor<Paciente>(VetorPacientes);

	public Paciente getPaciente(String rg) {
                Iterador.SelectSort();
		Paciente Encontrado=null;
               	while(Iterador.hasNext()){
                    if(Iterador.next().getRg().equalsIgnoreCase(rg)){
                        Encontrado=Iterador.next();
                    }
                }
		return Encontrado;
	}


	public void addPaciente(Paciente paciente) {
                Iterador.insert(paciente);      
	}


	public void removePaciente(String rg) {
		while(Iterador.hasNext()){
                    if(Iterador.next().getRg().equalsIgnoreCase(rg)){
                        Iterador.remove();
                    }
                }
	}


	public void loadData(CSVFile arquivo) {
                CSVFile<Paciente> arquivoPac=arquivo;
                String Filename="caminho arquivo csv";
		arquivo.Open(Filename);
                addPaciente(arquivoPac.readObject());
		arquivo.Close();
	}
}  

