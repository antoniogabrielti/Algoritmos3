
package codigo;

import datastructures.IteradorListaEncadeada;
import datastructures.ListaEncadeada;

public class PacienteDAOLista implements PacienteDao<PacienteDAOLista> {
    ListaEncadeada<Paciente> ListaPaciente = new ListaEncadeada<Paciente>();
    IteradorListaEncadeada<Paciente> IteradorPaciente = new IteradorListaEncadeada(ListaPaciente);
    @Override
    public Paciente getPaciente(String rg) {
                Paciente Encontrado=null;
               	while(IteradorPaciente.hasNext()){
                    if(IteradorPaciente.next().getRg().equals(rg)){
                        Encontrado=IteradorPaciente.next();
                    }
                }
		return Encontrado;
    }
    public ListaEncadeada<Paciente> getLista(){
        return ListaPaciente;
    }
    @Override
    public void addPaciente(Paciente paciente) {
        IteradorPaciente.InsertSort(paciente);
    }

    @Override
    public void removePaciente(String rg) {
        while(IteradorPaciente.hasNext()){
            if(IteradorPaciente.next().getRg().equals(rg)){
                IteradorPaciente.remove();
            }
        }
    }

    @Override
    public void loadData(CSVFile arquivo) {
        CSVFile<Paciente> arquivoPac=arquivo;
        String Filename="caminho arquivo csv";
        arquivo.Open(Filename);
        addPaciente(arquivoPac.readObject());
        arquivo.Close();
    }  
}
