package Pages;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Menu {

    public VBox menuLayout(Text question, Button choice1, Button choice2){



        question.setFont(Font.font("Verdana",30));
        question.setFill(Color.BLACK);

        VBox layout = new VBox();
        layout.getChildren().addAll(question, choice1, choice2);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(30);

        return layout;
    }
}
