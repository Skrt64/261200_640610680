public class AirPurifier {
    String color;
    String make;
    String status;
    int quality;
    int temp;
    int filter;
    void displayAirPurifier(){
        System.out.println("color: " + color);
        System.out.println("make by: " + make);
        System.out.println("status: " + status);
        System.out.println("air quality: " + quality);
        System.out.println("temperature: " + temp + " °C");
        System.out.println("filter quality: " + filter + " %");
    }

    AirPurifier(String _color, String _make, String _status, int _quality, int _temp, int _filter) {
        this.color = _color;
        this.make = _make;
        this.status = _status;

        if(status == "off"){
            this.quality = 0;
            this.temp = 0;
            this.filter = 0;
        }else {
            this.quality = _quality;
            this.temp = _temp;
            this.filter = _filter;
        }
    }

    AirPurifier(){
        this("-","-","off",0,0,0);
    }
}
