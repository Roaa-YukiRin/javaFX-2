/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logina;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author HP
 */
public class LogInA extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox screen = new VBox(); // pane for all
        screen.setStyle("-fx-border-color: BLACK;-fx-background-color: FFF3CD");

        BorderPane Bpane = new BorderPane(); //in first vbox
        Bpane.setPadding(new Insets(130, 67, 130, 67));//Insets(buttom, left, upo, right)
          
        Label btPlaces = new Label("Jump up \n");
        btPlaces.setPadding(new Insets(5, 20, 5, 20));
        btPlaces.setStyle("-fx-border-color: GRAY; -fx-background-color: #FFC38B");
        btPlaces.setFont(new Font(15.0));
        
        Label bt = new Label("Jump up \n c  ");
        bt.setPadding(new Insets(10, 25, 10, 25));
        bt.setStyle("-fx-border-color: GRAY; -fx-background-color: #FFC38B");
        bt.setFont(new Font(10.0));

        
        Bpane.setTop(btPlaces);      //BorderPane
        Bpane.setCenter(bt);
        screen.getChildren().add(Bpane);
        
        
        Group root = new Group(screen); //Creating a Group object
        Scene scene = new Scene(root, 242, 350); //Creating a scene object
        primaryStage.setScene(scene); //Adding scene to the stage
        primaryStage.setTitle("Screen");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
