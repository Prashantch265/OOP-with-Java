package Filehandling;

import java.io.*;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;

class Person implements Serializable{
    int age;
    String name;
    public Person(int age, String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return "Age"+age+"\n"+"Name"+name;
    }
}
public class SerializableDemo {
    public static void main(String[] args){
        try{
            FileOutputStream f1 = new FileOutputStream("d:/Assignment/SerializableDemo.txt");
            ObjectOutputStream obj1 = new ObjectOutputStream(f1);
            Person p = new Person(18,"Prashant");
            obj1.writeObject(p);
            obj1.close();
            FileInputStream f2 = new FileInputStream("d:/Assignment/SerializableDemo.txt");
            ObjectInputStream obj2 = new ObjectInputStream(f2);
            System.out.println((Person)obj2.readObject());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
