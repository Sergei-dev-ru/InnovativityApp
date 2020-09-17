import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeTest {

    private String className;

    {
        className = "WelcomeTest";
    }

    public String getClassName(){
        return className;
    }

    @BeforeEach
    void setUp() {
        System.out.println("Code executes before each test method from " + getClassName());;
    }

    @AfterEach
    void tearDown() {
        System.out.println("Code executes after each test method from " + getClassName());
    }

    @Test
    void getTextField() {
    }

    @Test
    void getTextField1() {
    }

    @Test
    void getTextField2() {
    }

    @Test
    void getGender() {
    }

    @Test
    void getAge() {
    }

    @Test
    void acquaintance() {
    }
}