
/*请你创建一个 Java 项目，其中至少包含：

一个主类，里面有 main 方法作为程序入口
一个 Person 类
然后完成下面的问题：

为 Person 类添加构造方法，并实现“复制对象”的效果。
请说明你的构造方法是否用到了 this，如果用了，它在这里起什么作用。
在 main 方法中创建至少一个 Person 对象，并给对象赋值。
请用自己的话解释“类”和“对象”的关系。*/
package Task3;
public class Person {
    String name;
    int age;
    //无参构造方法
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    //有参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        //this 方法调用，用于调用类中的其他构造方法
    }
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
