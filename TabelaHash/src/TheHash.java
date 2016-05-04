
public class TheHash<K,V> {
    private Object[] dados = new Object[5];
    
    private int getHash(K key,int count){
        String h = String.format("%d", key.hashCode());
        for(int i=0;i<count;i++){
            h=String.format("%d", h.hashCode());
        }
        return h.hashCode();
    }
    
    private void put(K key, V value){
        int h1 = getHash(key,1)%dados.length;
        int h2 = getHash(key,2)%dados.length;
        if(dados[h1]==null)
        dados[h1]=value;
        else if(dados[h2]==null)
            dados[h2]=value;
    }
    private V get(K key){
        int h1= Math.abs(key.hashCode())%dados.length;
        return (V) dados[h1];
    }
    public static void main(String[] args) {
        TheHash<String,Integer> hash = new TheHash<>();
        
        System.out.println(hash.getHash("Rafael",1));
        System.out.println(hash.getHash("Rafael",2));
        System.out.println(hash.getHash("Rafael",3));
        System.out.println(hash.getHash("Rafael",4));
        System.out.println(hash.getHash("Rafael",5));
        System.out.println(hash.getHash("Rafael",6));
        
        hash.put("Rafael",1);
        hash.put("Ivonei",2);
        hash.put("Lucia",3);
        hash.put("Ivonei",4);
        
        System.out.println(hash.get("Rafael"));
        System.out.println(hash.get("Ivonei"));
        System.out.println(hash.get("Lucia"));
        System.out.println(hash.get("Marcela"));
    }
}
