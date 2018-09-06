package mx.iteso.ut;
/**
 * Cuan ardiente esta.
 *
 * @return regresa el nivel de calor
 */
public class QuesoChihuahua implements Queso {

    /**
     * Temperatura en la que se derrite.
     */
    private final int melttemp = 20;

    /**
     * Derretido.
     */
    private boolean melted;

    /**
     * Temperatura del queso.
     */
    private int temperature;

    /**
     * Temperatura a la que se derrite.
     *
     */
    private int melting = melttemp;
    /**
     * Esta derretido.
     * @return regresa verdadero si esta derretido
     */
    public boolean isMelted() {
        return this.melted;
    }
    /**
     * La tempreratura actual.
     * @return  Regresa la temperatura
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }
    /**
     * La tempreratura a la que se derrite.
     * @return regresa un entero con el valor actual
     */
    public int getMeltingTemperature() {
        return this.melting;
    }
    /**
     * Pone la temperatura actual.
     * @param temp la temperatura requerida
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**
     * Derretir.
     * @param melteded el valor en el que se derrite el queso
     */
    public void melt(final boolean melteded) {
        this.melted = melteded;

    }
}
