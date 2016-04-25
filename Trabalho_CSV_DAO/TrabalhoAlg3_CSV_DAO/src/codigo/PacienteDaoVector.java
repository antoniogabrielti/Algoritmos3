package codigo;


import datastructures.IteradorVetor;
import datastructures.Vetor;
import java.util.Iterator;


public class PacienteDaoVector implements PacienteDao<PacienteDaoVector> {

         private Vetor<Paciente> VetorPacientes;
         private IteradorVetor<Paciente> Iterador;
         
         public PacienteDaoVector(){
             VetorPacientes=new Vetor<Paciente>();
             Iterador=new IteradorVetor<Paciente>(VetorPacientes);
         }

        public Vetor<Paciente> getVetorPacientes() {
           Iterador.SelectSort();
          return VetorPacientes;
        }

	public Paciente getPaciente(String rg) {
                Iterador.SelectSort();
                Paciente Encontrado=null;
               	while(Iterador.hasNext()){
                    Paciente pac = Iterador.next();
                    if(pac.getRg().equalsIgnoreCase(rg)){
                        Encontrado=pac;
                    }
                }
		return Encontrado;
	}


	public void addPaciente(Paciente paciente) {
                Iterador.insert(paciente);      
	}


	public void removePaciente(String rg) {
            while(Iterador.hasPrevious()){
                if(Iterador.previous().getRg().equals(rg)){
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

