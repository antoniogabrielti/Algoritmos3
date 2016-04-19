
import datastructures.IteradorVetor;
import datastructures.Vetor;


public class MedicamentoDAOVector implements MedicamentoDao<MedicamentoDAOVector> {
         private Vetor<Medicamento> VetorMedicamento = new Vetor<Medicamento>();
	
	public Medicamento getMedicamento(int codigo) {
		Medicamento Encontrado=null;
                IteradorVetor<Medicamento> Iterador = new IteradorVetor<Medicamento>(VetorMedicamento);
		while(Iterador.hasNext()){
                    if(Iterador.next().getCodigo()==codigo){
                        Encontrado=Iterador.next();
                    }
                }
		return Encontrado;
	}

	@Override
	public void addMedicamento(Medicamento medicamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMedicamento(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadData(CSVFile arquivo) {
		// TODO Auto-generated method stub
		
	}

}
