module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.media;
    requires javafx.fxml;
    requires jid3lib;

    exports MB.mp3player.main to javafx.graphics;
    opens MB.mp3player.controller to javafx.fxml;
    opens MB.mp3player.mp3 to javafx.base;
}