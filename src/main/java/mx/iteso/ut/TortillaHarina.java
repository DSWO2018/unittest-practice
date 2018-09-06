package mx.iteso.ut;
/** Clase Tortilla Harina.*/
public class TortillaHarina implements Tortilla {
    /** Variable toasted.*/
    private boolean toasted;
    /** Variable temperature.*/
    private int temperature;
    /** Variable toasting.*/
    private final int toasting = 20;

    /** Funcion isToasted @return boolean.*/
    public final boolean isToasted() {
        return toasted;
    }
    /** Funcion getToastTemperature @return toasting.*/
    public final int getToastTemperature() {
        return toasting;
    }
    /** Funcion getCurrentTemperature @return int.*/
    public final int getCurrentTemperature() {
        return temperature;
    }
    /** Funcion setCurrentTemperature.*/
    /**@param tempp .*/
    public final void setCurrentTemperature(final int tempp) {
        this.temperature = tempp;
    }
    /** Funcion toast.*/
    /**@param toastedp .*/
    public final void toast(final boolean toastedp) {
        this.toasted = toastedp;
    }
}
