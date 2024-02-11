import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class MyMathTestParametrized {

    private MyMath myMath;

    @BeforeEach
    public void setup() {
        myMath = new MyMath();
    }

    @AfterEach
    public void tearDown() {
        myMath = null;
    }

    @ParameterizedTest
    @DisplayName("Test de la liste avec paramètres")
    @ValueSource(ints = {0,1,2,3,4,5,6,7,8,9})
    public void testGetListParam(int index) {
        Assertions.assertNotNull(myMath.getIntegerList().get(index));
    }

    @ParameterizedTest
    @DisplayName("Test de la liste avec paramètres")
    @ValueSource(ints = {99,0,1,2,3,4,5,6,7,8,9})
    public void testGetListParamWithFail(int index) {
        Assertions.assertNotNull(myMath.getIntegerList().get(index));
    }
}