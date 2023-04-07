import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class testJUNITTest {

    testJUNIT example;

    @BeforeEach
    void setUp() {
        example = new testJUNIT();
    }


    @Test
    void getName() {
        assertEquals("Steve", example.getName(),"Get name method crashed.");

    }

    @Test
    void getAge(){
        assertEquals(25, example.getAge(), "Mid age");
    }

    @AfterEach
    void tearDown() {
    }

}