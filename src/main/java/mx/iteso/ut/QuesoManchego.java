package mx.iteso.ut;
/**Clase queso manchego .*/
public class QuesoManchego implements Queso {
    /**variabla para saber si está derretido  .*/
   private boolean melted;
    /**variable para la temperatura.*/
   private int temperature;
    /**variable de temperatura de derretido .*/
    private int melting = MAX_MEALT_TEMP_CHIHUAHUA;
    /**Método para saber si el queso esta derretidp @return .*/
    public final boolean isMelted() {
        return this.melted;
    }
    /**Método para saber la temperatura actual @return .*/
    public final int getCurrentTemperature() {
        return this.temperature;
    }
    /**Método para saber la temperatura a la que derretirá @return .*/
    public final int getMeltingTemperature() {
        return this.melting;
    }
    /**Método para definir la temperatura actual @param temp .*/
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**Método para definir si el queso ya esta derretido @param melt .*/
    public final void melt(final boolean melt) {
        this.melted = melt;
    }
}
