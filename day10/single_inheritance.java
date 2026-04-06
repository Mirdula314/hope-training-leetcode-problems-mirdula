class Animal{
    void eat(){
        System.out.println("animal is eating");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("cat is meowing");
    }
}
public class Main{
    public static void main(String[] args) {
        cat c = new cat();
        c.eat();
        c.sound();
    }
}