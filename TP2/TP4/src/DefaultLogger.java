import java.util.ResourceBundle;

public class DefaultLogger implements Logger {
    private String log;


    public DefaultLogger() {
        this.log = "";
    }

    @Override
    public void log(String message) {
        log+=message;
    }

    @Override
    public String getLog() {
        return log;
    }
}
