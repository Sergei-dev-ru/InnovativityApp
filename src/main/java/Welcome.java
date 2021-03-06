import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class Welcome {

    private static TextField textField;
    private static TextField textField1;
    private static TextField textField2;
    private static String gender;
    private static int age;

    public static TextField getTextField() {
        return textField;
    }
    public static TextField getTextField1() {
        return textField1;
    }
    public static TextField getTextField2() {
        return textField2;
    }
    public static String getGender() {
        return gender;
    }
    public static int getAge() {
        return age;
    }


    public void acquaintance() throws IOException {

        Logic logic = new Logic();
        Button button = logic.createButton("Далее", 250, 450);
        textField = logic.createTextField("Имя", 50, 250);
        textField1 = logic.createTextField("Фамилия", 50, 290);
        textField2 = logic.createTextField("Возраст", 50, 330);
        Stage stage = logic.createStage(button, textField, textField1, textField2);

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                MainClass.getStg().show();
                gender = logic.genderSelected();
                try {
                    age  = Integer.parseInt(textField2.getText().substring(9));
                }
                catch (NumberFormatException e){
                    System.out.println("Введен некорректный возраст");
                }
                stage.close();
            }
        });
        stage.show();
    }

}

