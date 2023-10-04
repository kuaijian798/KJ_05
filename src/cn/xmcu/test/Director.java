package cn.xmcu.test;

public class Director extends Employee{
    private String transportAllowance;

    //空构造器
    public Director(){
    }

    //子类含参构造器
    public Director(String transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    //调用父类含参构造器
    public Director(String name, double basicPay, String address, String transportAllowance) {
        super(name, basicPay, address);
        this.transportAllowance = transportAllowance;
    }

    //get
    public String getTransportAllowance() {
        return transportAllowance;
    }

    //set
    public void setTransportAllowance(String transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    /**
     * 自定义showAll方法，自带属性（transportAllowance）连带父类属性一并输出
     */
    public void showAll(){
        System.out.println(super.show() + "交通津贴：" + this.getTransportAllowance());
    }

}
