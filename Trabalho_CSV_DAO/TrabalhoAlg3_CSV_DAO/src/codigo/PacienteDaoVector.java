package codigo;

import datastructures.IteradorVetor;
import datastructures.Vetor;


public class PacienteDaoVector implements PacienteDao<PacienteDaoVector> {

         private Vetor<Paciente> VetorPacientes;
         private IteradorVetor<Paciente> Iterador;
         
         public PacienteDaoVector(){
             VetorPacientes=new Vetor<Paciente>();
             Iterador=new IteradorVetor<Paciente>(VetorPacientes);
         }
         public void getVetor(){
             Iterador.MostrarVetor();
         }

	public Paciente getPaciente(String rg) {
                Iterador.SelectSort();
                Paciente Encontrado=null;
                int i=0;
               	while(i<Iterador.getTamanho()){
                    Paciente pac = Iterador.next();
                    if(pac.getRg().equalsIgnoreCase(rg)){
                        Encontrado=pac;
                    }
                    i++;
                }
		return Encontrado;
	}


	public void addPaciente(Paciente paciente) {
                Iterador.insert(paciente);      
	}


	public void removePaciente(String rg) {
		int i=0;
               	while(i<Iterador.getTamanho()){
                    Paciente pac = Iterador.next();
                    if(pac.getRg().equalsIgnoreCase(rg)){
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

