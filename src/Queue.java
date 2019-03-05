class Queue<T> implements ImmutableQueue<T> {

    private int length;
    private Node<T> head;
    private Node<T> tail;

    private class Node<N> {
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

        Node<N> getNext() {
            return this.next;
        }
    }

    Queue() {
        this.length = 0;
    }

    private Queue(Node<T> head, Node<T> tail, int length) {
        this.head = head;
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
        } else {
            this.head = next;
        }
        this.tail = next;

        return new Queue<>(this.head, this.tail, ++this.length);
    }

    public T head() {
        if (head == null) {
            return null;
        }
        return this.head.value();
    }

    public Queue<T> deQueue() {
        return new Queue<>(this.head.getNext(), this.tail, --this.length);
    }

    public boolean isEmpty() {
        return this.length == 0;
    }
}
