package Pages;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ApplicationMain extends Application{
    Stage window;
    Scene welcomePage, menuPage;

    @Override
    public void start(Stage primaryStage)throws Exception{

        window = primaryStage;

        //1. Welcome page
        //1.1 welcome text
        Text welcome=new Text("Welcome to");
        Text netflix=new Text("Netflix Statistix");

        //1.2 Continue button to the next page
        Button button=new Button("Continue");
        button.setOnAction(e->
            window.setScene(menuPage)
        );

        //making the homepage, made a different class for this because everything was disorganized by writing all in one class
        HomePage home = new HomePage();
        welcomePage = new Scene(home.homeLayout(welcome, netflix, button), 1200, 600);

        //2. menu page
        //2.1 Setting the text
        Text question=new Text("What do you want to do?");

        //2.2 Makes the choice buttons
        Button choice1 = new Button("Show statistics");
        choice1.setOnAction(e->
            window.setScene(welcomePage)
        );
        Button choice2 = new Button("Edit");
        choice2.setOnAction(e->
                window.setScene(welcomePage)
        );

        //2.3 Makes the menu page
        Menu menu = new Menu();
        menuPage = new Scene(menu.menuLayout(question, choice1, choice2), 1200, 600);

        //3. Statistics page, search for an account and select the account


        //5. Starts the application
        window.setScene(welcomePage);
        window.setTitle("Netflix Statistix");
        window.show();
    }
}
