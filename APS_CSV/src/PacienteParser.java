public class PacienteParser implements CSVParser<Paciente>{

	@Override
	public Paciente parseObject(String Dados) {
		String array[] = new String[3];
		array = Dados.split(";");
		Paciente paciente = new Paciente(array[0],array[1],array[2]);
		return paciente;
	}
}
