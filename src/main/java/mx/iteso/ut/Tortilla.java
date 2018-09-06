package mx.iteso.ut;
/** Interface Tortilla.*/
public interface Tortilla {
    /**Funcion isMelted.*/
    /**@return */
    boolean isToasted();
    /**Funcion getToastTemperature @return int.*/
    int getToastTemperature();
    /**Funcion getCurrentTemperature @return int.*/
    int getCurrentTemperature();
    /**Funcion setCurrentTemperature.*/
    /**@param temp .*/
    void setCurrentTemperature(int temp);
    /**Funcion setToast */
    /**@param toasted .*/
    void toast(boolean toasted);

}
