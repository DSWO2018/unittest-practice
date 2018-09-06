package mx.iteso.ut;
/** Clase QuesoManchego.*/
public class QuesoManchego implements Queso {    /** Variable melted.*/
    private boolean melted;
    /** Variable temperature.*/
    private int temperature;
    /** Variable melting.*/
    private final int melting = 20;

    /** Funcion isMelted @return boolean.*/
    public final boolean isMelted() {
        return this.melted;
    }
    /** Funcion getCurrentTemperature @return int.*/
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /** Funcion getMeltingTemperature @return melt int.*/
    public final int getMeltingTemperature() {
        return this.melting;
    }

    /** Funcion isMelted.*/
    /**@param tempp .*/
    public final void setCurrentTemperature(final int tempp) {
        this.temperature = tempp;
    }

    /** Funcion isMelted.*/
    /**@param meltedp .*/
    public final void melt(final boolean meltedp) {
        this.melted = meltedp;
    }
}
