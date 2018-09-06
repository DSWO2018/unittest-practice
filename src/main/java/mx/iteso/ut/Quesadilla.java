package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    /** JavaDoc comment. */
    private Queso queso;
    /** JavaDoc comment. */
    private Tortilla tortilla;
    /** JavaDoc comment. */
    private int heatLevel;
    /** JavaDoc comment. */
    public final String prepareSingle() {
     while (getQueso().getCurrentTemperature()
             < getQueso().getMeltingTemperature()
             && getTortilla().getCurrentTemperature()
             < getTortilla().getToastTemperature()) {
         getTortilla().setCurrentTemperature(
                 getTortilla().getCurrentTemperature()
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
     }
     else {
         return "You ran out of gas";
     }
    }
    /** JavaDoc comment. */
    public final String prepareDouble() {
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

        return "";
    }
    /** JavaDoc comment. */
    public final Queso getQueso() {
        return queso;
    }
    /** JavaDoc comment. */
    public final void setQueso(final Queso xqueso) {
        this.queso = xqueso;
    }

    /** JavaDoc comment. */
    public final Tortilla getTortilla() {
        return tortilla;
    }
    /** JavaDoc comment. */
    public final void setTortilla(final Tortilla xtortilla) {
        this.tortilla = xtortilla;
    }
    /** JavaDoc comment. */
    public final int getHeatLevel() {
        return heatLevel;
    }
    /** JavaDoc comment. */
    public final void setHeatLevel(final int xheatLevel) {
        this.heatLevel = xheatLevel;
    }
}
