package mx.iteso.ut;
/**Clase tortilla Maiz. */
public class TortillaMaiz implements Tortilla {
    /**variable para saber si la tortilla esta tostada. */
    private boolean toasted;
    /**Variable para la temperatura. */
    private int temperature;
    /**Variable para el tostado. */
    private int toasting = MAX_TOASTING_TEMP_MAIZ;
    /**Metodo para saber si la tortilla esta tostada @return . */
    public final boolean isToasted() {
        return this.toasted;
    }
    /**Método para obtener la temperatura de tostado @return . */
    public final int getToastTemperature() {
        return this.toasting;
    }
    /**Método para obtener la temperatura actual @return . */
    public final int getCurrentTemperature() {
        return this.temperature;
    }
    /**Método para definir la temperatura actual @param temp . */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**Método para verificar si la tortilla está tostada @param tstd . */
    public final void toast(final boolean tstd) {
        this.toasted = tstd;
    }
}
