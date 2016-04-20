package codigo;


public interface PacienteDao {
	Paciente getPaciente(String rg);
	void addPaciente(Paciente paciente);
	void removePaciente(String rg);
	void loadData(CSVFile arquivo);
}
