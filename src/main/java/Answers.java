import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Answers {

    private List<Integer> creativity;
    private List<Integer> riskForSuccess;
    private List<Integer> futureOrientation;
    private BufferedWriter writer;
    private double log;
    private double cRes;
    private double rRes;
    private double fRes;

    {
        try {
            writer = new BufferedWriter(new FileWriter("src\\main\\resources\\Output.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
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

        Button button = logic.createButton("Завершить", 660, 530);
        scaleResult("creativity");
        scaleResult("riskForSuccess");
        scaleResult("futureOrientation");
        Text text = logic.createText(20,50,200, "creativity", cRes);
        Text text1 = logic.createText(20,50,250,"riskForSuccess", rRes);
        Text text2 = logic.createText(20,50,300,"futureOrientation", fRes);
        Text text3 = logic.createText(20,50,80, "result");
        writer.write(String.valueOf(cRes + "\n" + rRes + "\n" + fRes + "\n" + (cRes + rRes + fRes)/3));
        writer.close();
        Stage stage = logic.createStage(button, text, text1, text2, text3);
        stage.show();
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    LogicDB logicDB = new LogicDB();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage.close();
            }
        });
    }

    public void scaleResult(String str){
        if(str.equals("creativity")) {
            log = 0;
            for (int i = 0; i < creativity.size(); i++) {
                log += creativity.get(i);
            }
            cRes = log / Double.valueOf(creativity.size());
        }
        if(str.equals("riskForSuccess")) {
            log = 0;
            for (int i = 0; i < riskForSuccess.size(); i++) {
                log += riskForSuccess.get(i);
            }
            rRes = log / Double.valueOf(riskForSuccess.size());
        }
        if(str.equals("futureOrientation")) {
            log = 0;
            for (int i = 0; i < futureOrientation.size(); i++) {
                log += futureOrientation.get(i);
            }
            fRes = log / Double.valueOf(futureOrientation.size());
        }
    }

}
