import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter(new File("log.txt"));
            Logger defaultLogger = new DefaultLogger();
// à compléter
            LogDecorateur logDecorateur = new DateDecorateur(new ConsoleDecorateur(new FileDecorateur(defaultLogger,printWriter)));
            logDecorateur.log("Hello World");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}