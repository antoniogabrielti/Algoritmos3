
package codigo;

import datastructures.IteradorListaEncadeada;
import datastructures.ListaEncadeada;

public class MedicamentoDAOLista implements MedicamentoDao<MedicamentoDAOLista> {
    ListaEncadeada<Medicamento> ListaMedicamento = new ListaEncadeada<Medicamento>();
    IteradorListaEncadeada<Medicamento> IteradorMedicamento = new IteradorListaEncadeada(ListaMedicamento);

    @Override
    public Medicamento getMedicamento(int codigo) {
        Medicamento Encontrado=null;
               	while(IteradorMedicamento.hasNext()){
                    if(IteradorMedicamento.next().getCodigo()==codigo){
                        Encontrado=IteradorMedicamento.next();
                    }
                }
		return Encontrado;
    }

    @Override
    public void addMedicamento(Medicamento medicamento) {
        IteradorMedicamento.InsertSort(medicamento);
    }

    @Override
    public void removeMedicamento(int codigo) {
        while(IteradorMedicamento.hasNext()){
                    if(IteradorMedicamento.next().getCodigo()==codigo){
                        IteradorMedicamento.remove();
                    }
                }
    }

    @Override
    public void loadData(CSVFile arquivo) {
        CSVFile<Medicamento> arquivoMed=arquivo;
                String Filename="caminho arquivo csv";
		arquivo.Open(Filename);
                addMedicamento(arquivoMed.readObject());
		arquivo.Close();
    }
}
