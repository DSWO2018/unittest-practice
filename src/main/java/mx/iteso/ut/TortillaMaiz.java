package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {
    boolean toasted;
    int temp;
    int toasting = 21;
    public boolean isToasted()
    {
        return toasted;
    }

    public int getToastTemperature()
    {
        return toasting;
    }

    public int getCurrentTemperature()
    {
        return temp;
    }

    public void setCurrentTemperature(int temp) {
        this.temp =temp;
    }

    public void toast(boolean toasted) {
        this.toasted = toasted;
    }
}
