public class Main {
    public static void main(String[] args) {
    Ship KarlVinson = new AircraftCarrier("Karl Vinson","USA");
    System.out.println("Aircraft Carrier:");
    KarlVinson.Name();
    ((AircraftCarrier) KarlVinson).Country();


    }
}
