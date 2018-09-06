package mx.iteso.ut;

/**
 * class queso chihuaua.
 */
public class QuesoChihuahua implements Queso {
    /**
     * boolean melted.
     */
    private boolean melted;
    /**
     * int temperature.
     */
    private int temperature;
    /**
     * number 20.
     */
    private final int max20 = 20;
    /**
     * int melting.
     */
   private int melting = max20;

    /**
     * is melted.
     * @return     */

    public final boolean isMelted() {
        return this.melted;
    }

    /**
     * get current temp.
     * @return     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * get melting temp.
     * @return     */
    public final int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * set current temp.
     * @param temp     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * melt.
     * @param meltedd     */
    public final void melt(final boolean meltedd) {
        this.melted = meltedd;

    }
}
