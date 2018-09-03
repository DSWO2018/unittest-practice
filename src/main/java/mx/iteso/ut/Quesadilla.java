package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {

    /**
     * Variable tipo queso.
     */
    private Queso queso;
    /**Variable tipo tortilla.*/
    private Tortilla tortilla;
    /**Variable para el nivel de temperatura.*/
    private int heatLevel;
    /**Método para preparar una sola quesadilla @return .*/
    public final String prepareSingle() {


     while (getQueso().getCurrentTemperature()
             <
             getQueso().getMeltingTemperature()
             &&
             getTortilla().getCurrentTemperature()
              <
             getTortilla().getToastTemperature()) {
      getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature()
              + getHeatLevel());
      getQueso().setCurrentTemperature(getQueso().getCurrentTemperature()
                 + getHeatLevel());
         if (getTortilla().getCurrentTemperature()
                 >= getTortilla().getToastTemperature()) {
             getTortilla().toast(true);
         }
         if (getQueso().getCurrentTemperature()
                 >= getQueso().getMeltingTemperature()) {
             getQueso().melt(true);
         }
     }

     if (getQueso().isMelted() && getTortilla().isToasted()) {
         return "Perfect quesadilla";
     }
     if (getQueso().isMelted() && !getTortilla().isToasted()) {
         return "Good quesadilla";
     }
     if (!getQueso().isMelted() && getTortilla().isToasted()) {
         return "Terrible quesadilla";
     } else {
         return "You ran out of gas";
     }

    }
    /**Método para preparar quesadillas dobles @return .*/
    public final String prepareDouble() {
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

        return "";
    }
    /**Método para obtener tipo de queso @return .*/
    public final Queso getQueso() {
        return queso;
    }
    /**Método para declarar tipo de queso @param cheese .*/
    public final void setQueso(final Queso cheese) {
        this.queso = cheese;
    }
     /**Método para obtener tipo de tortilla @return .*/
    public final Tortilla getTortilla() {
        return tortilla;
    }
     /**Método para declarar tipo de tortilla @param tortila .*/
    public final void setTortilla(final Tortilla tortila) {
        this.tortilla = tortila;
    }
     /**Método para obtener la temperatura @return .*/
    public final int getHeatLevel() {
        return heatLevel;
    }
     /**Método para declarar la temperatura @param temp .*/
    public final void setHeatLevel(final int temp) {
        this.heatLevel = temp;
    }
}
