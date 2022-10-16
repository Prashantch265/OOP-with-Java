package Practice;
class Objects{
    static int c=0;
    public Objects(){
        c++;
        System.out.println(c);
    }
}
public class ObjectCount {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            Objects obj1 = new Objects();
        }
    }
}
