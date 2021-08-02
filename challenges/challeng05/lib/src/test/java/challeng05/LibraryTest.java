package challeng05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void emptyList() {
        LinkedList testList = new LinkedList();
        assertEquals( "" , testList.toString() );
        assertEquals( null , testList.head );
    }

    @Test void propertyList() {
        LinkedList testList = new LinkedList();
        testList.insert(3);
        testList.insert(2);
        testList.insert(8);
        String resultString = "{ 8 } -> { 2 } -> { 3 } -> NULL";

        assertEquals( resultString , testList.toString() );
        /* ----   OR    ---- */
        assertEquals( 2 , testList.head.next.value );
        assertEquals( 3 , testList.head.next.next.value );
        assertEquals( null , testList.head.next.next.next );
    }

    @Test void propertyHead() {
        LinkedList testList1 = new LinkedList();
        testList1.insert(0);
        testList1.insert(2);
        testList1.insert(15);
        LinkedList testList2 = new LinkedList();
        testList2.insert(3);
        testList2.insert(2);
        testList2.insert(8);
        LinkedList testList3 = new LinkedList();
        testList3.insert(1);
        testList3.insert(9);
        testList3.insert(10);

        assertEquals( 15 , testList1.head.value );
        assertEquals( 8 , testList2.head.value );
        assertEquals( 10 , testList3.head.value );
    }

    @Test void multipleNode() {
        LinkedList testList = new LinkedList();
        testList.insert(15);
        testList.insert(70);
        testList.insert(90);
        String resultString = "{ 90 } -> { 70 } -> { 15 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void includesTest() {
        LinkedList testList = new LinkedList();
        testList.insert(15);
        assertEquals( true , testList.includes(15) );
        assertEquals( false , testList.includes(6) );
    }

    @Test void returnCollection () {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(0);
        testList.insert(9);
        String resultString = "{ 9 } -> { 0 } -> { 1 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }
}