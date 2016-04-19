
public class MedicamentoDAOVector implements MedicamentoDao<MedicamentoDAOVector> {
	private Medicamento[]VetorMedicamento= new Medicamento[20];
	
	public Medicamento getMedicamento(int codigo) {
		Medicamento Encontrado=null;
		for(Medicamento m : VetorMedicamento){
			if(m.getCodigo()==codigo){
				Encontrado=m;
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
