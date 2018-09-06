/**
 * Preparar una quesadilla.
 * @since 1.0
 * @author Josue Montante.
 * @version 1.1
 */
package mx.iteso.ut;

/**
 * Clase de quesadillitas.
 */
public class Quesadilla {
    /**
     * Variable queso.
     */
    private Queso queso;
    /**
     * Variable tortilla.
     */
    private Tortilla tortilla;
    /**
     * Variable heatLevel (nivel de calor).
     */
    private int heatLevel;

    /**
     * Se crea la quesadillita.
     *
     * @return  regresa un string de que tan ricolina esta la quesadilla.
     */
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
     * Se crean doble quesadillitas.
     *
     * @return no regresa nada, sin implementar.
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
     * Que tipo de queso.
     *
     * @return regresa el queso.
     */
    public final Queso getQueso() {
        return queso;
    }

    /**
     * Dice cual es el queso a usar.
     *
     * @param quesoSet especifica el queso a usar.
     */
    public final void setQueso(final Queso quesoSet) {
        this.queso = quesoSet;
    }

    /**
     * Cual tortilla.
     *
     * @return regresa tortilla.
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Que tortilla se va a usar.
     *
     * @param tortillaSet específica la tortilla a usar
     */
    public final void setTortilla(final Tortilla tortillaSet) {
        this.tortilla = tortillaSet;
    }

    /**
     * Cuan ardiente esta.
     *
     * @return regresa el nivel de calor
     */
    public final int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Prendeeeee el caloor.
     *
     * @param heatLevelSet cuan ardiente se va a poner esto
     */
    public final void setHeatLevel(final int heatLevelSet) {
        this.heatLevel = heatLevelSet;
    }
}
