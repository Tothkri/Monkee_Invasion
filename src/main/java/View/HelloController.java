package View;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML protected void onStartButtonClick() {
        welcomeText.setText("Entered game!");
        welcomeText.autosize();
    }
    @FXML protected void onExitButtonClick() { System.exit(0); }
}