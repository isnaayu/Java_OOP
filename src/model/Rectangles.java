package model;

public class Rectangles extends Shape{
    private Double length;
    private Double width;

    public Rectangles(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calculateArea() {
        return this.length*this.width;
    }

    @Override
    public String display(String messages) {
        return super.display(messages);
    }
}
