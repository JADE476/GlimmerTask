# 面向对象，封装继承与多态

## 一：类、对象与构造方法



1. this关键字的使用

```java
public Person(String name, int age) {
    this.name = name;
    this.age = age;
```

解决参数和成员变量重名问题

```java
public Person(Person other) {
    this.name = other.name;
    this.age = other.age;
```

指向正在创建的新对象

2. 类和对象的关系

类(class)是一个概念模板，包括属性，行动等内容

对象是一个具象化的个体，相当于一个实际例子



## 二.访问修饰符、实例成员与静态成员



1. 为字段和方法补上你认为合适的访问修饰符。

2. 尝试在以下位置访问它们，并总结访问范围：

   - 当前类内部

     四种权限都可以

   - 同一个包下的其他类

     private不可以，其他都可以

   - 不同包下的类

     只有public可以访问

3. 说明 public、private、protected、默认访问权限分别代表什么。

   public:任何地方，任何包下面都可以访问

   private: 私有，只有当前类内部可以访问

   protected:受保护，当前类，同一个包下的类，不同包的子类都可以访问

   默认权限：不能跨包访问

   

4. 给 Person 增加一个静态变量，例如“当前已创建对象数量”。

5. 再增加一个静态方法，并解释：

   - 为什么静态方法可以直接通过类名调用

     static关键字让这个方法和类绑定，不需要依靠于某个对象

   - 为什么实例方法通常需要先创建对象

     必须要先创建出一个具体的对象，再对这个对象的属性进行处理

     ```java
     package Task3;
     public class Person {
         private String name;
         private int age;
         private static int count = 0;
     
         //无参构造方法
         public Person() {
             this.name = "Unknown";
             this.age = 0;
             count++;
         }
         //有参构造方法
         public Person(String name, int age) {
             this.name = name;
             this.age = age;
             count++;
             //this 方法
         }
         public Person(Person other) {
             this.name = other.name;
             this.age = other.age;
             count++;
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
     
         public static int getCount(){
             return count;
         }
     }
     ```



## 三：继承与代码复用

```java
public class Penguin extends Animal {

    public Penguin(String myName, int myId) {
        super(myName, myId);

    }

    public void eat(){
        System.out.println("penguin is eating fish");
    }
```

Mouse子类中没有重写 以示区别

```java
public class Mouse extends Animal{
    public Mouse(String myName, int myId) {
        super(myName, myId);
    }
```

4.解释：为什么Java不支持类的多继承？

如果允许一个类同时继承多个父类，当多个父类中拥有同名方法时，子类调用该方法会产生歧义（产生二义性冲突）