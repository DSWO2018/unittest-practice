package mx.iteso.ut;

/**
 * Tortilla es una clase.
 */
public class TortillaHarina implements Tortilla {

    /**
     * toasted es unaVariable.
     */
    private boolean toasted;

    /**
     * toasted es unaVariable.
     */
    private int temperature;

    /**
     * toasted es unaVariable.
     */
    private final int IniciarToasting = 20;

    /**
     * toasted es unaVariable.
     */
    private int toasting = IniciarToasting;

    /**
     * Metodo.
     * @return  Toasted.
     */
    public final boolean isToasted() {
        return false;
    }

    /**
     * Metodo.
     * @return  toasting.
     */
    public final int getToastTemperature() {
        return this.toasting;
    }

    /**
     * Metodo.
     * @return  temperature.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * metodo.
     * @param temp is a variable.
     */

    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;

    }

    /**
     * Metodo.
     * @param toastedCasa is a variable.
     */
    public final void toast(final boolean toastedCasa) {
        this.toasted = toastedCasa;

    }
}
