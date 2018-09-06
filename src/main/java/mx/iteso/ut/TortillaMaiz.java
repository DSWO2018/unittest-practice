
/**
 * Paquete de trabajo para clases de comida.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.ut;
/**
 * Clase para preparar TortillaMaiz.
 */
public class TortillaMaiz implements Tortilla {
    boolean toasted;
    int temperature;
    int toasting = 20;

    public final boolean isToasted() {
        return this.toasted;
    }

    public final int getToastTemperature() {
        return this.toasting;
    }

    public final int getCurrentTemperature() {
        return this.temperature;
    }

    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    public final void toast(final boolean toasted) {
        this.toasted = toasted;
    }
}