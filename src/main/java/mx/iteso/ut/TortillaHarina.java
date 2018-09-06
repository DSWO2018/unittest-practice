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
    boolean toasted;
    int temperature;
    int toasting = 15;

    public final boolean isToasted() {
        return this.toasted;
    }

    public final int getCurrentTemperature() {
        return this.temperature;
    }

    public final int getToastTemperature() {
        return this.toasting;
    }

    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    public final void toast(final boolean toasted) {
        this.toasted = toasted;
    }
}