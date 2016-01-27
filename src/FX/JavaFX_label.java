package FX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.*;

/**
 * Label, mille sisu saab kasutaja muuta.
 */
public class JavaFX_label extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 300, 300);
        primaryStage.setScene(scene);

        Label label = new Label("Kirjuta midagi...");
        label.setFont(Font.font(15));
        TextField kasutajaInput = new TextField();
        kasutajaInput.setPromptText("Kirjuta labeli uus väärtus");
        Button nupp = new Button("Muuda");
        Label label_uus = new Label("Muuda labeli sisu...");
        label_uus.setFont(Font.font(15));
        label_uus.setTextFill(BLUE);
        label_uus.setWrapText(true);

        vbox.getChildren().addAll(label, kasutajaInput, nupp, label_uus);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        nupp.setOnAction(event1 -> {
            label_uus.setText(kasutajaInput.getText());
            kasutajaInput.clear();
        });
        kasutajaInput.setOnAction(event1 -> {
            label_uus.setText(kasutajaInput.getText());
            kasutajaInput.clear();
        });

        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> System.exit(0));
    }
}
