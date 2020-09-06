import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Answers {

    private List<Integer> creativity = new ArrayList<Integer>();
    private List<Integer> riskForSuccess = new ArrayList<Integer>();
    private List<Integer> futureOrientation = new ArrayList<Integer>();

    public void responseHandler(int numberQue, int button){

        switch (numberQue){
            case 4:
            case 5:
            case 8:
            case 10:
            case 13:
                creativity.add(button);
                break;
            case 3:
            case 6:
            case 11:
            case 12:
            case 14:
                riskForSuccess.add(button);
                break;
            case 1:
            case 2:
            case 7:
            case 9:
            case 15:
                futureOrientation.add(button);
                break;
        }
    }

    public void result(){

        Stage stage = new Stage();
        double j = 0;

        for(int i = 0; i < creativity.size(); i++){
            j += Double.valueOf(creativity.get(i));
        }
        j = j/Double.valueOf(creativity.size());
        Text text1 = new Text();
        text1.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        String s1 = "креативность = " + String.valueOf(j);
        text1.setText(s1);
        text1.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
        text1.setX(50);
        text1.setY(200);
        j = 0;

        for(int i = 0; i < riskForSuccess.size(); i++){
            j += Double.valueOf(riskForSuccess.get(i));
        }
        j = j/Double.valueOf(riskForSuccess.size());
        Text text2 = new Text();
        text2.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        String s2 = "риск ради успеха = " + String.valueOf(j);
        text2.setText(s2);
        text2.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
        text2.setX(50);
        text2.setY(250);
        j = 0;

        for(int i = 0; i < futureOrientation.size(); i++){
            j += Double.valueOf(futureOrientation.get(i));
        }
        j = j/Double.valueOf(futureOrientation.size());
        Text text3 = new Text();
        text3.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        String s3 = "ориентация на будующее = " + String.valueOf(j);
        text3.setText(s3);
        text3.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
        text3.setX(50);
        text3.setY(300);

        Text text = new Text();
        text.setText(Welcome.textField.getText().substring(5) + " " + Welcome.textField1.getText().substring(9) + '\n' + "Ваши результаты: ");
        text.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
        text.setX(50);
        text.setY(80);

        Group root = new Group(text, text1, text2, text3);
        stage.setTitle("Исследование инновационности личности");
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

}
