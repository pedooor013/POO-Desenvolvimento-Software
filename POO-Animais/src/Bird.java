public class Bird extends Animal {
    public Bird() {
    }

    public Bird(String name, int paws, double speed, int localization) {
        super(name, paws, speed, localization);
    }

    @Override
    public String toString() {
        return "Bird Info: \n" + super.toString();
    }

    @Override
    public void move(){
        System.out.println("Bird is moving!");
        super.setLocalization(super.getLocalization() + 3);
    }
}
