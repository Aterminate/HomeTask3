public class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("HybridV Characteristics:");
        System.out.println("Manufacture: " + getManufacture().getName());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}
