package mx.iteso.ut;

/**
 * queso es una clase.
 */
public interface Queso {

    /**
     * isMelted es un metodo boolean public.
     * @return  melted.
     */
     boolean isMelted();

    /**
     * getCurrentTemperature es un metodo int public.
     * @return   temperature current.
     */
     int getCurrentTemperature();

    /**
     * getMeltingTemperature es un metodo int public.
     * @return  temperature melting.
     */
     int getMeltingTemperature();

    /**
     * setCurrentTemperature es un metodo void.
     * @param temp es una variable.
     */
    void setCurrentTemperature(int temp);

    /**
     * setCurrentTemperature es un metodo void.
     * @param melted es una variable.
     */
     void melt(boolean melted);
}
