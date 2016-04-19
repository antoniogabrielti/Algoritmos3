
import datastructures.IteradorVetor;
import datastructures.Vetor;


public class MedicamentoDAOVector implements MedicamentoDao<MedicamentoDAOVector> {
         private Vetor<Medicamento> VetorMedicamento = new Vetor<Medicamento>();
         private IteradorVetor<Medicamento> Iterador = new IteradorVetor<Medicamento>(VetorMedicamento);
	public Medicamento getMedicamento(int codigo) {
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
		while(Iterador.hasNext()){
                    
                }
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
		// TODO Auto-generated method stub
		
	}

}
