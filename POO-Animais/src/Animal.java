public class Animal {
    private String name;
    private int paws;
    private double speed;
    private int localization;

    public Animal(){}

    public Animal(String name, int paws, double speed, int localization) {
        this.name = name;
        this.paws = paws;
        this.speed = speed;
        this.localization = localization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getLocalization() {
        return localization;
    }

    public void setLocalization(int localization) {
        this.localization = localization;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " | Paws: " +this.paws + " | Speed: " + this.speed + " | Localization: " + this.localization;
    }
}
