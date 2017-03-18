package Actividad1Log;

public interface Log {

    void logInfo(String textToLog);

    void logWarn(String textToLog);

    void logError(String textToLog);

    void setLogError(boolean logError);

    void setLogWarn(boolean logWarn);

    void setLogInfo(boolean logInfo);
}