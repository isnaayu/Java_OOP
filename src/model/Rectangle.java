package model;

public class Rectangle {
    protected Integer length;
    protected Integer width;

    public Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public Integer getSurface() {
        return this.length*this.width;
    }

    public Integer getRoundB() {
        return 2*(this.length+this.width);
    }

    public Integer getLenght() {
        return length;
    }

    public void setLenght(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

}
