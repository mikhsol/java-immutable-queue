class Queue<T> implements ImmutableQueue<T> {

    private int length;
    private Node<T> tail;

    class Node<N> {
        private N value;
        private Node<N> next;

        Node(N value) {
            this.value = value;
        }

        N value() {
            return this.value;
        }

        void addNext(Node<N> n) {
            this.next = n;
        }
    }

    Queue() {
        this.length = 0;
    }

    private Queue(Node<T> tail, int length) {
        this.tail = tail;
        this.length = length;
    }

    int length() {
        return this.length;
    }

    public Queue<T> enQueue(T v) {
        Node<T> next = new Node<>(v);
        if (this.tail != null) {
            this.tail.addNext(next);
        }
        this.tail = next;
        return new Queue<>(next, ++this.length);
    }

    public T head() {
        return this.tail.value();
    }

    public Queue<T> deQueue() {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }
}
