package mx.iteso.ut;
/**
 * Queso es una clase.
 */
public class QuesoManchego implements Queso {

    /**
     *  es una variable.
     */
    private boolean melted;

    /**
     * temperature es una variable.
     */
    private int temperature;

    /**
     *IniciarMelting es una variable.
     */
    private final int IniciarMelting = 20;

    /**
     *melting es una variable.
     */
    private int melting = IniciarMelting;

    /**
     * Metodo.
     * @return el melted.
     */
    public final boolean isMelted() {
        return this.melted;
    }

    /**
     * Metodo.
     * @return el temperature.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Metodo.
     * @return el meldting curr.
     */
    public final int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Metodo.
     * @param temp is a variable.
     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;

    }

    /**
     * Metodo.
     * @param meltedCasa is a variable.
     */
    public final void melt(final boolean meltedCasa) {
        this.melted = meltedCasa;
    }
}
