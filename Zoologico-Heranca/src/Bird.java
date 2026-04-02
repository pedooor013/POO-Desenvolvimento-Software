public class Bird extends Animal {
    private String local;
    private boolean migration;

    public Bird(String local, boolean migration) {
        this.local = local;
        this.migration = migration;
    }

    public Bird() {
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public boolean isMigration() {
        return migration;
    }

    public void setMigration(boolean migration) {
        this.migration = migration;
    }

    @Override
    public void walk() {
        setEnclosure(getEnclosure() + 2);
    }

    @Override
    public String toString() {
        return "Bird [local = " + this.local + ", migration = " + this.migration + ", toString() = " + super.toString() + "]";
    }
}
