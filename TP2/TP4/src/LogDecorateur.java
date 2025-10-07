public class LogDecorateur implements Logger {

    protected Logger logger;

    public LogDecorateur(Logger logger) {
        this.logger = logger;
    }


    @Override
    public void log(String log) {
        this.logger.log(log);
    }

    @Override
    public String getLog() {
        return logger.getLog();
    }
}
