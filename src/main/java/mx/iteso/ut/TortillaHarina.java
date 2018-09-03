package mx.iteso.ut;
/**
 * Clase.
 */
public class TortillaHarina implements Tortilla {

    /**
     * Variable.
     */
    private boolean toasted;

    /**
     * Variable.
     */
    private int temperature;

    /**
     * Variable.
     */
    private final int valorInicialDeToasting = 20;

    /**
     * Variable.
     */
    private int toasting = valorInicialDeToasting;

    /**
     * Metodo.
     * @return el valor de toasted.
     */
    public final boolean isToasted() {
        return this.toasted;
    }

    /**
     * Metodo.
     * @return el valor de toasting temp.
     */
    public final int getToastTemperature() {
        return this.toasting;
    }

    /**
     * Metodo.
     * @return el valor de temperature.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Metodo.
     * @param temp is a variable.
     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Metodo.
     * @param toastedLocal is a variable.
     */
    public final void toast(final boolean toastedLocal) {
        this.toasted = toasted;
    }
}
