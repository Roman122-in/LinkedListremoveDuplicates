import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

        import java.util.ArrayList;

public class MainTest {

    @Test
    public void testDuplicateIsRemoved() {

        Main.ListNode node1 = new Main.ListNode(1);
        Main.ListNode node2 = new Main.ListNode(2);
        Main.ListNode node3 = new Main.ListNode(2);
        Main.ListNode node4 = new Main.ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Main.ListNode result = Main.removeElements(node1);


        ArrayList<Integer> actual = Main.methodToArrayList(result);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        assertEquals(expected, actual);
    }
}
