package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**
     * Variable.
     */
    private Queso queso;
    /**
     * Variable.
     */
    private Tortilla tortilla;
    /**
     * Variable.
     */
    private int heatLevel;
    /**
     * Metodo.
     * @return el resultado de que tan rica esta la quesadilla.
     */
    public final String prepareSingle() {


     while (getQueso().getCurrentTemperature()
             < getQueso().getMeltingTemperature()
             && getTortilla().getCurrentTemperature()
                     < getTortilla().getToastTemperature()) {
         getTortilla().setCurrentTemperature(
                 getTortilla()
                         .getCurrentTemperature()
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
    /**
     * Metodo.
     * @return  el resultado de que tan rica esta la quesadilla doble.
     */
    public  final String prepareDouble() {
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

        return "";
    }

    /**
     * Metodo.
     * @return regresa el valor de queso.
     */
    public final Queso getQueso() {
        return queso;
    }
    /**
     * Metodo.
     * @param quesoCasa es una variable.
     */
    public final void setQueso(final Queso quesoCasa) {
        this.queso = quesoCasa;
    }

    /**
     * Metodo.
     * @return  valor tortilla.
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Metodo.
     * @param tortillaCasa es una variable.
     */
    public final void setTortilla(final Tortilla tortillaCasa) {
        this.tortilla = tortillaCasa;
    }

    /**
     * Metodo.
     * @return  el valor de heatLevel.
     */
    public final int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Metodo.
     * @param heatLevelCasa es una variable.
     */
    public final void setHeatLevel(final int heatLevelCasa) {
        this.heatLevel = heatLevel;
    }
}
