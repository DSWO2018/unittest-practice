package mx.iteso.ut;



public class QuesoManchego implements Queso {

    boolean melted;
    int melting = 20;
    int temperature;


    public boolean isMelted() { return this.melted; }

    public int getCurrentTemperature() {
        return this.temperature;
    }

    public int getMeltingTemperature() {
        return this.melting;
    }

    public void setCurrentTemperature(int temp) {this.temperature= temp; }

    public void melt(boolean melted) {this.melted= melted; }
}