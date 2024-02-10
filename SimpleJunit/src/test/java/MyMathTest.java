import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
    public void testSum() {
        Assertions.assertEquals(6, myMath.sum(myList));
    }

    @Test
    public void testSumWithBug() {
        Assertions.assertEquals(6, myMath.sumWithBug(myList));
    }

}