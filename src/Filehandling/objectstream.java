//package Filehandling;
//
//import java.io.*;
//
//class Person implements Serializable {
//    int id;
//    String name;
//    int age;
//
//    Person(int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//
//    public String toString() {
//        return "Person info:\n Name:" + this.name + " age:" + this.age + " id:" + id;
//    }
//
//}
//
//public class objectstream {
//    public static void main(String args[]) {
//        try {
//             FileOutputStream f = new FileOutputStream("d:/Assignment/Serializable.txt");
//             ObjectOutputStream oos = new ObjectOutputStream(f);
//              Person p[] = {
//                      new Person(1, "praveen", 10), new Person(2, "maharjan", 20)
//             };
//             oos.writeObject(new Person(1, "praveen", 10));
////             Person p = new Person(1, "hari", 34);
//             oos.writeObject(p);
//             oos.close();
//
////            FileInputStream fi = new FileInputStream("d:/Assignment/Serializable.txt");
////            ObjectInputStream oi = new ObjectInputStream(fi);
////            Person p1 = (Person) oi.readObject();
//
////            System.out.println(p1);
//            // Person[] p1 = (Person[]) oi.readObject();
//            // System.out.println(p1[1]);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}