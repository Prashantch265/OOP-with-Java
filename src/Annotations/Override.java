package Annotations;

class Animal{
    void eat(){
        System.out.println("Eat");
    }
}
class Dog extends Animal{
    @java.lang.Override
    void eat(){
        System.out.println("Eat");
    }
}

public class Override {
    public static void main(String[] args){
        Animal obj = new Dog();
        obj.eat();
    }
}
