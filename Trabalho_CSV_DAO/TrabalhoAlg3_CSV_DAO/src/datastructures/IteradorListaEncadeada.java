package datastructures;


/**
 * Implementa um iterador para a lista encadeada. Esta
 * classe esta no mesmo pacote da classe lista para poder
 * utilizar alguns metodos especiais que permitem a inclusao
 * e exclusao de itens, com menos impacto no encapsulamento
 * da Lista Encadeada.
 * 
 * @param <T> O tipo de dado armazenado na lista.
 */
public class IteradorListaEncadeada<T extends Comparable<T>> implements Iterador<T>
{
	private Node<T> iter;
	private Node<T> previous;
	private ListaEncadeada<T> list;
	

	public IteradorListaEncadeada(ListaEncadeada<T> listaEncadeada) {
		this.list = listaEncadeada;
		this.iter = listaEncadeada.getHead();
		this.previous = null;
	}

    public ListaEncadeada<T> getList() {
        return list;
    }
        
	/**
	 * Retorna verdadeiro se existem mais elementos na lista. 
	 * @return True se existem mais elementos, false caso
	 * contrario.
	 */
	@Override
	public boolean hasNext() {
		return iter != null;
	}

	/**
	 * Retorna o proximo elemento da lista, se existir, null
	 * caso contrario.
	 * @return
	 */
	@Override
	public T next() {
		T result = null;
		if (hasNext()) {
			result = iter.getData();
			previous = iter;
			iter = iter.getNext();
		}
		return result;
	}

	/**
	 * Retorna verdadeiro se existe um elemento ante do
	 * elemento atual. Caso retorne verdadeiro, a chamada
	 * ao metodo "previous()" ira funcionar.
	 * @return True se existe um elemento antes do atual,
	 * false caso contrario.
	 */
	@Override
	public boolean hasPrevious() {
		return previous != null;
	}

	/**
	 * Volta uma posicao na estrutura e retorna o elemento
	 * anterior.
	 * @return O elemento anterior na estrutura de dados.
	 */
	@Override
	public T previous() {
		T result = null;
		if (hasPrevious()) {
			result = previous.getData();
			iter = previous;
			previous = previous.getPrevious();
		}
		return result;
	}
         public void InsertSort(T dado){
             Node<T> Chave_Atual= new Node<T>(dado);
             while(hasNext()){
                 if(iter.getNext().getData().compareTo(Chave_Atual.getData())==1){
                     iter.getPrevious().setNext(iter.getPrevious());
                 }else{
                     break;
                 }
                     iter.getPrevious().setNext(Chave_Atual);
                 } 
        }
         
	/**
	 * Insere um elemento imediatamente antes do elemento
	 * atual, caso esteja no final da lista, insere no fim
	 * da lista.
	 * @param dado O dado a ser inserido na estrutura.
	 */
	@Override
	public void insert(T dado) {
		if (list.getTam()==0) {
			list.append(dado);
		} else{
                    while(hasNext()){
                        T aux = iter.getNext().getData();
                        if(aux.compareTo(dado)<1){
                            iter.insertBefore(dado);
                        }
                    }
                }
 	}

	/**
	 * Remove o dado atual apontado pelo iterador.
	 */
	@Override
	public void remove() {
		if (iter != null)
			list.remove(iter);
		else
			list.remove(previous);
	}
	
}
