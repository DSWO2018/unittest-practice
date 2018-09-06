/**
 * Paquete de trabajo para clases de comida.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.ut;
/**
 * Clase para preparar TortillaHarina.
 */
public class TortillaHarina implements Tortilla {


    /**
     * Variable para tostado.
     */
    private boolean toasted;
    /**
     * Variable para temperatura.
     */
    private int temperature;
    /**
     * Variable para nivel de tostado.
     */
    private final int toasting = 15;
    /**
     * Se ve el tipo de tostado.
     *
     * @return se da el nivel de tostado.
     */
    public final boolean isToasted() {
        return this.toasted;
    }
    /**
     * Se ve el esdatdo.
     *
     * @return se regresa la temperatura en el momento.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }
    /**
     * Se ve el tipo de tostado.
     *
     * @return se da el nivel de tostado.
     */
    public final int getToastTemperature() {
        return this.toasting;
    }
    /**
     * Se regresa la temperatura.
     * @param temp se da la temperatura.
     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**
     * Se ve si se quiere tostada.
     * @param toastedv estado del tostado.
     */
    public final void toast(final boolean toastedv) {
        this.toasted = toastedv;
    }
}
