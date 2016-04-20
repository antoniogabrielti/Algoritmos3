package codigo;


public class Medicamento implements Comparable<Medicamento> {
	private int codigo;
	private String nome;
	public Medicamento(int cod,String nome) {
		this.codigo=cod;
		this.nome=nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}

    @Override
    public int compareTo(Medicamento OutroMedicamento) {
        if(this.getCodigo()>OutroMedicamento.getCodigo()){
            return 1;
        }
        if(this.getCodigo()<OutroMedicamento.getCodigo()){
            return -1;
        }else{
            return 0;
        }
    }
}
