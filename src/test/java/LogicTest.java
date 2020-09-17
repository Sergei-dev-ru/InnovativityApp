import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    private String className;

    {
        className = "LogicTest";
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
    void getRb1() {
    }

    @Test
    void getRb2() {
    }

    @Test
    void createText(){
    }

    @Test
    void testCreateText() {
    }

    @Test
    void createStage() {
    }

    @Test
    void testCreateStage() {
    }

    @Test
    void testCreateStage1() {
    }

    @Test
    void createButton() {
    }

    @Test
    void setMargin() {
    }

    @Test
    void createToggleGroup() {
    }

    @Test
    void createHBox() {
    }

    @Test
    void createImage() {
    }

    @Test
    void createTextField() {
    }

    @Test
    void genderSelected() {
    }
}