package mx.iteso.ut;
/**Interfaz tortilla.*/
public interface Tortilla {
    /**Variable tortilla maiz.*/
    int MAX_TOASTING_TEMP_MAIZ = 21;
    /**Variable tortilla harina.*/
    int MAX_TOASTING_TEMP_HARINA = 15;
    /**Método boolean para saber si la tortilla está tostado @return .*/
     boolean isToasted();
    /**Método para obtener la temperatura de la tortilla @return .*/
     int getToastTemperature();
    /**Método para saber la temperatura actual @return .*/
     int getCurrentTemperature();
    /**Método para dar la temperatura acutal @param temp .*/
     void setCurrentTemperature(int temp);
    /**Método para saber si la tortilla esta tostada @param toasted .*/
     void toast(boolean toasted);

}
