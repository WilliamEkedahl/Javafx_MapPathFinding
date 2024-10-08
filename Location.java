import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Location extends Circle {
    private String cityName;
    private double xcor;
    private double ycor;


    public Location(String name, double xcor, double ycor){
        super(xcor, ycor, 10, Color.BLUE );
        this.cityName = name;
        this.xcor = xcor;
        this.ycor = ycor;
      //  relocate(xcor, ycor);


    }

    public double getYcor() {
        return ycor;
    }

    public double getXcor() {
        return xcor;
    }

    public String getCityName() {
        return cityName;
    }
}

