package model;

public class Car {

    private long id;
    private int year;
    private String model;
    private String color;

    public Car() {}

    public Car(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
