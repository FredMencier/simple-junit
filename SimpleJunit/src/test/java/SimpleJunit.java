import org.junit.jupiter.api.*;

public class SimpleJunit {

    @BeforeAll
    public static void setupAll() {
        System.out.println("Settings avant tous les tests");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Settings avant chaque test");
    }

    @AfterEach
    public void clean() {
        System.out.println("Clean après chaque test");
    }

    @AfterAll
    public static void cleanAll() {
        System.out.println("Clean après tous les tests");
    }

    @Test
    public void firstTest() {
        System.out.println("Mon premier test");
    }

    @Test
    public void secondTest() {
        System.out.println("Mon second test");
    }
}
