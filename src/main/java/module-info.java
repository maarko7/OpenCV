module org.production.opencvwithfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires opencv;
    requires java.desktop;
    requires tess4j;

    opens org.production.opencvwithfx to javafx.fxml;
    exports org.production.opencvwithfx;
}