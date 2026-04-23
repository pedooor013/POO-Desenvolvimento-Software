public class Fish extends Animal{
    private byte waterType;

    public Fish() {
    }

    public Fish(String name, int paws, double speed, int localization, byte waterType) {
        super(name, paws, speed, localization);
        this.waterType = waterType;
    }

    public byte getWaterType() {
        return waterType;
    }

    public void setWaterType(byte waterType) {
        this.waterType = waterType;
    }

    @Override
    public String toString() {
        return  "Fish Info: \n" + super.toString() + " | Water Type: " + waterVerify();
    }

    private String waterVerify(){
        if(this.waterType == 0){
            return  "Freshwater";
        }else{
            return "Seawater";
        }
    }
}