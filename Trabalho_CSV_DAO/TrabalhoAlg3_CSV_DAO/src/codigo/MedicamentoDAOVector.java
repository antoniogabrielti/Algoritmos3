package codigo;


import datastructures.IteradorVetor;
import datastructures.Vetor;


public class MedicamentoDAOVector implements MedicamentoDao<MedicamentoDAOVector> {
  
         private Vetor<Medicamento> VetorMedicamentos;
         private IteradorVetor<Medicamento> IteradorMedicamento;
         
         public MedicamentoDAOVector(){
             VetorMedicamentos=new Vetor<Medicamento>();
             IteradorMedicamento=new IteradorVetor<Medicamento>(VetorMedicamentos);
         }

        public Vetor<Medicamento> getVetorMedicamentos() {
           IteradorMedicamento.SelectSort();
          return VetorMedicamentos;
        }

	public Medicamento getMedicamento(int codigo) {
                IteradorMedicamento.SelectSort();
                Medicamento Encontrado=null;
               	while(IteradorMedicamento.hasNext()){
                    Medicamento med = IteradorMedicamento.next();
                    if(med.getCodigo()==codigo){
                        Encontrado=med;
                    }
                }
		return Encontrado;
	}


	public void addMedicamento(Medicamento medicamento) {
                IteradorMedicamento.insert(medicamento);      
	}


	public void removeMedicamento(int codigo) {
            while(IteradorMedicamento.hasPrevious()){
                if(IteradorMedicamento.previous().getCodigo()==codigo){
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
