import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswersTest {

    private String className;
    private byte testField;

    {
        className = "AnswersTest";
    }

    public String getClassName(){
        return className;
    }

    @BeforeEach
    void setUp() {
        System.out.println("Code executes before each test method from " + getClassName());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Code executes after each test method from " + getClassName());
    }

    @Test
    void responseHandler() {
    }

    @Test
    void result() {
    }

    @Test
    void scaleResult() {
    }
}