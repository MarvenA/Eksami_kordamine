package FX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista ring, mille suurust saab kasutaja Slideriga muuta
 */

public class JavaFX_ring extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 280, 350);
        primaryStage.setScene(scene);

        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> System.exit(0));

        Label label = new Label("Muuda ringi raadiust.");
        Slider slider = new Slider();

        slider.setMin(0);
        slider.setMax(120);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(20);
        slider.setMinorTickCount(5);

        Circle c = new Circle(20);
        c.setFill(Color.CORNFLOWERBLUE);
        vbox.getChildren().addAll(label, slider, c);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(15);

        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            c.setRadius((Double) newValue);
        });

    }
}
