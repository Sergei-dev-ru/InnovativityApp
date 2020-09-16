import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;

public class MainClass extends Application  {

    private static Stage stg;
    private int numberQue;
    private Welcome welcome;
    private Answers answers;
    private BufferedReader reader;

    {
        welcome = new Welcome();
        answers = new Answers();
        numberQue = 0;
        try {
            reader  = new BufferedReader(new FileReader("src\\main\\resources\\radioButtonName.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Stage getStg() {
        return stg;
    }

    public static void main(String[] args) throws Exception{
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Logic logic = new Logic();
        welcome.acquaintance();

        Text text = logic.createText(20,30,80, "go");

        Button button = logic.createButton("Далее", 660, 530);
        RadioButton[] rb = new RadioButton[5];
        for(int i = 0; i < rb.length; i++){
            rb[i] = new RadioButton(reader.readLine());
        }
        ToggleGroup radioGroup = logic.createToggleGroup(rb[4], rb[3], rb[2], rb[1], rb[0]);
        logic.setMargin(rb);
        VBox vBox = new VBox(10, rb[0], rb[1], rb[2], rb[3], rb[4]);
        vBox.setAlignment(Pos.CENTER_LEFT);

        reader = new BufferedReader(new FileReader("src\\main\\resources\\Questions.txt"));

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (rb[0].isSelected()) {
                    numberQue++;
                    answers.responseHandler(numberQue, 1);
                } else if (rb[1].isSelected()) {
                    numberQue++;
                    answers.responseHandler(numberQue, 2);
                } else if (rb[2].isSelected()) {
                    numberQue++;
                    answers.responseHandler(numberQue, 3);
                } else if (rb[3].isSelected()) {
                    numberQue++;
                    answers.responseHandler(numberQue, 4);
                } else if (rb[4].isSelected()) {
                    numberQue++;
                    answers.responseHandler(numberQue, 5);
                }
                if (numberQue > 15){
                    stg.close();
                    try {
                        answers.result();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    text.setText(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        stg = logic.createStage(primaryStage, text, vBox, button);
    }
}
