package mx.iteso.ut;
/**
 * Interfaz tortilla.
 */
public interface Tortilla {

    /**
     * Esta tostada.
     * @return regresa verdadero si es tostada
     */
    boolean isToasted();

    /**
     * Temperatura de la tostada.
     * @return la temperatura
     */
    int getToastTemperature();

    /**
     * Temperatura actual.
     * @return  la temperatura
     */
    int getCurrentTemperature();

    /**
     * Poner la temperatura indicada.
     * @param temp valor a modificar
     */
    void setCurrentTemperature(int temp);

    /**
     * Tostar.
     * @param toasted Valor a modificar
     */
    void toast(boolean toasted);

}
