package una.ac.cr.proyecto1_arween_granados.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import una.ac.cr.proyecto1_arween_granados.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}