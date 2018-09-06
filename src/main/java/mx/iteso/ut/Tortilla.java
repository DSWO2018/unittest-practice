/**
 * Paquete de trabajo para clases de comida.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.ut;

public interface Tortilla {
    public boolean isToasted();

    public int getToastTemperature();

    public int getCurrentTemperature();

    public void setCurrentTemperature(int temp);

    public void toast(boolean toasted);

}
