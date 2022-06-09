package com.example.ched;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label RaspPole;

    @FXML
    private Button zapisButton;

    void zap() {

        zapisButton.setOnAction(actionEvent -> {
                try (PrintWriter out = new PrintWriter(new BufferedWriter(
                        new FileWriter("myfile.txt", true)))) {
                    out.println(RaspPole.getText());
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }

        });
    }
}