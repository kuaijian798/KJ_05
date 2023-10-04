package cn.xmcu.test;

public class Manager extends Employee{
    private String  department;

    //空构造器
    public Manager(){
    }

    //子类含参构造器
    public Manager(String department) {
        this.department = department;
    }

    //调用父类含参构造器
    public Manager(String name, double basicPay, String address, String department) {
        super(name, basicPay, address);
        this.department = department;
    }

    //get
    public String getDepartment() {
        return department;
    }

    //set
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 自定义showAll方法，自带属性（department）连带父类属性一并输出
     */
    public void showAll(){
        System.out.println(super.show() + "部门：" + this.getDepartment());
    }

}
