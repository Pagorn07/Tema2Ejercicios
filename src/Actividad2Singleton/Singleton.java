package Actividad2Singleton;

public class Singleton {

    private static Singleton instancia = new Singleton();

    public static Singleton getInstance() {
        if (instancia == null) createInstance();
        return instancia;
    }

    private synchronized static void createInstance(){
        if (instancia == null){
            instancia = new Singleton();
        }
    }
}

