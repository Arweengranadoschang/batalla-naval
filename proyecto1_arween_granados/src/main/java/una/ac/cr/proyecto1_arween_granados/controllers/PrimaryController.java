package una.ac.cr.proyecto1_arween_granados.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import una.ac.cr.proyecto1_arween_granados.App;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
