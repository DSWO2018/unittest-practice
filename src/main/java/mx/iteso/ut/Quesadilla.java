package mx.iteso.ut;
/** Clase Quesadilla.*/
public class Quesadilla {
    /** Variable queso.*/
    private Queso queso;
    /**Variable tortilla.*/
    private Tortilla tortilla;
    /** Variable heatLevel.*/
    private int heatLevel;
    /** Funcion prepareSingle @return String.*/
    public final String prepareSingle() {
        while (getQueso().getCurrentTemperature()
         < getQueso().getMeltingTemperature()
         && getTortilla().getCurrentTemperature()
         < getTortilla().getToastTemperature()) {
             getTortilla().setCurrentTemperature(
             getTortilla().getCurrentTemperature() + getHeatLevel());
             getQueso().setCurrentTemperature(
             getQueso().getCurrentTemperature() + getHeatLevel());
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
         } else if (getQueso().isMelted() && !getTortilla().isToasted()) {
             return "Good quesadilla";
         } else if (!getQueso().isMelted() && getTortilla().isToasted()) {
             return "Terrible quesadilla";
         }  else {
             return "You ran out of gas";
         }

    }
    /** Funcion getQueso @return Queso.*/
    public final Queso getQueso() {
        return queso;
    }
    /** Funcion setQueso.*/
    /** @param quesop .*/
    public final void setQueso(final Queso quesop) {
        this.queso = quesop;
    }
    /** Funcion getQueso @return Tortilla.*/
    public final Tortilla getTortilla() {
        return tortilla;
    }
    /** Funcion setTortilla.*/
    /** @param tortillap .*/
    public final void setTortilla(final Tortilla tortillap) {
        this.tortilla = tortillap;
    }
    /** Funcion getHeatLevel @return int.*/
    public final int getHeatLevel() {
        return heatLevel;
    }
    /** Funcion setHeatLevel.*/
    /** @param heatLevelp .*/
    public final void setHeatLevel(final int heatLevelp) {
        this.heatLevel = heatLevelp;
    }
}
