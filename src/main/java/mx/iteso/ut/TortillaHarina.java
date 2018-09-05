package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
    boolean toasted;
    int temperature;
    int toasting = 15;

    public boolean isToasted() {
        return this.toasted;
    }

    public int getCurrentTemperature() {
        return this.temperature;
    }

    public int getToastTemperature() {
        return this.toasting;
    }

    public void setCurrentTemperature(int temp) {
        this.temperature = temp;
    }

    public void toast(boolean toasted) {
        this.toasted = toasted;
    }
}