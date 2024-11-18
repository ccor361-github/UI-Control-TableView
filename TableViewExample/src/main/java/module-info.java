module es.ieslosmontecillos.tableviewexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tableviewexample to javafx.fxml;
    exports es.ieslosmontecillos.tableviewexample;
}