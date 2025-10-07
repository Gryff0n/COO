import java.time.LocalDateTime;

public class DateDecorateur extends LogDecorateur {

    public DateDecorateur(Logger logger) {
        super(logger);
    }

    public void log(String log) {
        super.log(AjouterDate(log));
    }

    public String AjouterDate(String log) {
        LocalDateTime maintenant= LocalDateTime.now();
        return (maintenant.getDayOfMonth() + " " + maintenant.getMonthValue() + " "+ maintenant.getYear() + " "+ maintenant .getHour()+" "+maintenant.getMinute()+ " - "+log);
    }
}
