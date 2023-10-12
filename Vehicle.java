public abstract class Vehicle {
    private Manufacture manufacture;
    private Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void showCharacteristics();
}
