class Animal{
    void eat(){
        System.out.println("animal is eating");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat is meowing");
    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("dog is barking");
    }
}
public class Main{
    public static void main(String[] args) {
         Cat c=new Cat();
         c.eat();
         c.sound();
         Dog d=new Dog();
         d.eat();
         d.sound();
    }
}