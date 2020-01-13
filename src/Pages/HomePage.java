package Pages;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class HomePage {

    public VBox homeLayout(Text welcome, Text netflix, Button button){

        welcome.setFont(Font.font("Verdana",30));
        welcome.setFill(Color.BLACK);

        //source netflix font: https://freebies.fluxes.com/blog/free-fonts-from-famous-brands-and-logos/
        netflix.setFont(Font.loadFont("file:resources/fonts/NetflixFont.otf",80));
        netflix.setFill(Color.RED);

        VBox layout = new VBox();
        layout.getChildren().addAll(welcome, netflix, button);
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
