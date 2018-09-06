package mx.iteso.ut;

/**
 *  Tortilla es una interface.
 */
public interface Tortilla {

    /**
     * Metodo.
     * @return  toasted.
     */
     boolean isToasted();

    /**
     * Metodo.
     * @return  getToastTemperature.
     */
     int getToastTemperature();
    /**
     * Metodo.
     * @return  getCurrentTemperature.
     */
     int getCurrentTemperature();
    /**
     * metodo.
     * @param temp es una variable.
     */
     void setCurrentTemperature(int temp);

    /**
     * metodo.
     * @param toasted es una variable.
     */
     void toast(boolean toasted);

}
