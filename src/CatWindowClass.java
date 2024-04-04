import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CatWindowClass extends Application {


    public static void main(String[] args){
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        try{
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Cat Maker");
            stage.show();

        }catch(Exception e){
            e.printStackTrace();
        }
//        Group root = new Group();
//        VBox box = new VBox(8);
//        Scene scene = new Scene(box, 600, 300);
//
//
//        Label labelName = new Label("Cat Name: ");
//        TextField name = new TextField();
//
//         Label labelBreed = new Label("Cat Breed:" );
//         TextField breed = new TextField();
//
//        Label labelLegs = new Label("Cat legs:" );
//        TextField numLegs = new TextField();
//
//        Label labelYears = new Label("Cat years:" );
//        TextField years = new TextField();
//
//        Text myText = new Text();
//        submitButton.setOnAction(e ->{
//            createCats(name.getText(), breed.getText(), numLegs.getText(), years.getText(), myText);
//
//        });
//
//
//        box.getChildren().addAll(labelName, name, labelBreed, breed, labelLegs, numLegs, labelYears, years, submitButton, myText);
//
//        stage.setTitle("Cat Maker");
//        stage.setScene(scene);
//        stage.show();
        //createCats(name.getText(), breed.getText(), numLegs.getText(), years.getText());

    }




}
