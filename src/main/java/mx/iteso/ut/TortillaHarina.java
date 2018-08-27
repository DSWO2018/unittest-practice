package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
    boolean toasted;
    int temperature;
    int toasting = 20;
    public boolean isToasted() {
        return toasted;
    }

    public int getToastTemperature() {
        return toasting;
    }

    public int getCurrentTemperature() {
        return temperature;
    }

    public void setCurrentTemperature(int temp) {
        this.temperature=temp;
    }

    public void toast(boolean toasted) {
        this.toasted=toasted;
    }
}
