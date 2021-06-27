package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField sendText;
    @FXML
    private TextArea chatText;

    public void send(ActionEvent actionEvent) {
        chatText.appendText(sendText.getText() + "\n\n");
    }
}
