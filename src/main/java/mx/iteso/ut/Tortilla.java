package mx.iteso.ut;

/**
 * Interface Tortilla.
 */
public interface Tortilla {
    /**
     * @return
     * is toasted.*/
     boolean isToasted();
    /**
     * @return
     * get toast temperature.*/
     int getToastTemperature();
    /**
     * @return
     * get current temperature .*/
     int getCurrentTemperature();
    /**
     * @param temp
     * set current temperature.*/
    void setCurrentTemperature(int temp);
    /**
     * @param toasted
     * boolean*/
     void toast(boolean toasted);

}
