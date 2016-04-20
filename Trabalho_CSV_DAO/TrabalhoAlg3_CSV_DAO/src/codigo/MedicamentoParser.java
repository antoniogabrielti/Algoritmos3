package codigo;

public class MedicamentoParser implements CSVParser<Medicamento>{

	@Override
	public Medicamento parseObject(String Dados) {
		String array[] = new String[2];
		array = Dados.split(";");
		Medicamento medicamento = new Medicamento(Integer.parseInt(array[0]),array[1]);
		return medicamento;
	}
}
