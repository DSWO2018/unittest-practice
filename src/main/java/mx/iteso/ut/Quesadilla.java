/**
 * Paquete de trabajo para clases de comida.
 * @since 1.0
 * @author Luis Fernando Palafox.
 * @version 1.1
 */
package mx.iteso.ut;

/**
 * Clase para preparar quesadillas.
 */
public class Quesadilla {
    /**
     * Variable para queso.
     */
    private Queso queso;
    /**
     * Variable para tortilla.
     */
    private Tortilla tortilla;
    /**
     * Variable para heatLevel.
     */
    private int heatLevel;

    /**
     * Se prepara la quesadilla.
     *
     * @return un string de que tan buena esta la quesadilla.
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
     * Se prepara algo 2 tostadas.
     *
     * @return aun no se implementa.
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
     * Se regresa el queso.
     *
     * @return queso.
     */
    public final Queso getQueso() {
        return queso;
    }

    /**
     * Se da el queso.
     *
     * @param quesoSet se específica el queso a usar
     */
    public final void setQueso(final Queso quesoSet) {
        this.queso = quesoSet;
    }

    /**
     * Se regresa la tortilla.
     *
     * @return aun no se implementa.
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Se da  la tortilla.
     *
     * @param tortillaSet se específica la tortilla
     */
    public final void setTortilla(final Tortilla tortillaSet) {
        this.tortilla = tortillaSet;
    }

    /**
     * Se regresa  el nivel de calor.
     *
     * @return heatLevel
     */
    public final int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Se da  el nivel de calor.
     *
     * @param heatLevelSet se específica el nivel de calor
     */
    public final void setHeatLevel(final int heatLevelSet) {
        this.heatLevel = heatLevelSet;
    }
}
