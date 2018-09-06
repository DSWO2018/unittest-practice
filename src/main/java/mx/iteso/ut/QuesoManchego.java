package mx.iteso.ut;
/**
 * Otro tipo de queso pero no tan chingon.
 */
public class QuesoManchego implements Queso {
    /**
     * Temperatura en la que se derrite.
     */
    private final int melttemp = 20;

    /**
     * Temperatura en la que se derritio.
     */
    private boolean melted;
    /**
     * Temperatura del queso.
     */
    private int temp;
    /**
     * Temperatura del queso.
     */
    private int melting = melttemp;

    /**
     * Si esta derretido.
     * @return verdadero si lo esta
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * Obtiene la temperatura actual.
     * @return regresa el valor
     */
    public int getCurrentTemperature() {
        return this.temp;
    }

    /**
     * Obtiene el valor de derretimiento.
     * @return regresa el valor
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Pone la temperatura del queso.
     * @param tempera valor a modificar
     */
    public void setCurrentTemperature(final int tempera) {
        this.temp = tempera;
    }

    /**
     * Temperatura en la que se derrite el queso.
     * @param melteded valor a modificar
     */
    public void melt(final boolean melteded) {
        this.melted = melteded;
    }
}
