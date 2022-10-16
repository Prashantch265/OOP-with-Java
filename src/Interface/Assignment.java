package Interface;

interface Shape{
    double getArea();
}
class Rectangle implements Shape{
    int l,b;
    public Rectangle(){
        this.l=3;
        this.b=2;
    }
    public double getArea(){
        return l*b;
    }
}
public class Assignment {
    public static void main(String[] args){
        Shape[] obj=new Shape[3];
        for (int i = 0; i <obj.length ; i++) {
            obj[i]=new Rectangle();
            System.out.println(obj[i].getArea());
        }
//        for (int i = 0; i < obj.length; i++) {
//            System.out.println(obj[i].);
//        }
    }
}
