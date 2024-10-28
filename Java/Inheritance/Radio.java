package Inheritance;

public class Radio extends ElectronicDevice {

    private String brand;
    private Double[] channels;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double[] getChannels() {
        return channels;
    }

    public void setChannels(Double[] Channels) {
        this.channels = channels;
    }

    public Radio(){}

    public Radio(Boolean screen, String brand, Double[] channels) {
        super(screen);
        this.brand = brand;
        this.channels = channels;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "brand='" + brand + '\n' +
                ", channels=" + channels + '\n' +
                ", " + super.isScreen() +'}';
    }

    @Override
    public void turnOn(){
        System.out.println("Turning on..... a radio");
    }
}