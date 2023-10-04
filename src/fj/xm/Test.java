package fj.xm;

import org.omg.CORBA.PERSIST_STORE;

import javax.print.DocFlavor;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();//空构造器
        student.setName("蒯健");
        student.setStuId("22125050021");
        student.printName();
        student.printId();

        Student student1 = new Student("xmcu", "123456");//有参构造器
        student1.printAll();

        //判断子类是否属于父类
        System.out.println(student instanceof Person);//true
        if (student instanceof Person){
            //将子类对象强制转换为父类对象
            Person person = (Person)student;
            person.printName();
            //person.printId();转换后父类对象无该方法
        }

        Person person1 = new Person("123");
        System.out.println(person1 instanceof Student);//false
    }
}
