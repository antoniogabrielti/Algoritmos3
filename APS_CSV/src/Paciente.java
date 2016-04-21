
public class Paciente {
	private String nome;
	private String rg;
	private String data;

	public Paciente(String Nome,String Rg,String Data){
		this.nome=Nome;
		this.rg=Rg;
		this.data=Data;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRg() {
		return rg;
	}
	
	public String getData() {
		return data;
	}
	@Override
	public String toString() {
		return "Nome Paciente: "+this.nome+"\nRG do paciente: "+this.rg+"\nData de Nascimento: "+this.data;
	}
}
