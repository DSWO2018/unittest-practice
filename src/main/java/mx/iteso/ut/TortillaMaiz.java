package mx.iteso.ut;
/**
 * es una clase.
 */
public class TortillaMaiz implements Tortilla {

    /**
     * toasted es una variable private boolean.
     */
    private boolean toasted;

    /**
     * temperature es una variable private int.
     */
    private int temperature;
 
    /**
     * IniciarToasting es una variable private final int.
     */
    private final int IniciarToasting = 20;

    /**
     * InicioToasting es una variable private int.
     */
    private int toasting = IniciarToasting;

    /**
     * Metodo.
     * @return regresa valor toasted.
     */
    public final boolean isToasted() {
        return this.toasted;
    }

    /**
     * Metodo.
     * @return regresa valor toasting.
     */
    public final int getToastTemperature() {
        return this.toasting;
    }

    /**
     * Metodo.
     * @return regresa valor temperature.
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
     * @param toastedcasa is a variable.
     */
    public final void toast(final boolean toastedcasa) {
        this.toasted = toastedcasa;
    }
}