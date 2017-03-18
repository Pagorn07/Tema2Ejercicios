package Actividad1Log;

import java.util.List;

public class Main {
    public static Log log = new LogFile();

    public static void main(String[] args) {

        LogFile.getInstance();
        LogFile.getInstance().setLogError(true);
        LogFile.getInstance().setLogInfo(true);
        LogFile.getInstance().setLogWarn(true);

        List<String> list = null;

        if (list == null) LogFile.getInstance().logWarn("Lista nula");

        try {
            LogFile.getInstance().logInfo("Vamos a agregar un element.");
            list.add("Elemento");
        } catch (NullPointerException npe) {
            LogFile.getInstance().logError(" excepcion:" + npe.getMessage());
        }

    }
}

