package test;

public class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void study(String something){
        System.out.println(something);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(String name) {
//        super("name");
        this();
        this.name = name;
        super.name = name;
    }

    public void function1(){
        super.study("好好学习天天向上");
    }


}

class ts{

    public static void main(String[] args) {
        Student stu1 = new Student("z张三");
        System.out.println(stu1);
        stu1.function1();

    }
}
