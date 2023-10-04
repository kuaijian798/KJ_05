package fj.xm;

//继承父类Person
public class Student extends Person{

    private String stuId;

    //空构造器
    public Student(){
    }

    //子类构造器无法直接继承父类的有参构造器
    //子类构造器使用super关键字调用父类的构造器来初始化仅父类拥有的私有字段变量
    //super语句必须在第一行
    public Student(String name){
        super(name);
    }

    public Student(String name, String stuId) {
        super(name);
        this.stuId = stuId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
    //自定义方法，输出Id
    public void printId(){
        System.out.println("stuId=" + stuId);
    }
    //子类调用父类的protected方法
    public void printAll(){
        printName();
        printId();
        //子类调用父类的protected属性
        //System.out.println("age=" + super.age);
        //同样效果
        System.out.println("age=" + super.getAge());
    }


}
