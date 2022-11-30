public class AirPurifier {
    String color;
    String make;
    int quality;
    int temp;
    int filter;
    void displayAirPurifier(){
        System.out.println("color: " + color);
        System.out.println("make by: " + make);
        System.out.println("air quality: " + quality);
        System.out.println("temperature: " + temp + " °C");
        System.out.println("filter quality: " + filter + " %");
    }

    AirPurifier(String _color, String _make, int _quality, int _temp, int _filter) {
        this.color = _color;
        this.make = _make;
        this.quality = _quality;
        this.temp = _temp;
        this.filter = _filter;
    }

    AirPurifier(){
        this("white","home made",0,30,100);
    }
}
