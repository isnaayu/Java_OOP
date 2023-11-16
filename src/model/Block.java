package model;

public class Block extends Rectangle{
    private Integer height;

    public Block(Integer length, Integer width, Integer height) {
        super(length, width);
        this.height = height;
    }

    public Integer getVolumeBlock() {
        return length*width*height;
    }

    public Block() {
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
