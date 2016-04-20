package codigo;


public interface MedicamentoDao<T> {
	Medicamento getMedicamento(int codigo);
	void addMedicamento(Medicamento medicamento);
	void removeMedicamento(int codigo);
	void loadData(CSVFile arquivo);
}
