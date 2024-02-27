import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMainPane extends VBox {

    private Button buttonHello;
    private Button buttonHowdy;
    private Button buttonChinese;
    private Button buttonClear;
    private Button buttonExit;
    private Label labelFeedback;
    private TextField textFieldInput;

    private DataManager dataManager;

    FXMainPane() {
        // Instantiate buttons, label, and textfield
        buttonHello = new Button("Hello");
        buttonHowdy = new Button("Howdy");
        buttonChinese = new Button("Chinese");
        buttonClear = new Button("Clear");
        buttonExit = new Button("Exit");
        labelFeedback = new Label("Feedback:");
        textFieldInput = new TextField();

        // Instantiate DataManager
        dataManager = new DataManager();

        // Instantiate HBoxes
        HBox buttonBox = new HBox(buttonHello, buttonHowdy, buttonChinese, buttonClear, buttonExit);
        HBox labelBox = new HBox(labelFeedback, textFieldInput);

        // Add components to this VBox
        getChildren().addAll(labelBox, buttonBox);

        // Set margins and alignment of the components
        setMargin(labelBox, new Insets(10));
        setMargin(buttonBox, new Insets(10));
        setAlignment(Pos.CENTER);

        // Set actions for buttons
        buttonHello.setOnAction(new ButtonHandler());
        buttonHowdy.setOnAction(new ButtonHandler());
        buttonChinese.setOnAction(new ButtonHandler());
        buttonClear.setOnAction(new ButtonHandler());
        buttonExit.setOnAction(new ButtonHandler());
    }

    // Inner class to handle button clicks
    private class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == buttonHello) {
                textFieldInput.setText(dataManager.getHello());
            } else if (event.getSource() == buttonHowdy) {
                textFieldInput.setText(dataManager.getHowdy());
            } else if (event.getSource() == buttonChinese) {
                textFieldInput.setText(dataManager.getChinese());
            } else if (event.getSource() == buttonClear) {
                textFieldInput.setText("");
            } else if (event.getSource() == buttonExit) {
                javafx.application.Platform.exit();
                System.exit(0);
            }
        }
    }
}
