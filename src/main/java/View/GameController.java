package View;

import javafx.fxml.FXML;
import javafx.scene.control.DialogPane;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GameController {

    @FXML
    private DialogPane ActionPane;
    @FXML
    protected void purchaseTower() {
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        ActionPane.setContentText(timeStamp + " Tower1 purchased");
    }
}