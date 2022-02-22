package dam.appcontactosdesliza.controllers;

import dam.appcontactosdesliza.controllers.model.Person;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import org.kordamp.ikonli.javafx.FontIcon;

import java.util.*;

public class ContactListController {

    private TranslateTransition detailBoxTransition;

    private List<Person> personList;

    @FXML
    StackPane contactView;
    @FXML
    FontIcon backContactsButton,viewDetailButton,backDetailButton;

    @FXML
    VBox contactListBox,detailBox;

    @FXML
    ListView<Person> personListView;

    @FXML
    Label subLabelName, subLabelSurName, subLabelAge, subLabelGender ,subLabelNationality, subLabelEmail, subLabelTelephone;
    @FXML
    ImageView personPhoto;

    @FXML
    protected void initialize(){
        Person p1 = new Person("Person1","SurName1",33,"Male","Argentino","pijqgq@arg.com","912412412");
        Person p2 = new Person("Person2","SurName2",44,"Female","Español","ghagdq2@arg.com","9124124214");
        Person p3 = new Person("Person3","SurName3",55,"Male","Argentino","gfagf2@arg.com","5123521412");
        Person p4 = new Person("Person4","SurName4",66,"Male","Cubano","fdgfg1@arg.com","636361414");
        Person p5 = new Person("Person5","SurName5",77,"Male","Mexicano","tyqqw@arg.com","51515512");
        Person p6 = new Person("Person6","SurName6",22,"Female","Frances","asdf455@arg.com","5353154767");
        Person p7 = new Person("Person7","SurName7",88,"Male","Aleman","argdsd@arg.com","5891078124");
        Person p8 = new Person("Person8","SurName8",99,"Female","Poloca","ds1@arg.com","5181728423");
        personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(p7);
        personList.add(p8);
        personListView.setItems(FXCollections.observableList(personList));
        personListView.getSelectionModel().select(0);
        detailBoxTransition = new TranslateTransition(Duration.millis(200),detailBox);
    }

    @FXML
    protected void hideContactList(){
        contactListBox.setVisible(false);
        contactListBox.setDisable(true);
        contactView.setVisible(false);
        contactView.setDisable(true);
        contactView.toBack();
    }

    @FXML
    protected void hideDetailView(){
        detailBox.setVisible(false);
        detailBox.setDisable(true);
        detailBoxTransition.setFromX(0);
        detailBoxTransition.setToX(360);
        detailBoxTransition.play();
        contactListBox.setVisible(true);
        contactListBox.setDisable(false);
    }

    @FXML
    protected void viewPersonDetail(){
        Person p = personListView.getSelectionModel().getSelectedItem();
        detailBox.setVisible(true);
        detailBox.setDisable(false);
        contactListBox.setVisible(false);
        contactListBox.setDisable(true);
        subLabelName.setText(p.getName());
        subLabelSurName.setText(p.getSurName());
        subLabelAge.setText(String.valueOf(p.getAge()));
        subLabelGender.setText(p.getGender());
        subLabelNationality.setText(p.getNationality());
        subLabelEmail.setText(p.getEmail());
        subLabelTelephone.setText(p.getTelephone());
        detailBoxTransition.setFromX(360);
        detailBoxTransition.setToX(0);
        detailBoxTransition.play();
    }
}
