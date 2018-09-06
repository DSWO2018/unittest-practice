/**
 * Paquete de trabajo para clases de comida.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.ut;
/**
 * Clase para preparar tortillas.
 */
public interface Tortilla {
    /**
     * Se ve el estado.
     *
     * @return dice si esta tostado.
     */
    boolean isToasted();

    /**
     * Se ve el tipo de tostado.
     *
     * @return se da el nivel de tostado.
     */
    int getToastTemperature();

    /**
     * Se ve el esdatdo.
     *
     * @return se regresa la temperatura en el momento.
     */
    int getCurrentTemperature();

    /**
     * Se regresa la temperatura.
     * @param temp se da la temperatura.
     */
    void setCurrentTemperature(int temp);

    /**
     * Se ve si se quiere tostada.
     * @param toasted estado del tostado.
     */
    void toast(boolean toasted);

}
