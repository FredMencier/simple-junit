import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MyMathTestFactory {

    private MyMath myMath;

    @BeforeEach
    public void setup() {
        myMath = new MyMath();
    }

    @Test
    @DisplayName("Test de la liste sans TestFactory")
    public void testGetList() {
        List<Integer> integerList = myMath.getIntegerList();

        Assertions.assertNotNull(integerList.get(0));
        Assertions.assertNotNull(integerList.get(1));
        Assertions.assertNotNull(integerList.get(2));
        Assertions.assertNotNull(integerList.get(3));
    }

    @TestFactory
    @DisplayName("Test de la liste avec TestFactory")
    public Collection<DynamicTest> testGetListWithFactory() {
        List<Integer> integerList = myMath.getIntegerList();
        Collection<DynamicTest> cols = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            final int cpt = i;
            cols.add(dynamicTest("Test de l'element à l'index " + i, () -> {
                Assertions.assertNotNull(integerList.get(cpt));
            }));
        }
        return cols;
    }

    @TestFactory
    @DisplayName("Test de la liste avec TestFactory")
    public Collection<DynamicTest> testGetListWithFactory2() {
        List<Integer> integerList = myMath.getIntegerList();
        return integerList.stream().map(element -> dynamicTest("Test de l'element " + element, () -> {
                    Assertions.assertNotNull(element);
                }
        )).toList();
    }
}