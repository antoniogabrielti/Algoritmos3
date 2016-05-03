
public class TabelaHash{
    private int tamanho=33;
   public int[] getHashes(Object obj,int numHashes){
       int [] vetorHashesCode = new int[numHashes];
       for(int i=0; i<numHashes;i++){
           vetorHashesCode[i]=geradorHashCode(obj);
       }
       return vetorHashesCode;
   } 

    private int geradorHashCode(Object obj) {
        Pessoa p = (Pessoa)obj;
           return (p.getCpf()*2)%tamanho;
    }
}
