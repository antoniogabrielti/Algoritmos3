
public class TestAplication {
    public static void main(String[] args) {
        TabelaHash TH = new TabelaHash();
        Pessoa [] listaPessoas = new Pessoa[6];
        for(int i=0; i<6;i++){
            Pessoa P = new Pessoa();
            listaPessoas[i]=P;
            System.out.println(TH.getHashes(P, 1)[0]);
        }
        System.out.println("------ Metodo Equals --------");
        for(int i=0; i<listaPessoas.length;i++){
            if((i+1)!=listaPessoas.length){
                System.out.println("este objeto e o proximo são iguais? "+listaPessoas[i].equals(listaPessoas[i+1]));
            }
        }
    }
}
