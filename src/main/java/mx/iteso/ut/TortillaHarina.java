package mx.iteso.ut;
/**
 * Clase tortillaharina que implementa tortilla.
 */
public class TortillaHarina implements Tortilla {

    /**
     * Temperatura en la que se derrite.
     */
    private final int melttemp = 20;

    /**
     * Tostada.
     */
    private boolean toasted;

    /**
     * Temperatura.
     */
    private int temp;

    /**
     * Temperatura de tostamiento.
     */
    private int toasting = melttemp;

    /**
     * Esta tostada.
     * @return regresa verdadero si es tostada
     */
    public boolean isToasted()
    {
        return toasted;
    }

    /**
     * Temperatura de la tostada.
     * @return la temperatura
     */
    public int getToastTemperature()  {
        return toasting;
    }

    /**
     * Temperatura actual.
     * @return  la temperatura
     */
    public int getCurrentTemperature() {
        return temp;
    }

    /**
     * Poner la temperatura indicada.
     * @param tempera valor a modificar
     */
    public void setCurrentTemperature(final int tempera) {
        this.temp = tempera;
    }

    /**
     * Tostar.
     * @param toasteded Valor a modificar
     */
    public void toast(final boolean toasteded) {
        this.toasted = toasteded;
    }
}
