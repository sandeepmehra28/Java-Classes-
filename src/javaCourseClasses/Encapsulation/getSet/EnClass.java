package javaCourseClasses.Encapsulation.getSet;


import java.util.Arrays;

//Encapsultaion using getter and setter
class EnClass {
    private String model;
    private int price;
    private String color;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
