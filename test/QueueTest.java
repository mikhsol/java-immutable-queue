import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueTest {

    private Queue q;

    @BeforeEach
    void setUp() {
        this.q = new Queue();
    }

    @Test
    void testNewQueueZeroLength() {
        assertEquals(this.q.length(), 0);
    }

    @Test
    void testAddInt() {
        Queue q = this.q.enQueue(1);

        assertEquals(q.head(), 1);
        assertEquals(q.length(), 1);
    }

    @Test
    void testAddString() {
        Queue q = this.q.enQueue("hello");

        assertEquals(q.head(), "hello");
        assertEquals(q.length(), 1);

    }
}
