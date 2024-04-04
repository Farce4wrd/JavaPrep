import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ResultController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextArea results;

    @FXML
    public void startAgain(ActionEvent e){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @FXML
    public void setTextRes(String result){
        results.setText(result);
    }
}
