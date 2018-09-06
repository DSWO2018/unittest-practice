package mx.iteso.ut;
/** Interface Queso.*/
public interface Queso {
    /**Funcion isMelted @return boolean.*/
    boolean isMelted();

    /**Funcion getCurrentTemperature @return int.*/
    int getCurrentTemperature();

    /**Funcion getMeltingTemperature @return int.*/
    int getMeltingTemperature();

    /**Funcion setCurrentTemperature */
    /**@param temp .*/
    void setCurrentTemperature(int temp);

    /**Funcion melt*/
    /**@param melted .*/
    void melt(boolean melted);
}
