import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileDecorateur extends LogDecorateur {

    private final PrintWriter printWriter;

    public FileDecorateur(Logger logger, PrintWriter printWriter) {
        super(logger);
        this.printWriter = printWriter;
    }

    public void log(String log) {
        try {
            super.log(FileLogger(log));
        } catch (FileNotFoundException e) {
            super.log(log);
            System.out.println("Pas de fichier trouvé");
        }
    }

    public String FileLogger(String log) throws FileNotFoundException {
        printWriter.println(log);
        return log;
    }
}
