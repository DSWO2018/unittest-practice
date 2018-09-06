package mx.iteso.ut;


/**
 * Hello world!
 *
 */
public class Quesadilla {
    /** Variable queso tipo Queso.*/
    private Queso queso;
   /** Variable tortilla tipo Tortilla.*/
    private Tortilla tortilla;
    /** Variable heatLevel.*/
    private int heatLevel;
    /**
     * @return
     * Funcion prepareSingle .*/
    public final String prepareSingle() {


     while (
             getQueso().getCurrentTemperature()
                     <
             getQueso().getMeltingTemperature()
                     &&
                     getTortilla().getCurrentTemperature()
                             <
                             getTortilla().getToastTemperature()) {
         getTortilla().setCurrentTemperature(
                 getTortilla().getCurrentTemperature()
                 + getHeatLevel());
         getQueso().setCurrentTemperature(
                 getQueso().getCurrentTemperature()
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
     * string.
     * @return     */
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
     * get queso.
     * @return     */
    public final Queso getQueso() {
        return queso;
    }
    /** set queso.
     * @param quesso */
    public final void setQueso(final Queso quesso) {
        this.queso = quesso;
    }

    /**
     *
     * Get tortilla.
     * @return */
    public final Tortilla getTortilla() {
        return tortilla;
    }
    /** Set tortilla.
     * @param tortillas */
    public final void setTortilla(final Tortilla tortillas) {
        this.tortilla = tortillas;
    }
    /** Get heal level.
     * @return */
    public final int getHeatLevel() {
        return heatLevel;
    }

    /**
     * set heat levvel.
     * @param heatLevels     */
    public final void setHeatLevel(final int heatLevels) {
        this.heatLevel = heatLevels;
    }
}
