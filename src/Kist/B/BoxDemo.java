package Kist.B;

class Box{
    double length,height,breadth;
    public Box(){
        this.length=6;
        this.breadth=4;
        this.height=3;
    }
    void getVolume(double length,double breadth,double height){
        double volume = length*breadth*height;
        System.out.println("Volume= "+volume);
    }
}

class BoxWeight extends Box{
    double weight;
    public BoxWeight(double weight)
    {
        super();
        this.weight=weight;
    }
    void getWeight(){
        System.out.println(weight);
    }
}
public class BoxDemo {
    public static void main(String[] args){
        BoxWeight obj1 = new BoxWeight(5);
        BoxWeight obj2 = new BoxWeight(8);
        obj1.getWeight();
        obj2.getVolume(10,5,4);
    }
}
