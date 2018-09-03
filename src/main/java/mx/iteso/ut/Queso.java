package mx.iteso.ut;
/**Interfaz queso.*/
public interface Queso {
    /**Variable queso manchego.*/
    int MAX_MEALT_TEMP_MANCHEGO = 20;
    /**Variable queso chihuahua.*/
    int MAX_MEALT_TEMP_CHIHUAHUA = 18;
    /**Método boolean para saber si el queso está derretido @return .*/
    boolean isMelted();
    /**Método para obtener la temperatura actual del queso @return .*/
    int getCurrentTemperature();
    /**Método para obtener la temperatura a
     * la que el queso se derrite @return .*/
    int getMeltingTemperature();
    /**Método para dar la tempertura actual @param temp .*/
    void setCurrentTemperature(int temp);
    /**Método para verificar si el queso esta derretido @param melted .*/
    void melt(boolean melted);
}
