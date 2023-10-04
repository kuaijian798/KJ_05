package cn.xmcu.test;

public class EmployeeService {
    public static void main(String[] args) {
        Manager manager = new Manager("manager",100,"思明区","管理部门");
        manager.showAll();

        Director director = new Director("director",200,"集美区","20");
        director.showAll();
    }
}
