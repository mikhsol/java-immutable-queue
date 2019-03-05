import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {

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
        this.q.enQueue(1);

        assertEquals(this.q.head(), 1);
        assertEquals(this.q.length(), 1);
    }

    @Test
    void testAddString() {
        this.q.enQueue("hello");

        assertEquals(this.q.head(), "hello");
        assertEquals(this.q.length(), 1);

    }
}
