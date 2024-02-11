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

    @AfterEach
    public void tearDown() {
        myMath = null;
    }

    @BeforeAll
    public static void tearDownAll() {
        myList.clear();
    }

    @Test
    @DisplayName("Test de la somme")
    public void testSum() {
        Assertions.assertEquals(6, myMath.sum(myList));
    }

    @Test
    @DisplayName("Test de la somme avec bug")
    public void testSumWithBug() {
        Assertions.assertEquals(6, myMath.sumWithBug(myList));
    }

    @Test
    @DisplayName("Test de la somme avec liste null")
    public void testSum2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myMath.sum2(null));
    }

}