/**
 * Paquete de trabajo para clases de comida.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.ut;
/**
 * Clase para preparar QuesoManchego.
 */
public class QuesoManchego implements Queso {
    /**
     * Variable para cocinado.
     */
    private boolean melted;
    /**
     * Variable para temperatura.
     */
    private int temperature;
    /**
     * Variable para nivel de cocinado.
     */
    private final int melting = 18;
    /**
     * Para saber si esta cocinado.
     *
     * @return se regresa un boleano para saber el estado del queso.
     */
    public final boolean isMelted() {
        return this.melted;
    }

    /**
     * Se optiene la temperatura en el momento.
     *
     * @return el nivel de temperatura.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Se optiene la temperatura de cocinado.
     *
     * @return nivel de temperatura.
     */
    public final int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * se le da la temperatura.
     *
     * @param  temp nueva temperatura a poner.
     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Se prepara la quesadilla.
     *
     * @param  meltedV se cocina el queso chihuahua.
     */
    public final void melt(final boolean meltedV) {
        this.melted = meltedV;

    }
}
