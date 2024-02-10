import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

class MyMathTest {

    private MyMath myMath;

    private static List<Integer> myList;

    @BeforeAll
    public static void setupAll() {
        myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
    }

    @BeforeEach
    public void setup() {
        myMath = new MyMath();
    }

    @Test
    @DisplayName("Test de la somme")
    public void testSum() {
        Assertions.assertEquals(6, myMath.sum(myList));
    }

    @Test
    public void testSumWithBug() {
        Assertions.assertEquals(6, myMath.sumWithBug(myList));
    }

}