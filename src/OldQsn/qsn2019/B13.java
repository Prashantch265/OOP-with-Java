package OldQsn.qsn2019;

import java.util.Scanner;

class Book{
    String book_id, pages;
    void getData(String book_id,String pages){
        this.book_id = book_id;
        this.pages = pages;
    }
    void display(){
        System.out.println("Book_id = "+book_id+"\t"+"Pages = "+pages);
    }
}

class FictionBooks extends Book{
    String name;

    void getData(String name) {
        this.name = name;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Name = "+name);
    }
}

public class B13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FictionBooks obj = new FictionBooks();
        System.out.println("Enter Book_id and pages");
        obj.getData(sc.next(),sc.next());
        System.out.println("Enter Book name");
        obj.getData(sc.next());
        obj.display();
    }
}
