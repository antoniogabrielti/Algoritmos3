package codigo;


import datastructures.IteradorVetor;
import datastructures.Vetor;


public class MedicamentoDAOVector implements MedicamentoDao<MedicamentoDAOVector> {
         private Vetor<Medicamento> VetorMedicamento = new Vetor<Medicamento>();
         private IteradorVetor<Medicamento> Iterador = new IteradorVetor<Medicamento>(VetorMedicamento);
	public Medicamento getMedicamento(int codigo) {
                Iterador.SelectSort();
		Medicamento Encontrado=null;
               	while(Iterador.hasNext()){
                    if(Iterador.next().getCodigo()==codigo){
                        Encontrado=Iterador.next();
                    }
                }
		return Encontrado;
	}

	@Override
	public void addMedicamento(Medicamento medicamento) {
                Iterador.insert(medicamento);      
	}

	@Override
	public void removeMedicamento(int codigo) {
		while(Iterador.hasNext()){
                    if(Iterador.next().getCodigo()==codigo){
                        Iterador.remove();
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
