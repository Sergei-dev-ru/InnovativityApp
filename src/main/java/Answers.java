import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Answers {

    private List<Integer> creativity;
    private List<Integer> riskForSuccess;
    private List<Integer> futureOrientation;
    private double log;

    {
        creativity = new ArrayList<>();
        riskForSuccess = new ArrayList<>();
        futureOrientation = new ArrayList<>();
    }

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

    public void result() throws IOException {

        Logic logic = new Logic();

        Text text = logic.createText(20,50,200, "creativity", scaleResult("creativity"));
        Text text1 = logic.createText(20,50,250,"riskForSuccess", scaleResult("riskForSuccess"));
        Text text2 = logic.createText(20,50,300,"futureOrientation", scaleResult("futureOrientation"));
        Text text3 = logic.createText(20,50,80, "result");

        Stage stage = logic.createStage(text, text1, text2, text3);
        stage.show();
    }

    public double scaleResult(String str){
        if(str.equals("creativity")) {
            log = 0;
            for (int i = 0; i < creativity.size(); i++) {
                log += creativity.get(i);
            }
            log = log / Double.valueOf(creativity.size());
            return log;
        }
        if(str.equals("riskForSuccess")) {
            log = 0;
            for (int i = 0; i < riskForSuccess.size(); i++) {
                log += riskForSuccess.get(i);
            }
            log = log / Double.valueOf(riskForSuccess.size());
            return log;
        }
        if(str.equals("futureOrientation")) {
            log = 0;
            for (int i = 0; i < futureOrientation.size(); i++) {
                log += futureOrientation.get(i);
            }
            log = log / Double.valueOf(futureOrientation.size());
            return log;
        }
        else return 0;
    }

}
