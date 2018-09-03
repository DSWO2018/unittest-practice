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
     * @return el valor de que tan buena quedo la quesadilla.
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
     * @return regresa el valor de que tan buena quedo la quesadilla doble.
     */
    public final String prepareDouble() {
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
     * @return el valor de queso.
     */
    public final Queso getQueso() {
        return queso;
    }

    /**
     * Metodo.
     * @param quesoLocal is a variable.
     */
    public final void setQueso(final Queso quesoLocal) {
        this.queso = quesoLocal;
    }

    /**
     * Metodo.
     * @return el valor de tortilla.
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Metodo.
     * @param tortillaLocal is a variable.
     */
    public final void setTortilla(final Tortilla tortillaLocal) {
        this.tortilla = tortillaLocal;
    }

    /**
     * Metodo.
     * @return el valor de heatlevel.
     */
    public final int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Metodo.
     * @param heatLevelLocal is a variable.
     */
    public final void setHeatLevel(final int heatLevelLocal) {
        this.heatLevel = heatLevelLocal;
    }
}
