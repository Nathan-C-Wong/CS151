module edu.sjsu.cs.java_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens edu.sjsu.cs.java_fx to javafx.fxml;
    exports edu.sjsu.cs.java_fx;
}
