module org.openjfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;

    opens org.openjfx to javafx.fxml;
    exports org.openjfx;
}