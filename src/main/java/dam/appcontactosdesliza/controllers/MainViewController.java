package dam.appcontactosdesliza.controllers;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import org.kordamp.ikonli.javafx.FontIcon;

public class MainViewController {
    @FXML
    StackPane main_view,contact_list_include;
    @FXML
    FontIcon menudisplayer;
    @FXML
    VBox menusidebar;

    @FXML
    protected void initialize(){

    }
    @FXML
    protected void onContactListDisplay() {
        onMenuDisplayerClick();
        contact_list_include.setVisible(true);
        contact_list_include.setDisable(false);
        contact_list_include.toFront();
    }
    @FXML
    protected void onMenuDisplayerClick() {
        TranslateTransition menuTransition = new TranslateTransition(Duration.millis(200),menusidebar);
        TranslateTransition buttonTransition = new TranslateTransition(Duration.millis(200),menudisplayer);
        if(menusidebar.getTranslateX()==-140){
            menuTransition.setFromX(-140);
            menuTransition.setToX(0);

            buttonTransition.setFromX(0);
            buttonTransition.setToX(140);
        } else{
            menuTransition.setFromX(0);
            menuTransition.setToX(-140);

            buttonTransition.setFromX(120);
            buttonTransition.setToX(0);
        }
        menuTransition.play();
        buttonTransition.play();

    }
}