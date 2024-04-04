import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Button submitButton;
    @FXML
    private TextField name;
    @FXML
    private TextField breed;
    @FXML
    private TextField numLegs;
    @FXML
    private TextField years;

    private Parent root;
    private Stage stage;
    private Scene scene;


    public void submit(ActionEvent event) throws IOException {
        FXMLLoader loader;
        try{
            loader = new FXMLLoader(getClass().getResource("Result.fxml"));
            root = loader.load();
            ResultController resController = loader.getController();
            Cat thisCat = createCats(name.getText(),breed.getText(),numLegs.getText(),years.getText());
            resController.setTextRes(thisCat.getName()+" "+thisCat.getBreed());

            //Changes scene
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Loader failed?");
        }


        System.out.println("Did this work?");

    }

    public Cat createCats(String name, String breed, String numLegs, String years){
        int legNum = Integer.parseInt(numLegs);
        int catYear = Integer.parseInt(years);
        Cat myCat = new Cat(name, breed, legNum,catYear);
        return myCat;
    }
}
