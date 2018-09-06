/**
 * Paquete de trabajo para clases de comida.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.ut;

/**
 * Clase para preparar queso.
 */
public interface Queso {
    /**
     * Se ve el esdatdo.
     *
     * @return dice si esta derretido.
     */
     boolean isMelted();

    /**
     * Se regresa la temperatura.
     *
     * @return la temperatura.
     */
     int getCurrentTemperature();

    /**
     * Se regresa la temperatura de cocina.
     *
     * @return la temperatura de cocina.
     */
     int getMeltingTemperature();

    /**
     * Se regresa la temperatura.
     * @param temp se da la temperatura.
     */
     void setCurrentTemperature(int temp);

    /**
     * Se cocina.
     *
     * @param melted se da si esta cocinado.
     */
     void melt(boolean melted);
}
