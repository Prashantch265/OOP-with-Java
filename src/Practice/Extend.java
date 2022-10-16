package Practice;

public class Extend {
    public static void main(String[] args){
        Results obj = new Results();
        obj.read();
        obj.calculate();
        obj.display();
    }
}

class Students{
    int r;
    void read(){
        this.r = 5;
    }
    void display(){
        System.out.println("Roll no. " + r);
    }
}

class Tests extends  Students{
    int sub1, sub2;
    void read(){
        super.read();
        this.sub1 = 35;
        this.sub2 = 33;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Sub1 mark "+ sub1 + "\n" + "Sub2 mark "+ sub2);
    }
}

class Results extends Tests{
    int total;
    void calculate(){
        this.total = super.sub1 + super.sub2;
    }
    void display(){
        super.display();
        System.out.println("Total " + total);
    }
}
