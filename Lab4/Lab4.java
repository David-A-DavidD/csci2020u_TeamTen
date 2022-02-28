import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application  {
    private StackPane root = new StackPane();
    private Stage stage;

    @Override
    public void init() {
        Button button = new Button("OPEN");
        VBox vBox = new VBox();
        //labels for java text fields
        vBox.setSpacing(8);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.getChildren().addAll(
                //label for username
                new Label("Username:"),
                new TextField(),
                //label for password
                new Label("Password:"),
                new PasswordField(),
                //label for new name
                new Label("Full Name"),
                new TextField(),
                //label for email
                new Label("E-Mail:"),
                new PasswordField(),
                //label for phone number
                new Label("Phone #:"),
                new PasswordField(),
                //label for date of birth
                new Label("Date of Birth:"),
                new PasswordField(),
                //button to register
                new Button("REGISTER"));
        root.getChildren().addAll(vBox);

        button.setOnAction(actionEvent-> {
            if(stage!=null){
                stage.requestFocus();
                return;
            }
            stage = new Stage();
            StackPane stackPane = new StackPane();
            stage.setScene(new Scene(stackPane, 200,200));
            stage.show();
        });
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root,400,600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("lab04");
        primaryStage.setAlwaysOnTop(true);
    }


    public static void main(String[] args) {
        launch(args);
    }
}   

