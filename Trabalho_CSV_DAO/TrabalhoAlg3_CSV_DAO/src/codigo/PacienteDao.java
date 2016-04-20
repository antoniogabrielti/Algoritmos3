package codigo;


public interface PacienteDao<T> {
	Paciente getPaciente(String rg);
	void addPaciente(Paciente paciente);
	void removePaciente(String rg);
	void loadData(CSVFile arquivo);
}
