import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MyMathTestWithOrder {

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
    @Order(2)
    @DisplayName("Test de la somme")
    public void testSum() {
        Assertions.assertEquals(6, myMath.sum(myList));
    }

    @Test
    @Order(1)
    @DisplayName("Test de la somme avec bug")
    public void testSumWithBug() {
        Assertions.assertEquals(6, myMath.sumWithBug(myList));
    }

    @Test
    @Order(3)
    @DisplayName("Test de la somme avec liste null")
    public void testSum2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myMath.sum2(null));
    }
}