module dam.appcontactosdesliza {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome5;

    opens dam.appcontactosdesliza to javafx.fxml;
    exports dam.appcontactosdesliza;
    exports dam.appcontactosdesliza.controllers;
    opens dam.appcontactosdesliza.controllers to javafx.fxml;
}