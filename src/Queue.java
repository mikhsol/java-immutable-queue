class Queue<T> {

    private int length;
    private Node<T> tail;

    class Node<T> {
        private T value;
        private Node next;

        Node(T value) {
            this.value = value;
        }

        T value() {
            return this.value;
        }

        void addNext(Node<T> n) {
            this.next = n;
        }
    }

    Queue() {
        this.length = 0;
    }

    Queue(Node tail, int length) {
        this.tail = tail;
        this.length = length;
    }

    int length() {
        return this.length;
    }

    Queue<T> enQueue(T v) {
        Node next = new Node(v);
        if (this.tail != null) {
            this.tail.addNext(next);
        }
        this.tail = next;
        return new Queue<T>(next, this.length++);
    }

    T head() {
        return this.tail.value();
    }
}
