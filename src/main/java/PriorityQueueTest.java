import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class PriorityQueueTest {


    private PriorityQueue pq;

    public class A{
        private int a;
        A(){

        }
    }
    private PriorityQueue<A> pq1;
    private int[] correct_array;
    @Parameters
    public static Collection getTestParameters() {
        return Arrays.asList(new Integer[][] {
                {4, 3, 1, 5, 2, 1, 2, 3, 4, 5},
                {7, 6, 9, 8, 10, 6, 7, 8, 9, 10},
                {15, 14, 13, 12, 11, 11, 12, 13, 14, 15},
                {19, 16, 17, 20, 18, 16, 17, 18, 19, 20},
                {21, 25, 24, 22, 23, 21, 22, 23, 24, 25},
        });
    }
    public PriorityQueueTest(int r1, int r2, int r3, int r4, int r5, int c1, int c2, int c3, int c4, int c5) {

        correct_array = new int[5];

        correct_array[0] = c1;
        correct_array[1] = c2;
        correct_array[2] = c3;
        correct_array[3] = c4;
        correct_array[4] = c5;

        pq = new PriorityQueue();

        pq.offer(r1);
        pq.offer(r2);
        pq.offer(r3);
        pq.offer(r4);
        pq.offer(r5);
         /*for(int i = 0; i < correct_array.length; i++)
        {
            System.out.println("correct_array: " + i + ": " + correct_array[i]);
        }*/
    }

    /* @Test(expected = NullPointerException.class)
     public void whenExceptionThrown_thenExpectationSatisfied() {
         String test = null;
         test.length();

     }*/
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void clear() {
    }

    @org.junit.Test
    public void comparator() {
    }

    @org.junit.Test
    public void iterator() {
    }

    //@org.junit.Test(expected = NullPointerException.class)
    @org.junit.Test
    public void offer() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            pq.offer(null);
        });

        pq1 = new PriorityQueue<A>();
        Assertions.assertThrows(ClassCastException.class, () -> {
            pq1.offer(new A());
        });
    }

    @org.junit.Test
    public void peek() {
    }

    @org.junit.Test
    public void poll() {
        for(int i = 0; i < correct_array.length; i++)
        {
            assertEquals(pq.poll(), correct_array[i]);
        }
    }

    @org.junit.Test
    public void remove() {
    }

    @org.junit.Test
    public void size() {
    }

    //@org.junit.Test(expected = NullPointerException.class)
    @org.junit.Test
    public void addAll() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            pq.addAll(null);
        });

    }
    @org.junit.Test
    public void findSlot() {
    }

    @org.junit.Test
    public void testRemove() {
    }

    @org.junit.Test
    public void bubbleUp() {
    }

    @org.junit.Test
    public void resize() {
    }

}