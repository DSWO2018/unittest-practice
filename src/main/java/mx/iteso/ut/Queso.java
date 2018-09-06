package mx.iteso.ut;

/**
 * interface queso.
 *
 */
public interface Queso {
    /**
     *is melted.
     * @return     */
    boolean isMelted();
    /**
     * get current temperature.
     * @return     */
    int getCurrentTemperature();
    /**
     *get melting temperature.
     * @return     */
    int getMeltingTemperature();
    /**
     * set current temperature.
     * @param temp     */
    void setCurrentTemperature(int temp);
    /**
     * melt.
     * @param melted     */
    void melt(boolean melted);
}

