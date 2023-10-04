package fj.xm;
//父类，超类，基类
public class Person {
    private String name;

    //protected int age; //不建议
    private int age;

    public Person(){
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    //使子类变相访问private的age
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //自定义方法，输出Name
    // 子类可以调用父类的public,protected方法，不可调用private
    // 虽然二者都可调用，但public作用太广，其他包的类也可以调用访问，而protected仅同一包内可访问
    //protected目的：专为子类提供该方法
    protected void printName(){
        System.out.println("name=" + name);
    }
}
