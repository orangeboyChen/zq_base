/*
对于接口，从语法层面上讲：
接口只能有public abstract方法，和public static final变量
*/
public interface Fly {
    public abstract void fly();
}

public interface Swim {
    public abstract void swim();
}

/*
对于抽象类，从语法层面上讲：
它应当具有抽象方法
此外它可以具备普通类的所有属性
由于存在抽象方法，它不能用于创建对象，且它的子类必须实现这些抽象方法，否则这些子类也会成为抽象类
*/
abstract class Bird {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void born() {
        System.out.println("a bird was born");
    }

    public abstract void eat();
    public abstract void sleep();
}

/*
从语法层面上讲：
一个普通的类可以继承一个类，可以实现多个接口。
这个类必须实现抽象类和接口中的所有抽象方法。
*/
public class Seagull extends Bird implements Fly, Swim {
    public void eat() {
        System.out.println("seagull is eating");
    }
    public void fly() {
        System.out.println("seagull is flying");
    }
    public void swim() {
        System.out.println("seagull is swimming");
    }
}

/*
从设计思路层面上讲。
抽象类表达的是“是不是”的分类思想，它的子类是属于这个抽象大类的；
接口表达的是“能不能”的接口思想，实现这个接口的类具有这个接口所抽象的能力。

一类对象所共有的属性，其他类型不会有的属性，最好通过抽象类继承的方式来实现；
一类对象中一部分具有的能力，其他类型可能也会用到的能力，最好通过接口来实现。
修改抽象类可以修改它的所有子类属性，而修改接口则设计到所有实现类的代码修改。
*/
