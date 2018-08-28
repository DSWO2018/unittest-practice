package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {
    boolean toasted;
    int temperature;
    int toasting = 20;

    public boolean isToasted() {
        return this.toasted;
    }

    public int getToastTemperature() {
        return this.toasting;
    }

    public int getCurrentTemperature() {
        return this.temperature;
    }

    public void setCurrentTemperature(int temp) {
        this.temperature = temp;
    }

    public void toast(boolean toasted) {
        this.toasted = toasted;
    }
}
