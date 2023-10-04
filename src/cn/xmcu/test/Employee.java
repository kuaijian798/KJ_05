package cn.xmcu.test;

public class Employee {
    private String name;
    private double basicPay;
    private String address;

    //空构造器
    public Employee(){
    }

    //父类含参构造器
    public Employee(String name, double basicPay, String address) {
        this.name = name;
        this.basicPay = basicPay;
        this.address = address;
    }

    //get
    public String getName() {
        return name;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public String getAddress() {
        return address;
    }

    //set
    public void setName(String name) {
        this.name = name;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 自定义show方法
     * @return
     */
    protected String show(){
        return  "姓名：" + this.name + "\n" + "基本工资：" + this.basicPay + "\n" + "地址：" + this.address + "\n";
    }
}
