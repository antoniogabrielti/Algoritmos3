package codigo;


public class Paciente {
	private String rg;
	private String nome;
	private String dataNascimento;
	public Paciente(String rg,String nome,String dataNascimento) {
		this.nome=nome;
		this.rg=rg;
		this.dataNascimento=dataNascimento;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public String getRg() {
		return rg;
	}
}
