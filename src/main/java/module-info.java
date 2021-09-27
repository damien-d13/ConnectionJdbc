module fr.damien.connectionbdd {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires java.desktop;


    opens fr.damien.connectionbdd to javafx.fxml;
    exports fr.damien.connectionbdd;
}