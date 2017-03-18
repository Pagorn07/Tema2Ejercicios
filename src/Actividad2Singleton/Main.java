package Actividad2Singleton;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Delegacio de responsabilitats
        LogFile.ThreadInstance();
        LogFile.ThreadInstance().setLogError(true);
        LogFile.ThreadInstance().setLogInfo(true);
        LogFile.ThreadInstance().setLogWarn(true);

        List<String> list = null;

        if (list == null) LogFile.ThreadInstance().logWarn("Lista nula");

        try {
            LogFile.ThreadInstance().logInfo("Agregamos un elemento.");
            list.add("Elemento");
        } catch (NullPointerException npe) {
            LogFile.ThreadInstance().logError(" excepcion:" + npe.getMessage());
        }

    }
}
