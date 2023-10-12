public class Main {
    public static void main(String[] args) {
        Manufacture toyota = new Manufacture();
        toyota.setName("Toyota");
        toyota.setLocation("Japan");

        Engine combustionEngine = new CombustionEngine();
        Engine electricEngine = new ElectricEngine();
        Engine hybridEngine = new HybridEngine();

        ICEV icev = new ICEV(toyota, combustionEngine);
        BEV bev = new BEV(toyota, electricEngine);
        HybridV hybridV = new HybridV(toyota, hybridEngine);

        Vehicle[] vehicles = { icev, bev, hybridV };

        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
            System.out.println();
        }
    }
}