package mx.iteso.ut;

/**
 * Se crea la quesadillita.
 *
 * @return  regresa un string de que tan ricolina esta la quesadilla.
 */
public interface Queso {
    /**
     * Esta derretida.
     *
     * @return  regresa verdadero si el queso esta derretido.
     */
    boolean isMelted();

    /**
     * Temperatura actual.
     *
     * @return  regresa la temperatura actual.
     */
    int getCurrentTemperature();

    /**
     * Temperatura de derretimiento.
     *
     * @return  regresa la temperatura en la que se derrite.
     */
    int getMeltingTemperature();

    /**
     * Pone la temperatura.
     *
     * @param temp pone la temperatura.
     */
    void setCurrentTemperature(int temp);

    /**
     * Derrite.
     *
     * @param melted la cantidad en la que se derrite.
     */
    void melt(boolean melted);
}
