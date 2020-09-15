import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class Welcome {

    private static TextField textField;
    private static TextField textField1;

    public static TextField getTextField() {
        return textField;
    }

    public static TextField getTextField1() {
        return textField1;
    }

    public void acquaintance() throws IOException {

        Logic logic = new Logic();

        ImageView imageView = logic.createImage("src\\main\\resources\\psycho.png", 120,220,250,50);
        Button button = logic.createButton("Далее", 250, 450);
        Text text = logic.createText(20,50,180, "welcome");
        textField = logic.createTextField("Имя", 50, 250);
        textField1 = logic.createTextField("Фамилия", 50, 300);
        Stage stage = logic.createStage(text, button, textField, textField1, imageView);

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                MainClass.getStg().show();
                stage.close();
            }
        });

        stage.show();
    }

}

