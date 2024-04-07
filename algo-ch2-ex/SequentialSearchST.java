class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value, Node<K,V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

public class SequentialSearchST<K, V> {
    private Node<K, V> first;
    int N;

    public V get(K key){};
}