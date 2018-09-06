package mx.iteso.ut;

/**
 * es una clase.
 */
public class QuesoChihuahua implements Queso {

    /**
     * melted es una variable boolean.
     */
   private boolean melted;

    /**
     * temperature es una variable int.
     */
    private int temperature;

    /**
     * Iniciomelting es una variable int.
     */
    private final int Iniciomelting = 20;

    /**
     * melting es unavariable.
     */
    private int melting = Iniciomelting;

    /**
     * Metodo.
     * @return  regresa  melted.
     */
    public final boolean isMelted() {
        return this.melted;
    }

    /**
     * Metodo.
     * @return regresa temperature.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }
    /**
     * Metodo.
     * @return regresa melting.
     */
    public final int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Metodo.
     * @param temp es una variable final entera.
     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Metodo.
     * @param meltedCASA es una  variable final boolean.
     */
    public final void melt(final boolean meltedCASA) {
        this.melted = meltedCASA;

    }
}
