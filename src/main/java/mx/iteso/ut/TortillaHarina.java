package mx.iteso.ut;

public class TortillaHarina implements Tortilla {

    boolean toasted;
    int toast = 10;
    int temperature;
    public boolean isToasted() {
        return this.toasted;
    }

    public int getToastTemperature() { return this.toast;
    }

    public int getCurrentTemperature() {
        return this.temperature;
    }

    public void setCurrentTemperature(int temp) {
        this.temperature = temp;

    }

    public void toast(boolean toasted) {this.toasted=toasted;

    }
}
