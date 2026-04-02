public class Animal {
    private String name;
    private float weight;
    private int enclosure;
    public Animal(){}
    public Animal(String name, float weight, int enclosure){
        this.name = name;
        this.weight = weight;
        this.enclosure = enclosure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(int enclosure) {
        this.enclosure = enclosure;
    }

    public void walk(){
        this.enclosure++;
    }
    @Override
    public String toString() {
        return "Animal [nome = " + this.name + ", weight = " + this.weight + ", enclosure = " + this.enclosure + "]";
    }
}
