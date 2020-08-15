package iniekcja;

public class Body {
    boolean headake;
    double bodyTemperature;


    public Body(boolean headake, double bodyTemperature) {
        this.headake = headake;
        this.bodyTemperature = bodyTemperature;
    }

    public boolean isHeadake() {
        return headake;
    }

    public void setHeadake(boolean headake) {
        this.headake = headake;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }
}
