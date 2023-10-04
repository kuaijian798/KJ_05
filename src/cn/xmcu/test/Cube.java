package cn.xmcu.test;

public class Cube extends Rectangle{
    private double height;

    //空构造器
    public Cube(){
    }

    //子类含参构造器
    public Cube(double height) {
        this.height = height;
    }

    //调用父类含参构造器
    public Cube(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    //get
    public double getHeight() {
        return height;
    }

    //set
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 自定义getVolume方法，通过调用父类的getArea方法结合自带属性（height）计算输出体积
     */
    public void getVolume(){
        System.out.println("长方体的体积为：" + super.getArea() * this.height);
    }
}
