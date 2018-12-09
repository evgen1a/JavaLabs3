
public class AircraftCarrier  extends WarShip {

    String name;
    String country;


    AircraftCarrier (String name, String country){
       this.name = name;
       this.country = country;
    }

    public void name() {
        System.out.println("Aircraft carrier name " + name);
    }

    @Override
    public void Country() {
        System.out.println("The country of manufacture of the aircraft carrier " + country);
    }

}
