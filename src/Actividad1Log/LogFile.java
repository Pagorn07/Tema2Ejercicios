package Actividad1Log;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LogFile extends LogAbstract {

    private synchronized static void createInstance(Log log) {
        if (LogAbstract.getInstance() == null) {

        }
    }

    public void logInfo(String textToLog) {
        if (isLogInfo()) {
            writeFile(INFO_PREFIX + textToLog);
        }
    }

    public void logWarn(String textToLog) {
        if (isLogWarn()) {
            writeFile(WARN_PREFIX + textToLog);
        }

    }

    public void logError(String textToLog) {
        if (isLogError()) {
            writeFile(ERROR_PREFIX + textToLog);
        }


    }

    private void writeFile(String text) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("log.log", "UTF-8");
            writer.println(text);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
