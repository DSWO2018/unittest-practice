package mx.iteso.ut;

public class QuesoManchego implements Queso {
    boolean melted;
    int temp;
    int melting =18;

    public boolean isMelted() {
        return this.melted;
    }

    public int getCurrentTemperature()
    {
        return this.temp;
    }

    public int getMeltingTemperature()
    {
        return this.melting;
    }

    public void setCurrentTemperature(int temp) {
        this.temp = temp;
    }

    public void melt(boolean melted) {
        this.melted = melted;
    }
}
