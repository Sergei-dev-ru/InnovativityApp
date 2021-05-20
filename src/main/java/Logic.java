import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;


public class Logic {

    private BufferedReader reader;
    private RadioButton rb1;
    private RadioButton rb2;

    {
        try {
            reader  = new BufferedReader(new FileReader("src\\main\\resources\\Questions.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public RadioButton getRb1() {
        return rb1;
    }

    public RadioButton getRb2() {
        return rb2;
    }

    public Text createText(int size, int x, int y, String str) throws IOException {
        Text text = new Text();
        if(str.equals("welcome")) {
            text.setText("Здравствуйте! Введите пожалуйста ваши имя и фамилию:");
        }
        if(str.equals("result")){
            text.setText(Welcome.getTextField().getText().substring(5) + " " + Welcome.getTextField1().getText().substring(9) + '\n' + "Ваши результаты: ");
        }
        if(str.equals("go")){
            text.setText(reader.readLine());
            reader.close();
        }
        if(str.equals("Пол:")) {
            text.setText("Пол:");
        }
        text.setFont(Font.font("Calibri", FontWeight.NORMAL, size));
        text.setX(x);
        text.setY(y);
        return text;
    }

    public Text createText(int size, int x, int y, String str, double d) throws IOException {
        Text text = new Text();
        if(str.equals("creativity")){
            text.setText("Креативность = " + d);
        }
        if(str.equals("riskForSuccess")){
            text.setText("Риск ради успеха = " + d);
        }
        if(str.equals("futureOrientation")){
            text.setText("Ориентация на будующее = " + d);
        }
        text.setFont(Font.font("Calibri", FontWeight.NORMAL, size));
        text.setX(x);
        text.setY(y);
        return text;
    }

    public Stage createStage(Button button, Text text, Text text1, Text text2, Text text3){
        Group root = new Group(button, text, text1, text2, text3);
        Stage stage = new Stage();
        stage.setTitle("Исследование инновационности личности");
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        return stage;
    }

    public Stage createStage(Button button, TextField textField1, TextField textField2, TextField textField3) throws IOException {
        Stage stage = new Stage();
        ImageView imageView = createImage("src\\main\\resources\\psycho.png", 120,220,250,50);
        HBox hBox = createHBox();
        Text text = createText(15,60,382, "Пол:");
        Text text1 = createText(20,50,180, "welcome");
        Group root1 = new Group(text, text1, button, textField1, textField2, textField3, imageView, hBox);
        stage.setTitle("Исследование инновационности личности ");
        Scene scene = new Scene(root1, 600, 600);
        stage.setScene(scene);
        return stage;
    }

    public Stage createStage(Stage primaryStage, Text text, VBox vBox, Button button){
        primaryStage = new Stage();
        Group root1 = new Group(text, vBox, button);
        primaryStage.setTitle("Исследование инновационности личности");
        Scene scene = new Scene(root1, 800, 600);
        primaryStage.setScene(scene);
        return primaryStage;
    }

    public Button createButton(String str, int x, int y){
        Button button = new Button(str);
        button.setPrefSize(100, 35);
        button.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        button.setLayoutX(x);
        button.setLayoutY(y);
        return button;
    }

    public void setMargin(RadioButton rb[]){
        for(int i = 0; i < rb.length; i++){
            if(i == 0){
                VBox.setMargin(rb[i], new Insets(150, 10, 5, 20));
            } else {
                VBox.setMargin(rb[i], new Insets(5, 10, 5, 20));
            }
        }
    }

    public ToggleGroup createToggleGroup(RadioButton rb1, RadioButton rb2, RadioButton rb3, RadioButton rb4, RadioButton rb5, RadioButton rb6){
        ToggleGroup radioGroup = new ToggleGroup();
        rb6.setToggleGroup(radioGroup);
        rb5.setToggleGroup(radioGroup);
        rb4.setToggleGroup(radioGroup);
        rb3.setToggleGroup(radioGroup);
        rb2.setToggleGroup(radioGroup);
        rb1.setToggleGroup(radioGroup);
        return  radioGroup;
    }

    public HBox createHBox(){
        rb1 = new RadioButton("М");
        rb2 = new RadioButton("Ж");
        ToggleGroup radioGroup = new ToggleGroup();
        rb1.setToggleGroup(radioGroup);
        rb2.setToggleGroup(radioGroup);
        HBox hBox = new HBox(5, rb1, rb2);
        hBox.setLayoutX(100);
        hBox.setLayoutY(370);
        return  hBox;
    }

    public ImageView createImage(String str, int rW, int rH, int x, int y) throws FileNotFoundException {
        FileInputStream input = new FileInputStream(str);
        Image image = new Image(input, rW, rH, true, false);
        ImageView imageView = new ImageView(image);
        imageView.setX(x);
        imageView.setY(y);
        return imageView;
    }

    public TextField createTextField(String str, int x, int y){
        TextField textField = new TextField(str + ": ");
        textField.setPrefColumnCount(30);
        textField.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        textField.setLayoutX(x);
        textField.setLayoutY(y);
        return textField;
    }

    public String genderSelected(){
        if(getRb1().isSelected()){
            return "М";
        }
        if(getRb2().isSelected()){
            return "Ж";
        }
        else {
            return "none";
        }
    }
}
