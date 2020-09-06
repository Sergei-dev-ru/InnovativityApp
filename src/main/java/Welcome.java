import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Welcome {

    private static TextField textField;
    private static TextField textField1;

    public static TextField getTextField() {
        return textField;
    }

    public static TextField getTextField1() {
        return textField1;
    }

    public void acquaintance() throws FileNotFoundException {
        FileInputStream input = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\Sergei-dev-PersonalityInnovativenessTest\\src\\main\\resources\\psycho.png");
        Image image = new Image(input, 120, 220, true, false);
        ImageView imageView = new ImageView(image);
        imageView.setX(250);
        imageView.setY(50);

        Stage stage = new Stage();
        Button button = new Button("Далее");
        button.setPrefSize(120, 35);
        button.setStyle("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        button.setLayoutX(250);
        button.setLayoutY(450);

        Text text = new Text();
        text.setText("Здравствуйте! Введите пожалуйста ваши имя и фамилию:");
        text.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
        text.setX(50);
        text.setY(180);

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                MainClass.getStg().show();
                stage.close();
            }
        });

        textField = new TextField("Имя: ");
        textField.setPrefColumnCount(30);
        textField.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        textField.setLayoutX(50);
        textField.setLayoutY(250);
        textField1 = new TextField("Фамилия: ");
        textField1.setPrefColumnCount(30);
        textField1.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        textField1.setLayoutX(50);
        textField1.setLayoutY(300);

        Group root = new Group(text, button, textField, textField1, imageView);
        stage.setTitle("Исследование инновационности личности ");
        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        stage.show();

    }

}

