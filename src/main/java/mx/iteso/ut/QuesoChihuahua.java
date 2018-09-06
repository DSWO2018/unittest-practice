/**
 * Paquete de trabajo para clases de comida.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.ut;
/**
 * Clase para preparar queso chihuahua.
 */
public class QuesoChihuahua implements Queso {
    /**
     * Variable para cocinado.
     */
    boolean melted;
    /**
     * Variable para temperatura.
     */
    int temperature;
    /**
     * Variable para nivel de cocinado
     */
    int melting = 20;
    /**
     * Para saber si esta cocinado.
     *
     * @return se regresa un boleano para saber el estado del queso.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * Se optiene la temperatura en el momento.
     *
     * @return el nivel de temperatura.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Se optiene la temperatura de cocinado
     *
     * @return nivel de temperatura.
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * se le da la temperatura
     *
     * @param  temp nueva temperatura a poner
     */
    public void setCurrentTemperature(int temp) {
        this.temperature = temp;
    }

    /**
     * Se prepara la quesadilla.
     *
     * @param  melted se cocina el queso chihuahua.
     */
    public void melt(boolean melted) {
        this.melted = melted;

    }
}
