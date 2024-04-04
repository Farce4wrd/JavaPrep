import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class LoginController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button signIn;
    @FXML
    private Label errorLabel;

    private FXMLLoader loader;
    private Parent root;
    private Stage stage;

    private static ArrayList<String> database = new ArrayList<String>();


    public void signIn(ActionEvent event){
        try{
            database.add("John");
            database.add("victor");
            String username = usernameField.getText();
            String password = passwordField.getText();

            for(String str: database){
                if(username.equals(str)){
                    //proceed to go to the next screen
                    root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }else{
                    errorLabel.setText("Error occured: Please try again");
                    errorLabel.setVisible(true);
                }
            }



        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
