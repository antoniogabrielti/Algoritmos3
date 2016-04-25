package datastructures;

/**
 * Implementa uma lista duplamente encadeada, que pode ser
 * iterada em um "for-each".
 *
 * @param <T> O tipo de dado armazenado na lista.
 */
public class ListaEncadeada<T extends Comparable<T>>
	implements java.lang.Iterable<T>
{

	private Node<T> head;
	private Node<T> tail;
        private int tam=0;

    public int getTam() {
        return tam;
    }

 
	/**
	 * Cria um iterador para a lista encadeada.
	 * 
	 */
	public IteradorListaEncadeada<T> iterator() {
		return new IteradorListaEncadeada<T>(this);
	}

	/**
	 * Retorna o primeiro elemento da lista. O metodo deve ter
	 * visibilidade de pacote, para limitar o acesso e diminuir
	 * as dependencias externas e aumentar o encapsulamento.
	 * @return
	 */
	Node<T> getHead() {
		return head;
	}

	/**
	 * Insere um elemento no fim da lista.
	 * @param dado Elemento a ser inserido no final da lista.
	 */
	public void append(T dado) {
		Node<T> novo = new Node<T>(dado);
		if (tail == null) {
			head = novo;
		} else {
			novo.setPrevious(tail);
			tail.setNext(novo);
		}
		tail = novo;
                tam++;
	}

	/**
	 * Insere um elemento no inicio da lista.
	 * @param dado Elemento a ser inserido no inicio da lista.
	 */
	public void prepend(T dado) {
		Node<T> novo = new Node<T>(dado);
		if (head == null) {
			tail = novo;
		} else {
			novo.setNext(head);
			head.setPrevious(novo);
		}
		head = novo;
                tam++;
	}

	/**
	 * Remove um no da lista.
	 * @param iter O no a ser removido.
	 */
	void remove(Node<T> iter) {
		if (iter == null)
			return;
		if (iter == tail) {
			tail = tail.getPrevious();
			tail.setNext(null);
		} else
		if (iter == head) {
			head = head.getNext();
			head.setPrevious(null);
		} else {
			Node<T> previous = iter.getPrevious();
			Node<T> next = iter.getNext();
			next.setPrevious(previous);
			previous.setNext(next);
		}
	}

}
