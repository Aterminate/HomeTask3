public class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("ICEV Characteristics:");
        System.out.println("Manufacture: " + getManufacture().getName());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}
