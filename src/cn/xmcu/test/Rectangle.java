package cn.xmcu.test;

public class Rectangle {
    private double width;
    private double length;

    //空构造器
    public Rectangle(){
    }

    //父类含参构造器
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //get
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //set
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 自定义getArea方法，求矩形面积
     * @return
     */
    protected double getArea(){
        return this.width * this.length;
    }
}
