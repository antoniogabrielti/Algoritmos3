

public class Pessoa {
    private int cpf;
    private String nome;
    
    public Pessoa(){
        this.cpf=(int)(1+Math.random()*129);
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
