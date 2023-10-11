module bcs.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    opens bcs.colorchooser to javafx.fxml;
    exports bcs.colorchooser;
}
